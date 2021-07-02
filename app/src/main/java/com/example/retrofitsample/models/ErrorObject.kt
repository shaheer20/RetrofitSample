package com.example.retrofitsample.models

import java.io.Serializable

data class ErrorObject(var code:Int,var message:String):Serializable {
}