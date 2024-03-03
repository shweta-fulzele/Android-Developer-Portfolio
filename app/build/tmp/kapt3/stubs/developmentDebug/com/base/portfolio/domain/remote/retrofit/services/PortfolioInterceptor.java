package com.base.portfolio.domain.remote.retrofit.services;

import com.base.portfolio.utils.apputils.Logger;
import com.google.gson.Gson;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Response;
import okio.Buffer;
import org.json.JSONObject;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0011\u0010\u000b\u001a\u00020\u0004*\u00020\fH\u0000\u00a2\u0006\u0002\b\r\u00a8\u0006\u000f"}, d2 = {"Lcom/base/portfolio/domain/remote/retrofit/services/PortfolioInterceptor;", "Lokhttp3/Interceptor;", "()V", "bodyHasUnknownEncoding", "", "headers", "Lokhttp3/Headers;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "isProbablyUtf8", "Lokio/Buffer;", "isProbablyUtf8$app_developmentDebug", "Companion", "app_developmentDebug"})
public final class PortfolioInterceptor implements okhttp3.Interceptor {
    
    /**
     * Provides the class name as TAG variable whenever required.
     *
     * Mostly used for Logging the data in LogCat.
     */
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "UCInterceptor";
    @org.jetbrains.annotations.NotNull
    public static final com.base.portfolio.domain.remote.retrofit.services.PortfolioInterceptor.Companion Companion = null;
    
    @javax.inject.Inject
    public PortfolioInterceptor() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    public final boolean isProbablyUtf8$app_developmentDebug(@org.jetbrains.annotations.NotNull
    okio.Buffer $this$isProbablyUtf8) {
        return false;
    }
    
    private final boolean bodyHasUnknownEncoding(okhttp3.Headers headers) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/base/portfolio/domain/remote/retrofit/services/PortfolioInterceptor$Companion;", "", "()V", "TAG", "", "app_developmentDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}