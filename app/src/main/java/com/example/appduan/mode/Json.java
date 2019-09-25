package com.example.appduan.mode;

import com.example.appduan.InHome;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;


public interface Json {
    @GET("posts")
    Call<List<InHome>> getPost();

}
