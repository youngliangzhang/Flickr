package com.chowbus.flickrphotos.api.response;

import com.google.gson.annotations.SerializedName;

public class BaseResponse {

    @SerializedName("stat")
    private String stat;

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}
