package com.base.portfolio.domain.model.manager;

import android.util.MalformedJsonException;
import com.base.portfolio.domain.remote.retrofit.listener.UIState;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.StateFlow;
import org.json.JSONObject;
import retrofit2.HttpException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.concurrent.TimeoutException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J?\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0005\"\b\b\u0000\u0010\u000f*\u00020\u00012\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/base/portfolio/domain/model/manager/NetworkManager;", "", "()V", "_networkState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/base/portfolio/domain/remote/retrofit/listener/UIState;", "get_networkState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "networkState", "Lkotlinx/coroutines/flow/StateFlow;", "getNetworkState", "()Lkotlinx/coroutines/flow/StateFlow;", "tag", "", "createAPIRequest", "V", "call", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUpErrors", "Lcom/base/portfolio/domain/model/manager/ErrorModel;", "t", "", "app_developmentDebug"})
@dagger.hilt.android.scopes.ActivityRetainedScoped
public final class NetworkManager {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String tag = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.base.portfolio.domain.remote.retrofit.listener.UIState<java.lang.Object>> _networkState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.base.portfolio.domain.remote.retrofit.listener.UIState<java.lang.Object>> networkState = null;
    
    @javax.inject.Inject
    public NetworkManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.base.portfolio.domain.remote.retrofit.listener.UIState<java.lang.Object>> get_networkState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.base.portfolio.domain.remote.retrofit.listener.UIState<java.lang.Object>> getNetworkState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final <V extends java.lang.Object>java.lang.Object createAPIRequest(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super V>, ? extends java.lang.Object> call, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.base.portfolio.domain.remote.retrofit.listener.UIState<? extends V>> $completion) {
        return null;
    }
    
    private final com.base.portfolio.domain.model.manager.ErrorModel setUpErrors(java.lang.Throwable t) {
        return null;
    }
}