package com.base.portfolio.domain.remote.retrofit

import com.base.portfolio.BuildConfig
import com.base.portfolio.domain.remote.retrofit.services.ApiService
import javax.inject.Singleton

@Singleton
class APIUtils {
    companion object {
        private const val BASE_URL = BuildConfig.BASE_URL
        private const val END_POINT = "api/json/v1/1/"
        private const val API_KEY = BuildConfig.API_KEY
        private const val CAT_BASE_API = BASE_URL+ END_POINT


    }

    fun getApiService(): ApiService {
        return RetrofitClient.getClient(CAT_BASE_API, API_KEY).create(ApiService::class.java)
    }

}