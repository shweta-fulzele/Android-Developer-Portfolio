// Generated by Dagger (https://dagger.dev).
package com.base.portfolio.presentation.module.dashboard.screens.recipeapp.viewmodel;

import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.repository.RecipeRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RecipeViewModelFactory_Factory implements Factory<RecipeViewModelFactory> {
  private final Provider<RecipeRepositoryImpl> repositoryProvider;

  public RecipeViewModelFactory_Factory(Provider<RecipeRepositoryImpl> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public RecipeViewModelFactory get() {
    return newInstance(repositoryProvider.get());
  }

  public static RecipeViewModelFactory_Factory create(
      Provider<RecipeRepositoryImpl> repositoryProvider) {
    return new RecipeViewModelFactory_Factory(repositoryProvider);
  }

  public static RecipeViewModelFactory newInstance(RecipeRepositoryImpl repository) {
    return new RecipeViewModelFactory(repository);
  }
}
