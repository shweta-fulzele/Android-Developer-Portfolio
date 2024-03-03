package com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository;

import android.content.Context;
import com.base.portfolio.domain.model.manager.ErrorModel;
import com.base.portfolio.domain.remote.retrofit.APIUtils;
import com.base.portfolio.domain.remote.retrofit.listener.UIState;
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.RecipeCategoryRes;
import dagger.hilt.android.qualifiers.ApplicationContext;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/base/portfolio/presentation/module/dashboard/screens/recipeapp/repository/RecipeRepositoryImpl;", "Lcom/base/portfolio/presentation/module/dashboard/screens/recipeapp/repository/RecipeRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "apiUtils", "Lcom/base/portfolio/domain/remote/retrofit/APIUtils;", "getApiUtils", "()Lcom/base/portfolio/domain/remote/retrofit/APIUtils;", "getRecipeCategories", "Lkotlinx/coroutines/flow/Flow;", "Lcom/base/portfolio/domain/remote/retrofit/listener/UIState;", "Lcom/base/portfolio/presentation/module/dashboard/screens/recipeapp/model/RecipeCategoryRes;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_developmentDebug"})
public final class RecipeRepositoryImpl implements com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository.RecipeRepository {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.base.portfolio.domain.remote.retrofit.APIUtils apiUtils = null;
    
    @javax.inject.Inject
    public RecipeRepositoryImpl(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.base.portfolio.domain.remote.retrofit.APIUtils getApiUtils() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getRecipeCategories(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.base.portfolio.domain.remote.retrofit.listener.UIState<com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.RecipeCategoryRes>>> $completion) {
        return null;
    }
}