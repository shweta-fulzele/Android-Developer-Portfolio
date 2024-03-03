package com.base.portfolio.presentation.module.dashboard.component;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.CardColors;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavController;
import com.base.portfolio.R;
import com.base.portfolio.presentation.navigation.NavigationDestination;
import com.base.portfolio.theme.theme.typography.MyTypography;
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\\\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007J1\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0012H\u0007J6\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007JK\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b&\u0010\'J/\u0010(\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\u0014H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b+\u0010,J0\u0010-\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007J.\u00102\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007J\u001d\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020%H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b7\u00108J1\u00109\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020/2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020>H\u0007JM\u0010?\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020/2\b\b\u0002\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020\u00142\b\b\u0002\u0010E\u001a\u00020\u0014H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bF\u0010GR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006H"}, d2 = {"Lcom/base/portfolio/presentation/module/dashboard/component/HomeUiComponent;", "", "()V", "AUTO_SLIDE_DURATION", "", "CardWithRightArrow", "", "onAboutMeDetailsClick", "Lkotlin/Function0;", "onEducationDetailsClick", "onExperienceDetailsClick", "onProjectDetailsClick", "onCertificateDetailsClick", "onAchievementDetailsClick", "CardWithTitleBody", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "CardWithTitleBody-mxwnekA", "(Landroidx/compose/ui/Modifier;IJ)V", "CircularImageCardView", "image", "CircularImageCardWithEditIcon", "imageUrl", "Landroid/net/Uri;", "isEditable", "", "onEditClick", "DotsIndicator", "totalDots", "selectedIndex", "selectedColor", "unSelectedColor", "dotSize", "Landroidx/compose/ui/unit/Dp;", "DotsIndicator-lH4V3bw", "(Landroidx/compose/ui/Modifier;IIJJF)V", "IndicatorDot", "size", "color", "IndicatorDot-H2RKhps", "(Landroidx/compose/ui/Modifier;FJ)V", "MyTopBarBackBtnTitle", "titleText", "", "backBtnContentDesc", "onBack", "MyTopBarSideNavLogoProfileIcon", "onNavDrawerClick", "onProfileClick", "ProfileRoundedCornerCard", "boxHeight", "ProfileRoundedCornerCard-0680j_4", "(F)V", "SimpleCardWithTitleBody", "SimpleCardWithTitleBody-mxwnekA", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;J)V", "TitleWithCardRows", "navController", "Landroidx/navigation/NavController;", "UsernameWithEmail", "username", "email", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "userNameColor", "emailColor", "UsernameWithEmail-6gVtP18", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;IJJ)V", "app_developmentDebug"})
public final class HomeUiComponent {
    private static final long AUTO_SLIDE_DURATION = 1000L;
    @org.jetbrains.annotations.NotNull
    public static final com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent INSTANCE = null;
    
    private HomeUiComponent() {
        super();
    }
    
    @androidx.compose.runtime.Composable
    public final void CircularImageCardWithEditIcon(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.Nullable
    android.net.Uri imageUrl, boolean isEditable, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onEditClick) {
    }
    
    @androidx.compose.runtime.Composable
    public final void CircularImageCardView(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, int image) {
    }
    
    @androidx.compose.runtime.Composable
    public final void CardWithRightArrow(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onAboutMeDetailsClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onEducationDetailsClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onExperienceDetailsClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onProjectDetailsClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCertificateDetailsClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onAchievementDetailsClick) {
    }
    
    @android.annotation.SuppressLint(value = {"UnrememberedMutableInteractionSource"})
    @androidx.compose.runtime.Composable
    public final void MyTopBarSideNavLogoProfileIcon(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavDrawerClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onProfileClick) {
    }
    
    @androidx.compose.runtime.Composable
    public final void MyTopBarBackBtnTitle(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String titleText, @org.jetbrains.annotations.NotNull
    java.lang.String backBtnContentDesc, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onBack) {
    }
    
    @androidx.compose.runtime.Composable
    public final void TitleWithCardRows(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
}