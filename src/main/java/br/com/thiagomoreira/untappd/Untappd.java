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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import br.com.thiagomoreira.untappd.gson.ResponseDeserializaer;
import br.com.thiagomoreira.untappd.model.Beer;
import br.com.thiagomoreira.untappd.model.Beers;
import br.com.thiagomoreira.untappd.model.Brewery;
import br.com.thiagomoreira.untappd.model.Response;
import br.com.thiagomoreira.untappd.model.User;
import br.com.thiagomoreira.untappd.security.UntappdAuthorizationInterceptor;
import br.com.thiagomoreira.untappd.service.BeerService;
import br.com.thiagomoreira.untappd.service.BreweryService;
import br.com.thiagomoreira.untappd.service.UserService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Untappd {

	protected BeerService beerService;
	protected BreweryService breweryService;
	protected UserService userService;

	public Untappd(String clientId, String clientSecret) {
		this(clientId, clientSecret, null, false);
	}

	public Untappd(String accessToken) {
		this(null, null, accessToken, false);
	}

	public Untappd(String clientId, String clientSecret, String accessToken,
			boolean debug) {
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.registerTypeAdapter(new TypeToken<Response>() {
		}.getType(), new ResponseDeserializaer()).create();

		OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();

		if (debug) {
			HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();

			interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

			httpClientBuilder.addInterceptor(interceptor);
		}

		httpClientBuilder.addInterceptor(new UntappdAuthorizationInterceptor(
				clientId, clientSecret, accessToken));

		Retrofit.Builder builder = new Retrofit.Builder();
		Retrofit retrofit = builder.baseUrl("https://api.untappd.com")
				.addConverterFactory(GsonConverterFactory.create(gson))
				.client(httpClientBuilder.build()).build();

		beerService = retrofit.create(BeerService.class);
		breweryService = retrofit.create(BreweryService.class);
		userService = retrofit.create(UserService.class);
	}

	public Brewery getBrewery(long breweryId) throws IOException {
		Call<Response> call = breweryService.getBrewery(breweryId);

		retrofit2.Response<Response> response = call.execute();
		Response response2 = response.body();

		if (response.isSuccessful()) {

			return (Brewery) response2.getResponse();
		} else {
			throw new IOException(response2.getMeta().getErrorDetail());
		}
	}

	public Beer getBeer(long beerId) throws IOException {
		Call<Response> call = beerService.getBeer(beerId);

		retrofit2.Response<Response> response = call.execute();
		Response response2 = response.body();

		if (response.isSuccessful()) {

			return (Beer) response2.getResponse();
		} else {
			throw new IOException(response2.getMeta().getErrorDetail());
		}
	}

	public Beers getBeerByUsername(String username, int offset, int limit)
			throws IOException {
		Call<Response> call = beerService.getBeersByUser(username, offset,
				limit);

		retrofit2.Response<Response> response = call.execute();
		Response response2 = response.body();

		if (response.isSuccessful()) {

			return (Beers) response2.getResponse();
		} else {
			throw new IOException(response2.getMeta().getErrorDetail());
		}
	}

	public User getUser(String username) throws IOException {
		Call<Response> call = userService.getUser(username);

		retrofit2.Response<Response> response = call.execute();
		Response response2 = response.body();

		if (response.isSuccessful()) {

			return (User) response2.getResponse();
		} else {
			throw new IOException(response2.getMeta().getErrorDetail());
		}
	}

}
