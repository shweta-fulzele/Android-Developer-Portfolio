package com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository

import com.base.portfolio.domain.remote.retrofit.listener.UIState
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.RecipeCategoryRes
import kotlinx.coroutines.flow.Flow

interface RecipeRepository {

    suspend fun getRecipeCategories(
    ): Flow<UIState<RecipeCategoryRes>>

}
