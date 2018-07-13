package com.chowbus.flickrphotos.api;


import com.chowbus.flickrphotos.api.response.InterestingPhotosResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FlickrService {

    @GET("rest")
    Call<InterestingPhotosResponse> getFlikrInterestingPhotos(@Query("method") String method,
                                                              @Query("api_key") String apiKey,
                                                              @Query("format") String format,
                                                              @Query("extras") String extras,
                                                              @Query("nojsoncallback") int value,
                                                              @Query("per_page") int count,
                                                              @Query("page") int page);
}
