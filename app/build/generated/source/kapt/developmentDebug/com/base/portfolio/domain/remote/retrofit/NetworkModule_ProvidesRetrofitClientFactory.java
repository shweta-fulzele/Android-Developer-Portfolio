// Generated by Dagger (https://dagger.dev).
package com.base.portfolio.domain.remote.retrofit;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkModule_ProvidesRetrofitClientFactory implements Factory<RetrofitClient> {
  private final NetworkModule module;

  public NetworkModule_ProvidesRetrofitClientFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public RetrofitClient get() {
    return ProvidesRetrofitClient(module);
  }

  public static NetworkModule_ProvidesRetrofitClientFactory create(NetworkModule module) {
    return new NetworkModule_ProvidesRetrofitClientFactory(module);
  }

  public static RetrofitClient ProvidesRetrofitClient(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.ProvidesRetrofitClient());
  }
}