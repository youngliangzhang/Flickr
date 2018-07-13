package com.chowbus.flickrphotos.api.response;

import com.google.gson.annotations.SerializedName;

import java.net.ConnectException;
import java.net.SocketTimeoutException;

public class ServerErrorResponse extends BaseResponse {

    @SerializedName("code")
    private int code;
    @SerializedName("message")
    private String message;

    public ServerErrorResponse() {
    }

    public ServerErrorResponse(String message) {
        this.message = message;
    }

    public ServerErrorResponse(Throwable throwable) {

        if (throwable instanceof ConnectException || throwable instanceof SocketTimeoutException){
            message = "Unable to reach to server, please try again";
        }else {
            message = throwable.getMessage();
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String Error) {
        this.message = Error;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int Code) {
        this.code = Code;
    }
}
