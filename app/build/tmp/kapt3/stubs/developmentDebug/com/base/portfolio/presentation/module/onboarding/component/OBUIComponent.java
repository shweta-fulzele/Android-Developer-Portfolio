package com.base.portfolio.presentation.module.onboarding.component;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import com.base.portfolio.R;
import com.base.portfolio.theme.theme.typography.MyTypography;
import com.base.portfolio.utils.userinterfaceutils.annotation.MultiplePreviews;
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent;
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J1\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\u0002\b\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0007J>\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0007J0\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0019H\u0007J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/base/portfolio/presentation/module/onboarding/component/OBUIComponent;", "", "()V", "HeadlineWithBody", "", "headlineText", "", "bodyText", "MyBackButtonWithHeadline", "contentDesc", "bodyComposable", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "onBackClick", "MySearchTextField", "modifier", "Landroidx/compose/ui/Modifier;", "value", "onValueChange", "Lkotlin/Function1;", "hint", "PreviewComponent", "title", "subtitle", "image", "", "desc", "currentPage", "SubHeadlineWithBody", "subheadlineText", "app_developmentDebug"})
public final class OBUIComponent {
    @org.jetbrains.annotations.NotNull
    public static final com.base.portfolio.presentation.module.onboarding.component.OBUIComponent INSTANCE = null;
    
    private OBUIComponent() {
        super();
    }
    
    /**
     * Headline Text with H5
     * Body text in grey color with b5 Regular
     *
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    public final void HeadlineWithBody(@org.jetbrains.annotations.NotNull
    java.lang.String headlineText, @org.jetbrains.annotations.NotNull
    java.lang.String bodyText) {
    }
    
    /**
     * Sub Headline Text with H5
     * Body text in grey color with b5 Regular
     *
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    public final void SubHeadlineWithBody(@org.jetbrains.annotations.NotNull
    java.lang.String subheadlineText, @org.jetbrains.annotations.NotNull
    java.lang.String bodyText) {
    }
    
    @androidx.compose.runtime.Composable
    public final void PreviewComponent(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String subtitle, int image, @org.jetbrains.annotations.NotNull
    java.lang.String desc, int currentPage) {
    }
    
    /**
     * Headline Text with H5
     * Body text in grey color with b5 Regular
     *
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    public final void MyBackButtonWithHeadline(@org.jetbrains.annotations.NotNull
    java.lang.String contentDesc, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> bodyComposable, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackClick) {
    }
    
    @androidx.compose.runtime.Composable
    public final void MySearchTextField(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, @org.jetbrains.annotations.NotNull
    java.lang.String hint, @org.jetbrains.annotations.NotNull
    java.lang.String contentDesc) {
    }
}