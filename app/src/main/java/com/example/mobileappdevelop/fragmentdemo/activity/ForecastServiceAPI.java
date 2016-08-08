package com.example.mobileappdevelop.fragmentdemo.activity;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by AL ASIF on 8/8/2016.
 */
public interface ForecastServiceAPI {
    @GET("forecast16")
    Call<ForecastResponse> getAllPoet();
}
