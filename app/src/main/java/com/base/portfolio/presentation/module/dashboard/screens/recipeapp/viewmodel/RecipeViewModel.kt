package com.base.portfolio.presentation.module.dashboard.screens.recipeapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.base.portfolio.domain.model.manager.ErrorModel
import com.base.portfolio.domain.remote.retrofit.listener.UIState
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.RecipeCategoryRes
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository.RecipeRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class RecipeViewModel @Inject constructor(
    private val repository: RecipeRepositoryImpl
) : ViewModel() {
    private val _categoryRes = MutableStateFlow<UIState<RecipeCategoryRes>>(UIState.Loading)
    val categoryRes: StateFlow<UIState<RecipeCategoryRes>> get() = _categoryRes

    private val _loading = MutableStateFlow(false)
    val loading: StateFlow<Boolean> get() = _loading

    private val _error = MutableStateFlow<ErrorModel?>(null)
    val error: StateFlow<ErrorModel?> get() = _error

    @Inject
    lateinit var recipeRepository: RecipeRepositoryImpl

    fun fetchData() {
        viewModelScope.launch {
            try {
                _loading.value = true
                recipeRepository.getRecipeCategories().collect { res ->
                    _categoryRes.value = res
                }
            } catch (e: IOException) {
                val errorModel = ErrorModel(message = "Network error occurred")
                _error.value = errorModel
            } catch (e: Exception) {
                val errorModel = ErrorModel(message = e.message ?: "An error occurred")
                _error.value = errorModel
            } finally {
                _loading.value = false
            }
        }
    }

}