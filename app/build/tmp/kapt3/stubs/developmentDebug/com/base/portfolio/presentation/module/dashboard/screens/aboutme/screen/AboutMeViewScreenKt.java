package com.base.portfolio.presentation.module.dashboard.screens.aboutme.screen;

import android.Manifest;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.navigation.NavController;
import com.base.portfolio.presentation.navigation.NavigationDestination;
import com.base.portfolio.R;
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent;
import com.base.portfolio.presentation.module.dashboard.screens.aboutme.model.ProfileDetailsModel;
import com.base.portfolio.utils.apputils.Logger;
import com.base.portfolio.utils.userinterfaceutils.annotation.MultiplePreviews;
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent;
import com.google.accompanist.permissions.ExperimentalPermissionsApi;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\b\u0010\n\u001a\u00020\u0001H\u0007\u00a8\u0006\u000b"}, d2 = {"AboutMeViewContent", "", "context", "Landroid/content/Context;", "navController", "Landroidx/navigation/NavController;", "profileInfo", "Lcom/base/portfolio/presentation/module/dashboard/screens/aboutme/model/ProfileDetailsModel;", "AboutMeViewScreen", "AboutMeViewScreenUI", "PreviewAboutMeViewScreen", "app_developmentDebug"})
public final class AboutMeViewScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void AboutMeViewScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void AboutMeViewScreenUI(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @kotlin.OptIn(markerClass = {com.google.accompanist.permissions.ExperimentalPermissionsApi.class})
    @androidx.compose.runtime.Composable
    public static final void AboutMeViewContent(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.base.portfolio.presentation.module.dashboard.screens.aboutme.model.ProfileDetailsModel profileInfo) {
    }
    
    @com.base.portfolio.utils.userinterfaceutils.annotation.MultiplePreviews
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, showSystemUi = true)
    @androidx.compose.runtime.Composable
    public static final void PreviewAboutMeViewScreen() {
    }
}