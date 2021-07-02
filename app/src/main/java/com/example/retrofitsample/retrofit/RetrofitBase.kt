package com.example.retrofitsample.retrofit

import android.content.Context
import androidx.core.os.BuildCompat
import com.example.retrofitsample.BuildConfig
import com.example.retrofitsample.retrofit.utils.Logger
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

class RetrofitBase(val _context: Context, addTimeOut: Boolean) {
    lateinit var retrofit: Retrofit
    var context: Context = _context
    lateinit var logger: Logger

    init {
        var interceptor = HttpLoggingInterceptor()

        if (BuildConfig.DEBUG) {
            interceptor.level = HttpLoggingInterceptor.Level.BODY
        } else {
        }
    }


}