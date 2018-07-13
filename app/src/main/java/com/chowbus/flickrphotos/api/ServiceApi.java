package com.chowbus.flickrphotos.api;

import android.support.annotation.NonNull;

import com.chowbus.flickrphotos.Global;
import com.chowbus.flickrphotos.api.response.InterestingPhotosResponse;
import com.chowbus.flickrphotos.api.response.ServerErrorResponse;
import com.chowbus.flickrphotos.model.Photo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.chowbus.flickrphotos.api.ServerConfig.API_KEY;
import static com.chowbus.flickrphotos.api.ServerConfig.COUNT_FOR_PAGENATION;
import static com.chowbus.flickrphotos.api.ServerConfig.EXTRAS;
import static com.chowbus.flickrphotos.api.ServerConfig.FORMAT_JSON;
import static com.chowbus.flickrphotos.api.ServerConfig.METHOD_INTERESTINGNES;
import static com.chowbus.flickrphotos.api.ServerConfig.MSG_NETWORK_ERROR;
import static com.chowbus.flickrphotos.api.ServerConfig.MSG_SERVER_ERROR;
import static com.chowbus.flickrphotos.api.ServerConfig.SERVER_ADDRESS_PROD;
import static com.chowbus.flickrphotos.api.ServerConfig.SERVER_RESPONSE_ERROR_CODE;
import static com.chowbus.flickrphotos.api.ServerConfig.SERVER_RESPONSE_ERROR_CODE_FORBIDDEN;
import static com.chowbus.flickrphotos.api.ServerConfig.SERVER_RESPONSE_ERROR_CODE_INTERNAL_ERROR;
import static com.chowbus.flickrphotos.api.ServerConfig.SERVER_RESPONSE_ERROR_CODE_NOT_FOUND;
import static com.chowbus.flickrphotos.api.ServerConfig.SERVER_RESPONSE_ERROR_CODE_TOKEN;
import static com.chowbus.flickrphotos.api.ServerConfig.SERVER_RESPONSE_SUCCESS_CODE;

public class ServiceApi {

    private static final String TAG = ServiceApi.class.getSimpleName();
    private static ServiceApi instance = null;
    private FlickrService service;

    public static ServiceApi newInstance(){
        if (instance == null){
            instance = new ServiceApi();
        }

        return instance;
    }

    public ServiceApi(){
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .writeTimeout(120, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(SERVER_ADDRESS_PROD)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder()
                        .setLenient()
                        .create()))
                .client(client)
                .build();

        service = retrofit.create(FlickrService.class);
    }

    private ServerErrorResponse getServerErrorResponse(Response response){

        ServerErrorResponse serverErrorResponse = new ServerErrorResponse();
        try {
            ServerErrorResponse sr = new Gson().fromJson(response.errorBody().string(), ServerErrorResponse.class);
            serverErrorResponse = sr;
        }catch (Exception e){
            e.printStackTrace();
        }
        return serverErrorResponse;
    }

    private String getAuthToken() {

        return null;
    }

    private String getErrorMessage(Response response) {
        ServerErrorResponse errorResponse = getServerErrorResponse(response);
        String errorMessage = errorResponse.getMessage();
        if (errorMessage != null && !errorMessage.isEmpty()){
            return errorMessage;
        }else {
            return MSG_SERVER_ERROR;
        }
    }

    public void getPhotos(int page, final ResponseCallBack<InterestingPhotosResponse> callBack) {

        Call<InterestingPhotosResponse> call = service.getFlikrInterestingPhotos(METHOD_INTERESTINGNES, API_KEY, FORMAT_JSON, EXTRAS,  1, COUNT_FOR_PAGENATION, page);
        call.enqueue(new Callback<InterestingPhotosResponse>() {
            @Override
            public void onResponse(@NonNull Call<InterestingPhotosResponse> call, @NonNull Response<InterestingPhotosResponse> response) {
                try {
                    if (response.code() == SERVER_RESPONSE_SUCCESS_CODE && response.body() != null && response.body().getStat() != null) {
                        if (response.body().getStat().equals("ok")) {
                            callBack.onSuccess(response.body());
                        } else {
                            callBack.onFailure(getErrorMessage(response));
                        }
                    } else {
                        callBack.onFailure(getErrorMessage(response));
                    }

                }catch (Exception e){
                    callBack.onFailure(MSG_NETWORK_ERROR);
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(@NonNull Call<InterestingPhotosResponse> call, @NonNull Throwable t) {
                callBack.onFailure(MSG_NETWORK_ERROR);
            }
        });
    }
}
