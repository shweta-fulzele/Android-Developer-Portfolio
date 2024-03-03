package com.base.portfolio.domain.remote.retrofit

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Inject
    lateinit var retrofitClient: RetrofitClient

    @Singleton
    @Provides
    fun ProvidesRetrofitClient(): RetrofitClient {

        return retrofitClient

    }

}