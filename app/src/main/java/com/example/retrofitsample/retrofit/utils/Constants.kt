package com.example.retrofitsample.retrofit.utils

class Constants {

    companion object {
        var IMAGE_UPLOAD_CONNECTION_TIMEOUT = 120
        var IMAGE_UPLOAD_SOCKET_TIMEOUT = 120
        var SOCKET_TIMEOUT = 120
        var CONNECTION_TIMEOUT = 120

        var SINGLE_POST = "1"
        var ALL_POST = "2"
        var ALL_POST_COMMENT = "3"
        var POST_COMMENT_BY_ID = "4"

        var CODE = "code"
        var STATUS = "status"
        var MESSAGE = "message"
        var DEVELOPER_MESSAGE = "developerMessage"

        const val GET_SINGLE_POST = "/posts/1"
        const val GET_ALL_POST = "/posts"
        const val GET_ALL_POST_COMMENT = "/posts/1/comments"
        const val GET_POST_COMMENT_BY_ID = "/comments"

    }


}