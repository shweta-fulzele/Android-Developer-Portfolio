package com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository;

import com.base.portfolio.domain.remote.retrofit.listener.UIState;
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.RecipeCategoryRes;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/base/portfolio/presentation/module/dashboard/screens/recipeapp/repository/RecipeRepository;", "", "getRecipeCategories", "Lkotlinx/coroutines/flow/Flow;", "Lcom/base/portfolio/domain/remote/retrofit/listener/UIState;", "Lcom/base/portfolio/presentation/module/dashboard/screens/recipeapp/model/RecipeCategoryRes;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_developmentDebug"})
public abstract interface RecipeRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRecipeCategories(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.base.portfolio.domain.remote.retrofit.listener.UIState<com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.RecipeCategoryRes>>> $completion);
}