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
import java.lang.annotation.Annotation;

import br.com.thiagomoreira.untappd.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import br.com.thiagomoreira.untappd.gson.ResponseDeserializer;
import br.com.thiagomoreira.untappd.security.UntappdAuthorizationInterceptor;
import br.com.thiagomoreira.untappd.service.BeerService;
import br.com.thiagomoreira.untappd.service.BreweryService;
import br.com.thiagomoreira.untappd.service.UserService;
import br.com.thiagomoreira.untappd.service.VenueService;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Untappd {

	protected BeerService beerService;
	protected BreweryService breweryService;
	protected UserService userService;
	protected VenueService venueService;
	protected Retrofit retrofit;

	public Untappd(String clientId, String clientSecret) {
		this(clientId, clientSecret, null, false);
	}

	public Untappd(String accessToken) {
		this(null, null, accessToken, false);
	}

	public Untappd(String clientId, String clientSecret, String accessToken,
			boolean debug) {
		this(clientId, clientSecret, accessToken, "https://api.untappd.com",
				debug);
	}

	Untappd(String clientId, String clientSecret, String accessToken,
			String baseUrl, boolean debug) {
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.registerTypeAdapter(new TypeToken<Response>() {
		}.getType(), new ResponseDeserializer()).create();

		OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();

		if (debug) {
			HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();

			interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

			httpClientBuilder.addInterceptor(interceptor);
		}

		httpClientBuilder.addInterceptor(new UntappdAuthorizationInterceptor(
				clientId, clientSecret, accessToken));

		Retrofit.Builder builder = new Retrofit.Builder();
		retrofit = builder.baseUrl(baseUrl)
				.addConverterFactory(GsonConverterFactory.create(gson))
				.client(httpClientBuilder.build()).build();

		beerService = retrofit.create(BeerService.class);
		breweryService = retrofit.create(BreweryService.class);
		userService = retrofit.create(UserService.class);
		venueService = retrofit.create(VenueService.class);
	}

	public Brewery getBrewery(long breweryId) throws IOException {
		Call<Response> call = breweryService.getBrewery(breweryId);

		retrofit2.Response<Response> response = call.execute();
		Response response2 = response.body();

		if (response.isSuccessful()) {

			return (Brewery) response2.getResponse();
		} else {
			throw handleError(response);
		}
	}

    /**
     * This will allow you to search exclusively for breweries in the Untappd system.
     *
     * @param breweryQuery (required) The search term that you want to search
     * @param offset       (optional) The numeric offset that you what results to start
     * @param limit        (optional) The number of results to return, max of 50, default is 25
     * @return {@link BrewerySearch}
     * @throws IOException IOException
     */
    public BrewerySearch brewerySearch(String breweryQuery, Integer offset, Integer limit) throws IOException {
        Call<Response> call = breweryService.searchBrewery(breweryQuery, offset, limit);
        retrofit2.Response<Response> response = call.execute();
        Response response2 = response.body();

        if (response.isSuccessful()) {
            return (BrewerySearch) response2.getResponse();
        } else {
            throw handleError(response);
        }
    }

	public Beer getBeer(long beerId) throws IOException {
		Call<Response> call = beerService.getBeer(beerId);

		retrofit2.Response<Response> response = call.execute();
		Response response2 = response.body();

		if (response.isSuccessful()) {

			return (Beer) response2.getResponse();
		} else {
			throw handleError(response);
		}
	}

	public Beers getBeersByUsername(String username, int offset, int limit)
			throws IOException {
		Call<Response> call = beerService.getBeersByUser(username, offset,
				limit);

		retrofit2.Response<Response> response = call.execute();
		Response response2 = response.body();

		if (response.isSuccessful()) {

			return (Beers) response2.getResponse();
		} else {
			throw handleError(response);
		}
	}

	public User getUser(String username) throws IOException {
		Call<Response> call = userService.getUser(username);

		retrofit2.Response<Response> response = call.execute();
		Response response2 = response.body();

		if (response.isSuccessful()) {

			return (User) response2.getResponse();
		} else {
			throw handleError(response);
		}
	}

	public Venue getVenue(int venueId) throws IOException {
		Call<Response> call = venueService.getVenue(venueId);

		retrofit2.Response<Response> response = call.execute();
		Response response2 = response.body();

		if (response.isSuccessful()) {

			return (Venue) response2.getResponse();
		} else {
			throw handleError(response);
		}
	}

	protected IOException handleError(retrofit2.Response<?> response) {
		Converter<ResponseBody, Response> converter = retrofit
				.responseBodyConverter(Response.class, new Annotation[0]);

		Response error;

		try {
			error = converter.convert(response.errorBody());
		} catch (IOException ioex) {
			return ioex;
		}

		return new IOException(error.getMeta().getErrorDetail());
	}
}
