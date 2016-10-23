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

	public UntappdAuthorizationInterceptor(String clientId, String clientSecret) {
		this.clientId = clientId;
		this.clientSecret = clientSecret;
	}

	public Response intercept(Chain chain) throws IOException {
		Request original = chain.request();

		Builder builder = original.url().newBuilder();
		HttpUrl httpUrl = builder.addQueryParameter("client_id", clientId)
				.addQueryParameter("client_secret", clientSecret).build();
		Request request = original.newBuilder().url(httpUrl)
				.header("Accept", "application/json")
				.method(original.method(), original.body()).build();

		Response response = chain.proceed(request);

		return response;
	}
}
