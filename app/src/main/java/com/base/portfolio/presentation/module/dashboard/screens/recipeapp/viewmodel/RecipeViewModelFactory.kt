package com.base.portfolio.presentation.module.dashboard.screens.recipeapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository.RecipeRepository
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository.RecipeRepositoryImpl
import javax.inject.Inject

    class RecipeViewModelFactory @Inject constructor(private val repository: RecipeRepositoryImpl) :
        ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {

            if (modelClass.isAssignableFrom(RecipeRepository::class.java)) {
                return RecipeViewModel(repository) as T
            }
            throw IllegalArgumentException("Unknown View Model Class ")
        }

    }
