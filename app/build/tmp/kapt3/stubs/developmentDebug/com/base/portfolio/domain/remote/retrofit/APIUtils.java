package com.base.portfolio.domain.remote.retrofit;

import com.base.portfolio.BuildConfig;
import com.base.portfolio.domain.remote.retrofit.services.ApiService;
import javax.inject.Singleton;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/base/portfolio/domain/remote/retrofit/APIUtils;", "", "()V", "getApiService", "Lcom/base/portfolio/domain/remote/retrofit/services/ApiService;", "Companion", "app_developmentDebug"})
public final class APIUtils {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String BASE_URL = "https://www.themealdb.com/";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String END_POINT = "api/json/v1/1/";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String API_KEY = "live_23bxh1nVdDbgQqsIJvZ1rTWUNm5sJY3IgoYbySqByuOIaDbdNDutBmQUV3SQGuPv";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CAT_BASE_API = "https://www.themealdb.com/api/json/v1/1/";
    @org.jetbrains.annotations.NotNull
    public static final com.base.portfolio.domain.remote.retrofit.APIUtils.Companion Companion = null;
    
    public APIUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.base.portfolio.domain.remote.retrofit.services.ApiService getApiService() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/base/portfolio/domain/remote/retrofit/APIUtils$Companion;", "", "()V", "API_KEY", "", "BASE_URL", "CAT_BASE_API", "END_POINT", "app_developmentDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}