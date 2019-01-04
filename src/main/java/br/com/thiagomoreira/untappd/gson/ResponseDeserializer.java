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

import br.com.thiagomoreira.untappd.model.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class ResponseDeserializer implements JsonDeserializer<Response> {

	@Override
	public Response deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {

		JsonObject rootJsonObject = json.getAsJsonObject();
		Meta meta = context.deserialize(rootJsonObject.get("meta"), Meta.class);
		Response response = new Response();

		response.setMeta(meta);

		JsonElement responseJsonElement = rootJsonObject.get("response");
		if (responseJsonElement.isJsonObject()) {
			JsonObject responseJsonObject = responseJsonElement
					.getAsJsonObject();


			if (responseJsonObject.has("brewery") && responseJsonObject.has("engine")) {
				BrewerySearch breweryInfo = context.deserialize(
						responseJsonObject, BrewerySearch.class);

				response.setResponse(breweryInfo);
			}
			if (responseJsonObject.has("brewery") && !responseJsonObject.has("engine")) {
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

			if (responseJsonObject.has("beers")) {
				Beers beers = context.deserialize(
						responseJsonObject.get("beers"), Beers.class);

				response.setResponse(beers);
			}

			if (responseJsonObject.has("venue")) {
				Venue venue = context.deserialize(
						responseJsonObject.get("venue"), Venue.class);

				response.setResponse(venue);
			}
		} else if (responseJsonElement.isJsonArray()) {
			JsonArray responseJsonArray = responseJsonElement.getAsJsonArray();
			if (responseJsonArray.size() == 0) {
				response.setResponse(new Object[0]);
			} else {
				throw new JsonParseException("Unable to deserialize "
						+ responseJsonArray.getAsString());
			}
		}

		return response;
	}
}
