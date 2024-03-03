package com.base.portfolio.data.local.datastore;

import androidx.datastore.preferences.core.Preferences;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J3\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\u0006\u0010\n\u001a\u0002H\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ-\u0010\f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\u0006\u0010\r\u001a\u0002H\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/base/portfolio/data/local/datastore/DataStoreRepository;", "", "clearAllPreference", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readStringDataPreference", "Lkotlinx/coroutines/flow/Flow;", "T", "key", "Landroidx/datastore/preferences/core/Preferences$Key;", "defaultValue", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeStringDataPreference", "value", "app_developmentDebug"})
public abstract interface DataStoreRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract <T extends java.lang.Object>java.lang.Object readStringDataPreference(@org.jetbrains.annotations.NotNull
    androidx.datastore.preferences.core.Preferences.Key<T> key, T defaultValue, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends T>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract <T extends java.lang.Object>java.lang.Object writeStringDataPreference(@org.jetbrains.annotations.NotNull
    androidx.datastore.preferences.core.Preferences.Key<T> key, T value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearAllPreference(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}