package com.base.portfolio.data.local.datastore

import androidx.datastore.preferences.core.Preferences
import kotlinx.coroutines.flow.Flow

interface DataStoreRepository {
    suspend fun<T> readStringDataPreference(key: Preferences.Key<T>, defaultValue : T): Flow<T>
    suspend fun<T> writeStringDataPreference(key: Preferences.Key<T>, value: T)

    suspend fun clearAllPreference()
}