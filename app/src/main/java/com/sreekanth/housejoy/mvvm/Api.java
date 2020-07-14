package com.sreekanth.housejoy.mvvm;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://dummyurl.com/getList";

    @GET("items")
    Call<Flipkart> getItems();
}
