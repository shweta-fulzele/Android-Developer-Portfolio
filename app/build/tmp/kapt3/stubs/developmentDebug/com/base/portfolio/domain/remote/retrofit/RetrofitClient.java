package com.base.portfolio.domain.remote.retrofit;

import com.base.portfolio.domain.remote.retrofit.services.ApiKeyInterceptor;
import com.base.portfolio.domain.remote.retrofit.services.PortfolioInterceptor;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/base/portfolio/domain/remote/retrofit/RetrofitClient;", "", "()V", "Companion", "app_developmentDebug"})
public final class RetrofitClient {
    private static retrofit2.Retrofit retrofit;
    @org.jetbrains.annotations.NotNull
    public static final com.base.portfolio.domain.remote.retrofit.RetrofitClient.Companion Companion = null;
    
    @javax.inject.Inject
    public RetrofitClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/base/portfolio/domain/remote/retrofit/RetrofitClient$Companion;", "", "()V", "retrofit", "Lretrofit2/Retrofit;", "getClient", "baseUrl", "", "apiKey", "okClient", "Lokhttp3/OkHttpClient;", "app_developmentDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final retrofit2.Retrofit getClient(@org.jetbrains.annotations.NotNull
        java.lang.String baseUrl, @org.jetbrains.annotations.NotNull
        java.lang.String apiKey) {
            return null;
        }
        
        private final okhttp3.OkHttpClient okClient(java.lang.String apiKey) {
            return null;
        }
    }
}