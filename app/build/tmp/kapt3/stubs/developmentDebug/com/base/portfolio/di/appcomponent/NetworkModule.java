package com.base.portfolio.di.appcomponent;

import com.base.portfolio.domain.remote.retrofit.RetrofitClient;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import javax.inject.Inject;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/base/portfolio/di/appcomponent/NetworkModule;", "", "()V", "retrofitClient", "Lcom/base/portfolio/domain/remote/retrofit/RetrofitClient;", "getRetrofitClient", "()Lcom/base/portfolio/domain/remote/retrofit/RetrofitClient;", "setRetrofitClient", "(Lcom/base/portfolio/domain/remote/retrofit/RetrofitClient;)V", "providesRetrofitClient", "app_developmentDebug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class NetworkModule {
    @javax.inject.Inject
    public com.base.portfolio.domain.remote.retrofit.RetrofitClient retrofitClient;
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.base.portfolio.domain.remote.retrofit.RetrofitClient getRetrofitClient() {
        return null;
    }
    
    public final void setRetrofitClient(@org.jetbrains.annotations.NotNull
    com.base.portfolio.domain.remote.retrofit.RetrofitClient p0) {
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.base.portfolio.domain.remote.retrofit.RetrofitClient providesRetrofitClient() {
        return null;
    }
}