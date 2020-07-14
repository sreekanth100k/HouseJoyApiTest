package com.sreekanth.housejoy.mvvm;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyViewModel extends ViewModel {

    //this is the data that we will fetch asynchronously
    private MutableLiveData<Flipkart> list;

    //we will call this method to get the data
    public LiveData<Flipkart> getList() {
        //if the list is null
        if (list == null) {
            list = new MutableLiveData<Flipkart>();
            //we will load it asynchronously from server in this method
            loadList();
        }

        //finally we will return the list
        return list;
    }


    //This method is using Retrofit to get the JSON data from URL
    private void loadList() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);
        Call<Flipkart> call = api.getItems();


        call.enqueue(new Callback<Flipkart>() {
            @Override
            public void onResponse(Call<Flipkart> call, Response<Flipkart> response) {

                //finally we are setting the list to our MutableLiveData
                list.setValue(response.body());
            }

            @Override
            public void onFailure(Call<Flipkart> call, Throwable t) {

            }
        });
    }
}
