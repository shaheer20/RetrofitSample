package com.example.retrofitsample.retrofit.utils

import android.content.Context
import android.util.Log
import java.io.Serializable

class Logger(context: Context) : Serializable {

    var TAG: String = context.javaClass.name


    fun error(ex: Throwable, message: String = "--->") {
        LogUtil().error(TAG, message, ex)
    }

    fun debug(log: String) {
        LogUtil().debug(TAG, log)
    }

    init {
        LogUtil().init(context)
    }


}