package com.catchmind.FlowerClassificationApplication.UnsplashApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Download {
    @SerializedName("url")
    @Expose
    private String url;
}