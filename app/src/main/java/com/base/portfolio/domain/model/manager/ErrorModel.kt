package com.base.portfolio.domain.model.manager

data class ErrorModel(
    var errorCode: Int = 0,
    var errorMessage: ErrorMessageJson? = null,
    var message: String = ""
)


data class ErrorMessageJson(
    var timestamp: String? = null,
    var status: String,
    var statusCode: Int? = null,
    var message: String
) {

}