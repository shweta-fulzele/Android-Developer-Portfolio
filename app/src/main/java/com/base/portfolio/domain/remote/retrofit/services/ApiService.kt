package com.base.portfolio.domain.remote.retrofit.services

import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.RecipeCategoryRes
import retrofit2.http.GET

interface ApiService {

    @GET("categories.php")
    suspend fun getCategories(): RecipeCategoryRes

}