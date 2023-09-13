package com.rsk.otherclass

enum class ErrorCodes (val error:Int) {
    None(0),
    Unknown(1),
    ConnectionLost(300),
    HttpError(400)
}

fun main() {
    val errorCode = ErrorCodes.HttpError
    when(errorCode) {
        ErrorCodes.None -> {
            println("No Error")
        }
        ErrorCodes.Unknown ->{}
        ErrorCodes.ConnectionLost ->{}
        ErrorCodes.HttpError -> {}
    }
    print("errorCode has ${errorCode.name} and it has ordinal ${errorCode.ordinal} and has value ${errorCode.error}")
    val error = ErrorCodes.valueOf("HttpError")
}