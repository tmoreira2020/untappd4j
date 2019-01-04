/**
 * Copyright © 2016 Thiago Moreira (tmoreira2020@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.thiagomoreira.untappd;

import java.io.IOException;

import br.com.thiagomoreira.untappd.model.*;
import org.junit.Assert;
import org.junit.Test;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okio.Buffer;

public class UntappdTest {

	@Test
	public void getBeerNotFound() throws IOException {
		Untappd untappd = new Untappd(null, null, null, setup(
				"/get-beer-not-found.json", 404), true);

		long beerId = 2397083;
		try {
			untappd.getBeer(beerId);
		} catch (IOException ioex) {
			Assert.assertEquals("This Beer ID is invalid.", ioex.getMessage());
		}
	}

	@Test
	public void getBrewery() throws IOException {
		Untappd untappd = new Untappd(null, null, null, setup(
				"/get-brewery-test.json", 200), true);

		long breweryId = 207389;
		Brewery brewery = untappd.getBrewery(breweryId);

		Assert.assertNotNull(brewery);
		Assert.assertEquals(breweryId, brewery.getBreweryId());;
	}

	@Test
	public void searchBrewery() throws IOException {
		Untappd untappd = new Untappd(null, null, null, setup(
				"/get-search-brewery.json", 200), true);

		String query = "grist";
		BrewerySearch brewerySearch = untappd.brewerySearch(query, null, null);

		Assert.assertNotNull(brewerySearch);
		Assert.assertEquals(query, brewerySearch.getTerm());

	}

	@Test
	public void getBeersByUsername() throws IOException {
		Untappd untappd = new Untappd(null, null, null, setup(
				"/get-beers-by-username-test.json", 200), true);

		Beers beers = untappd.getBeersByUsername("tmoreira2020", 0, 50);

		Assert.assertEquals(28, beers.getCount());
	}

	@Test
	public void getUser() throws IOException {
		Untappd untappd = new Untappd(null, null, null, setup(
				"/get-user-test.json", 200), true);

		String username = "tmoreira2020";
		User user = untappd.getUser(username);

		Assert.assertNotNull(user);
		Assert.assertEquals(username, user.getUserName());;
	}

	@Test
	public void getVenue() throws IOException {
		Untappd untappd = new Untappd(null, null, null, setup(
				"/get-venue-test.json", 200), true);

		int venueId = 6781864;
		Venue venue = untappd.getVenue(venueId);

		Assert.assertNotNull(venue);
		Assert.assertEquals(venueId, venue.getVenueId());;
	}

	protected String setup(String jsonPath, int code) throws IOException {
		MockWebServer server = new MockWebServer();
		Buffer buffer = new Buffer();

		buffer.readFrom(getClass().getResourceAsStream(jsonPath));

		MockResponse response = new MockResponse();

		response.setBody(buffer);
		response.setResponseCode(code);

		server.enqueue(response);

		server.start();

		return server.url("/").toString();
	}

}
