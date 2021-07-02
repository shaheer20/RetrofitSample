package com.example.retrofitsample.retrofit.utils

import android.content.Context
import com.example.retrofitsample.R
import com.example.retrofitsample.models.ErrorObject
import com.example.retrofitsample.retrofit.utils.Constants.Companion.CODE
import com.example.retrofitsample.retrofit.utils.Constants.Companion.DEVELOPER_MESSAGE
import com.example.retrofitsample.retrofit.utils.Constants.Companion.MESSAGE
import com.example.retrofitsample.retrofit.utils.Constants.Companion.STATUS
import com.google.gson.Gson
import org.json.JSONObject
import java.lang.Exception


class HttpUtil {

    companion object {

         fun getServerErrorJsonObject(context: Context): JSONObject {
            val logger: Logger = Logger(context)
            val jsonObject = JSONObject()
            try {
                jsonObject.put(STATUS, 505)
                jsonObject.put(CODE, 3000)
                jsonObject.put(
                    MESSAGE,
                    context.getString(
                        R.string.server_not_available
                    )
                )
                jsonObject.put(
                    DEVELOPER_MESSAGE,
                    context.getString(R.string.server_not_available)
                )
            } catch (x: Exception) {
                logger.error(x)
            }
            return jsonObject
        }

        fun getServerErrorPojo(context: Context): ErrorObject? {
            val logger = Logger(context)

            try {
                val gson = Gson()
                return gson.fromJson(
                    getServerErrorJsonObject(context).toString(),
                    ErrorObject::class.java
                )
            } catch (ex: Exception) {
                logger.error(ex)
            }
            return null
        }
    }

}