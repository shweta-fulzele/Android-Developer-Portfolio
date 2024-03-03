package com.base.portfolio.data.local.datastore;

import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import com.google.gson.Gson;
import kotlinx.coroutines.flow.Flow;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ3\u0010\r\u001a\u0002H\u000e\"\n\b\u0000\u0010\u000e\u0018\u0001*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u0002H\u000eH\u0086H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J3\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0016\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0013\u001a\u0002H\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J5\u0010\u0017\u001a\u00020\u000b\"\n\b\u0000\u0010\u000e\u0018\u0001*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0018\u001a\u0004\u0018\u0001H\u000eH\u0086H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J-\u0010\u0019\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0018\u001a\u0002H\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/base/portfolio/data/local/datastore/DataStoreImpl;", "Lcom/base/portfolio/data/local/datastore/DataStoreRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dataSource", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "getDataSource", "()Landroidx/datastore/core/DataStore;", "clearAllPreference", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readDataClassFromDataStore", "T", "", "key", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "defaultValue", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readStringDataPreference", "Lkotlinx/coroutines/flow/Flow;", "writeDataClassToDataStore", "value", "writeStringDataPreference", "app_developmentDebug"})
public final class DataStoreImpl implements com.base.portfolio.data.local.datastore.DataStoreRepository {
    @org.jetbrains.annotations.NotNull
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataSource = null;
    
    public DataStoreImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getDataSource() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public <T extends java.lang.Object>java.lang.Object writeStringDataPreference(@org.jetbrains.annotations.NotNull
    androidx.datastore.preferences.core.Preferences.Key<T> key, T value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public <T extends java.lang.Object>java.lang.Object readStringDataPreference(@org.jetbrains.annotations.NotNull
    androidx.datastore.preferences.core.Preferences.Key<T> key, T defaultValue, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends T>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object clearAllPreference(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}