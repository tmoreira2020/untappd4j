/**
 * Copyright © 2016 Thiago Moreira (tmoreira2020@gmail.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.thiagomoreira.untappd.service;

import br.com.thiagomoreira.untappd.model.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BreweryService {

    @GET("/v4/brewery/info/{breweryId}")
    Call<Response> getBrewery(@Path("breweryId") long breweryId);

    @GET("/v4/search/brewery")
    Call<Response> searchBrewery(@Query("q") String query,
                                 @Query("offset") Integer offset, @Query("limit") Integer limit);

}
