package com.base.portfolio.domain.remote.retrofit.services

data class BaseResponse<T>(
    val code: Int?,
    val `data`: T?,
    val date: String?,
    val message: String?,
    val path: String?,
    val requestId: String?,
    val version: String?
)