package com.base.portfolio.di.appcomponent;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = PortfolioApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface PortfolioApp_GeneratedInjector {
  void injectPortfolioApp(PortfolioApp portfolioApp);
}
