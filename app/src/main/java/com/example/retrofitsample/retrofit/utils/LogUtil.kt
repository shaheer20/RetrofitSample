package com.example.retrofitsample.retrofit.utils

import android.content.Context
import android.content.pm.ApplicationInfo
import android.util.Log

  class LogUtil {


    var ISDEBUG = false
    fun init(context: Context) {
        var isDebuggable =
            (ApplicationInfo.FLAG_DEBUGGABLE == (context.applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE))
        this.ISDEBUG = isDebuggable
    }


    fun debug(tag: String, debug: String) {
        if (this.ISDEBUG) {
            Log.d(tag, debug)
        }
    }


    fun error(tag: String, message: String, ex: Throwable) {
        if (this.ISDEBUG) {
            Log.e(tag, message, ex)
        }
    }


}