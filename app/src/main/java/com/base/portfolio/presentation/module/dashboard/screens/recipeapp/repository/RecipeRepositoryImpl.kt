package com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository

import android.content.Context
import com.base.portfolio.domain.model.manager.ErrorModel
import com.base.portfolio.domain.remote.retrofit.APIUtils
import com.base.portfolio.domain.remote.retrofit.listener.UIState
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.RecipeCategoryRes
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton


/*
interface RecipeRepository {
    suspend fun fetchCategoryData(): Flow<UIState<List<CategoryRes>>>
}
*/

@Singleton
class RecipeRepositoryImpl @Inject constructor(@ApplicationContext private val context: Context) :
    RecipeRepository {
    val apiUtils = APIUtils()

    override suspend fun getRecipeCategories(): Flow<UIState<RecipeCategoryRes>> = flow {
        val apiServiceFlow = apiUtils.getApiService()
        emit(UIState.Loading)

        val response = apiServiceFlow.getCategories()
        emit(UIState.Success(response))
    }.catch { e ->
        emit(UIState.Error(ErrorModel(message = e.message ?: "An unknown error occurred")))
    }

}