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
package br.com.thiagomoreira.untappd.gson;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import br.com.thiagomoreira.untappd.model.Beer;
import br.com.thiagomoreira.untappd.model.Brewery;
import br.com.thiagomoreira.untappd.model.Meta;
import br.com.thiagomoreira.untappd.model.Response;
import br.com.thiagomoreira.untappd.model.User;

public class ResponseDeserializaer implements JsonDeserializer<Response> {

	@Override
	public Response deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {

		JsonObject rootJsonObject = json.getAsJsonObject();
		Meta meta = context.deserialize(rootJsonObject.get("meta"), Meta.class);
		Response response = new Response();

		response.setMeta(meta);;

		JsonObject responseJsonObject = rootJsonObject.get("response")
				.getAsJsonObject();

		if (responseJsonObject.has("brewery")) {
			Brewery breweryInfo = context.deserialize(
					responseJsonObject.get("brewery"), Brewery.class);

			response.setResponse(breweryInfo);
		}
		if (responseJsonObject.has("beer")) {
			Beer beer = context.deserialize(responseJsonObject.get("beer"),
					Beer.class);

			response.setResponse(beer);
		}

		if (responseJsonObject.has("user")) {
			User user = context.deserialize(responseJsonObject.get("user"),
					User.class);

			response.setResponse(user);
		}

		return response;
	}
}
