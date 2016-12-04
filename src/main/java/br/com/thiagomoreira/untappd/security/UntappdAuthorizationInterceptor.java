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
package br.com.thiagomoreira.untappd.security;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class UntappdAuthorizationInterceptor implements Interceptor {

	protected String clientId;
	protected String clientSecret;
	protected String accessToken;

	public UntappdAuthorizationInterceptor(String clientId,
			String clientSecret, String accessToken) {
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.accessToken = accessToken;
	}

	public Response intercept(Chain chain) throws IOException {
		Request original = chain.request();
		Builder builder = original.url().newBuilder();
		HttpUrl httpUrl = null;

		if (accessToken != null && accessToken.length() > 0) {
			httpUrl = builder.addQueryParameter("access_token", accessToken)
					.build();
		} else {
			httpUrl = builder.addQueryParameter("client_id", clientId)
					.addQueryParameter("client_secret", clientSecret).build();
		}
		Request request = original.newBuilder().url(httpUrl)
				.header("Accept", "application/json")
				.method(original.method(), original.body()).build();

		Response response = chain.proceed(request);

		return response;
	}
}
