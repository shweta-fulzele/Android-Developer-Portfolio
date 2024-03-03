package com.base.portfolio.domain.remote.retrofit.listener

import com.base.portfolio.domain.model.manager.ErrorModel

sealed class UIState<out T> {
    object Loading : UIState<Nothing>()
    object empty : UIState<Nothing>()
    data class Success<out T>(val data: T) : UIState<T>()
    data class Error(val error: ErrorModel) : UIState<Nothing>()
}