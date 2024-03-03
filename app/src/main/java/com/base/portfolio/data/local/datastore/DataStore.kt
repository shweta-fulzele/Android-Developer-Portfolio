package com.base.portfolio.data.local.datastore

import android.content.Context
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import com.google.gson.Gson
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import java.io.IOException

val Context.dataStore by preferencesDataStore(name = "recipe_settings")

class DataStoreImpl(context: Context) : DataStoreRepository {

    val dataSource = context.dataStore


    //    Write String in the data store
    override suspend fun <T> writeStringDataPreference(key: Preferences.Key<T>, value: T) {
        dataSource.edit { preferences ->
            preferences[key] = value
        }
    }

    //    Read String from the data store
    override suspend fun <T> readStringDataPreference(
        key: Preferences.Key<T>,
        defaultValue: T
    ): Flow<T> =
        dataSource.data.catch { exception ->
            if (exception is IOException) {
                emit(emptyPreferences())
            } else {
                throw exception
            }
        }.map { preferences ->
            preferences[key] ?: defaultValue
        }

    //    Write data in the data store
    suspend inline fun <reified T : Any> writeDataClassToDataStore(
        key: Preferences.Key<String>,
        value: T?
    ) {
        value?.let {
            val jsonValue = Gson().toJson(it)
            dataSource.edit { preferences ->
                preferences[key] = jsonValue
            }
        }
    }

    //    Read data from the data store

    suspend inline fun <reified T : Any> readDataClassFromDataStore(
        key: Preferences.Key<String>,
        defaultValue: T
    ): T {
        return dataSource.data.map { settings ->
            val jsonString = settings[key]
            if (jsonString != null) {
                Gson().fromJson(jsonString, T::class.java)
            } else {
                defaultValue
            }
        }.first()
    }

    override suspend fun clearAllPreference() {
        dataSource.edit { preferences ->
            preferences.clear()
        }
    }
}