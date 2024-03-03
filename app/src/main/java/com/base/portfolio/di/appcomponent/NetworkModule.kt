package com.base.portfolio.di.appcomponent

import com.base.portfolio.domain.remote.retrofit.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Inject
    lateinit var retrofitClient: RetrofitClient

    @Singleton
    @Provides
    fun providesRetrofitClient(): RetrofitClient {
        //Todo define Retrofit client here

        return retrofitClient

    }

    //Todo define provider functions here for APIservices with "@Singleton" and "@Provides" annotations

}