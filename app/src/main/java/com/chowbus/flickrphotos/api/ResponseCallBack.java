package com.chowbus.flickrphotos.api;

public interface ResponseCallBack<T> {

    void onSuccess(T data);
    void onFailure(String errorMessage);

}
