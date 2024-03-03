// Generated by Dagger (https://dagger.dev).
package com.base.portfolio.di.appcomponent;

import com.base.portfolio.domain.remote.retrofit.RetrofitClient;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkModule_MembersInjector implements MembersInjector<NetworkModule> {
  private final Provider<RetrofitClient> retrofitClientProvider;

  public NetworkModule_MembersInjector(Provider<RetrofitClient> retrofitClientProvider) {
    this.retrofitClientProvider = retrofitClientProvider;
  }

  public static MembersInjector<NetworkModule> create(
      Provider<RetrofitClient> retrofitClientProvider) {
    return new NetworkModule_MembersInjector(retrofitClientProvider);
  }

  @Override
  public void injectMembers(NetworkModule instance) {
    injectRetrofitClient(instance, retrofitClientProvider.get());
  }

  @InjectedFieldSignature("com.base.portfolio.di.appcomponent.NetworkModule.retrofitClient")
  public static void injectRetrofitClient(NetworkModule instance, RetrofitClient retrofitClient) {
    instance.retrofitClient = retrofitClient;
  }
}
