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

import org.junit.Assert;
import org.junit.Test;

import br.com.thiagomoreira.untappd.model.User;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okio.Buffer;

public class UntappdTest {

	@Test
	public void getUser() throws IOException {
		Untappd untappd = new Untappd(null, null, null,
				setup("/get-user-test.json"), true);

		String username = "tmoreira2020";
		User user = untappd.getUser(username);

		Assert.assertNotNull(user);
		Assert.assertEquals(username, user.getUserName());;
	}

	protected String setup(String jsonPath) throws IOException {
		MockWebServer server = new MockWebServer();
		Buffer buffer = new Buffer();

		buffer.readFrom(getClass().getResourceAsStream(jsonPath));

		server.enqueue(new MockResponse().setBody(buffer));

		server.start();

		return server.url("/").toString();
	}

}
