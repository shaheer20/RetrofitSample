package com.example.retrofitsample.retrofit

import com.example.retrofitsample.retrofit.utils.Constants.Companion.GET_ALL_POST
import com.example.retrofitsample.retrofit.utils.Constants.Companion.GET_ALL_POST_COMMENT
import com.example.retrofitsample.retrofit.utils.Constants.Companion.GET_SINGLE_POST
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface ApiServices {

    @GET(GET_SINGLE_POST)
    fun getSinglePost(): Call<ResponseBody>

    @GET(GET_ALL_POST)
    fun getAllPosts(): Call<ResponseBody>

    @GET(GET_ALL_POST_COMMENT)
    fun getPostComments(): Call<ResponseBody>

    @GET(GET_SINGLE_POST)
    fun getPostCommentsByIs(): Call<ResponseBody>


}