package com.base.portfolio.domain.remote.retrofit

import com.base.portfolio.domain.remote.retrofit.services.ApiKeyInterceptor
import com.base.portfolio.domain.remote.retrofit.services.PortfolioInterceptor
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit

import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RetrofitClient @Inject constructor() {
    companion object {
        private lateinit var retrofit: Retrofit

        fun getClient(baseUrl: String,apiKey: String): Retrofit {
            val gson = GsonBuilder().setLenient().create()
            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okClient(apiKey = apiKey))
                .build()
            return retrofit
        }

        private fun okClient(apiKey: String): OkHttpClient {
            val loggingInterceptor = PortfolioInterceptor()
            val httpClient = OkHttpClient.Builder()
            httpClient.connectTimeout(1, TimeUnit.MINUTES)
            httpClient.readTimeout(1, TimeUnit.MINUTES)
            httpClient.addInterceptor(loggingInterceptor)
//            httpClient.addInterceptor(ApiKeyInterceptor(apiKey))
            return httpClient.build()
        }
    }
}
