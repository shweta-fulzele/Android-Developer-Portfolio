package com.base.portfolio.domain.model.manager

import android.util.MalformedJsonException
import com.base.portfolio.domain.remote.retrofit.listener.UIState
import dagger.hilt.android.scopes.ActivityRetainedScoped

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.withContext
import org.json.JSONObject
import retrofit2.HttpException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.text.ParseException
import java.util.concurrent.TimeoutException
import javax.inject.Inject

@ActivityRetainedScoped
class NetworkManager @Inject constructor() {
    private val tag: String = NetworkManager::class.java.simpleName
    val _networkState = MutableStateFlow<UIState<Any>>(UIState.empty)
    val networkState: StateFlow<UIState<Any>> = _networkState

    // Function to call API and get response
    suspend fun <V : Any> createAPIRequest(call: suspend () -> V): UIState<V> {

        return try {
            _networkState.emit(UIState.Loading)

//            UIState.Loading
            val response = withContext(Dispatchers.IO) { call() }
            _networkState.emit(UIState.Success(response))
            UIState.Success(response)

        } catch (e: Exception) {

            _networkState.emit(UIState.Error(setUpErrors(e)))
            UIState.Error(setUpErrors(e))
        }
    }

    // Function to return error received in a proper format
    private fun setUpErrors(t: Throwable): ErrorModel {

        val errorModel = ErrorModel()

        try {
            when (t) {
                is SocketTimeoutException -> {
                    errorModel.errorCode = ResponseCodes.INTERNET_NOT_AVAILABLE
                    errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
                }

                is TimeoutException -> {
                    errorModel.errorCode = ResponseCodes.URL_CONNECTION_ERROR
                    errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
                }

                is ClassCastException -> {
                    errorModel.errorCode = ResponseCodes.MODEL_TYPE_CAST_EXCEPTION
                    errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
                }

                is MalformedJsonException -> {
                    errorModel.errorCode = ResponseCodes.MODEL_TYPE_CAST_EXCEPTION
                    errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
                }

                is ParseException -> {
                    errorModel.errorCode = ResponseCodes.MODEL_TYPE_CAST_EXCEPTION
                    errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
                }

                is UnknownHostException -> {
                    errorModel.errorCode = ResponseCodes.INTERNET_NOT_AVAILABLE
                    errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
                }


                else -> {
                    val errorMessage = (t as HttpException).response()?.errorBody()!!.string()
                    val responseCode = t.response()?.code()
                    if (responseCode != null) {
                        errorModel.errorCode = responseCode
                    }
                    var errorObject = JSONObject(errorMessage)
                    var error = ErrorMessageJson(
                        errorObject.optString("timestamp"),
                        errorObject.optString("statusMessage"),
                        t.code(),
                        errorObject.optString("message"),

                        )
                    errorModel.errorMessage = error
//                    errorModel.errorMessage = ErrorMessageJson("", "", 0, t.message.toString())
                }
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
            errorModel.errorCode = ResponseCodes.UNKNOWN_ERROR
            errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
        } finally {
//            progressHide()
        }
        return errorModel
    }
}