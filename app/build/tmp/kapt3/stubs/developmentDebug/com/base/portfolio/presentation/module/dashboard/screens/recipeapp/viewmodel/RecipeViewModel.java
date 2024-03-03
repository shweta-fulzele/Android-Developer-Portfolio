package com.base.portfolio.presentation.module.dashboard.screens.recipeapp.viewmodel;

import androidx.lifecycle.ViewModel;
import com.base.portfolio.domain.model.manager.ErrorModel;
import com.base.portfolio.domain.remote.retrofit.listener.UIState;
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.RecipeCategoryRes;
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository.RecipeRepositoryImpl;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import java.io.IOException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/base/portfolio/presentation/module/dashboard/screens/recipeapp/viewmodel/RecipeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/base/portfolio/presentation/module/dashboard/screens/recipeapp/repository/RecipeRepositoryImpl;", "(Lcom/base/portfolio/presentation/module/dashboard/screens/recipeapp/repository/RecipeRepositoryImpl;)V", "_categoryRes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/base/portfolio/domain/remote/retrofit/listener/UIState;", "Lcom/base/portfolio/presentation/module/dashboard/screens/recipeapp/model/RecipeCategoryRes;", "_error", "Lcom/base/portfolio/domain/model/manager/ErrorModel;", "_loading", "", "categoryRes", "Lkotlinx/coroutines/flow/StateFlow;", "getCategoryRes", "()Lkotlinx/coroutines/flow/StateFlow;", "error", "getError", "loading", "getLoading", "recipeRepository", "getRecipeRepository", "()Lcom/base/portfolio/presentation/module/dashboard/screens/recipeapp/repository/RecipeRepositoryImpl;", "setRecipeRepository", "fetchData", "", "app_developmentDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class RecipeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository.RecipeRepositoryImpl repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.base.portfolio.domain.remote.retrofit.listener.UIState<com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.RecipeCategoryRes>> _categoryRes = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _loading = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.base.portfolio.domain.model.manager.ErrorModel> _error = null;
    @javax.inject.Inject
    public com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository.RecipeRepositoryImpl recipeRepository;
    
    @javax.inject.Inject
    public RecipeViewModel(@org.jetbrains.annotations.NotNull
    com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository.RecipeRepositoryImpl repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.base.portfolio.domain.remote.retrofit.listener.UIState<com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.RecipeCategoryRes>> getCategoryRes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.base.portfolio.domain.model.manager.ErrorModel> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository.RecipeRepositoryImpl getRecipeRepository() {
        return null;
    }
    
    public final void setRecipeRepository(@org.jetbrains.annotations.NotNull
    com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository.RecipeRepositoryImpl p0) {
    }
    
    public final void fetchData() {
    }
}