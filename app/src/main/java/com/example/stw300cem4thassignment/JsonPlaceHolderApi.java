package com.example.stw300cem4thassignment;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {

//    @GET("posts")
//    Call<List<Post>> getPosts();

    @GET("posts")
    Call<List<Post>> getPosts(@Query("userId") Integer[] userId);


    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Query("id") int userId);

    @POST("posts")
    Call<Post> createPost(@Body Post post);

}
