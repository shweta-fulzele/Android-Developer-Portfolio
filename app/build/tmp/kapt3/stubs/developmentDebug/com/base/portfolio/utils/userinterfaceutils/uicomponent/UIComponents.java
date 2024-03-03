package com.base.portfolio.utils.userinterfaceutils.uicomponent;

import android.net.Uri;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavController;
import com.base.portfolio.R;
import com.base.portfolio.presentation.navigation.NavigationDestination;
import com.base.portfolio.utils.userinterfaceutils.annotation.MultiplePreviews;
import com.google.accompanist.pager.ExperimentalPagerApi;

/**
 * Reusable UI Components sMyh as TextBox, Buttons
 * user is currently using in the application.
 *
 * @author Shweta Fulzele
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007J4\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007J>\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0016H\u0007J-\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001dJc\u0010\u001e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001f2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u001f0\u00122;\u0010 \u001a7\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H\u001f\u00a2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00040!\u00a2\u0006\u0002\b&H\u0007Je\u0010\'\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020\u00192\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020\u00192\b\b\u0002\u0010/\u001a\u0002002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b1\u00102J(\u00103\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007J(\u00104\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007JY\u00105\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u00062\b\b\u0002\u00107\u001a\u00020\u00192\b\b\u0002\u00108\u001a\u00020\u00192\b\b\u0002\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u0002002\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00040\u0016H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b<\u0010=JS\u0010>\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010@\u001a\u00020\u00132\b\b\u0002\u0010A\u001a\u00020\u00192\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010.\u001a\u00020\u0019H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bB\u0010CJ(\u0010D\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010E\u001a\u00020\u0004H\u0007J\u001d\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0019H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bH\u0010I\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006J"}, d2 = {"Lcom/base/portfolio/utils/userinterfaceutils/uicomponent/UIComponents;", "", "()V", "CircularProfilePictureEdit", "", "modifier", "Landroidx/compose/ui/Modifier;", "imageUrl", "Landroid/net/Uri;", "onClick", "Lkotlin/Function0;", "CircularProfilePictureView", "image", "", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "DropdownBoxWithBorder", "items", "", "", "selectedItem", "onItemSelected", "Lkotlin/Function1;", "GradientBox", "primaryColor", "Landroidx/compose/ui/graphics/Color;", "secondaryColor", "midColor", "GradientBox-ysEtTa8", "(JJJ)V", "HorizontalPagerScreen", "T", "content", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentPage", "item", "Landroidx/compose/runtime/Composable;", "MyBackButton", "contentDesc", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "borderColor", "showBox", "", "MyBackButton-je-XHGc", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/graphics/Shape;JFJZLkotlin/jvm/functions/Function0;)V", "MyBackButtonWithBox", "MyBackButtonWithoutBox", "MyCheckBox", "checkBoxModifier", "checkedBorderColor", "checkedBoxColor", "uncheckedBorderColor", "checked", "onCheckedChange", "MyCheckBox-EtIuwbw", "(Landroidx/compose/ui/Modifier;JJJZLkotlin/jvm/functions/Function1;)V", "MyDropDownView", "dropdownList", "hint", "inputTextColor", "MyDropDownView-Ym9LsEM", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/lang/String;JLandroidx/compose/ui/graphics/Shape;J)V", "MyLazyHorizontalStaggeredGrid", "MyProgressBarView", "SetStatusBarColor", "color", "SetStatusBarColor-8_81llA", "(J)V", "app_developmentDebug"})
public final class UIComponents {
    @org.jetbrains.annotations.NotNull
    public static final com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents INSTANCE = null;
    
    private UIComponents() {
        super();
    }
    
    /**
     * Back Button with customizations
     * Back Button without Box
     * Back Button with Border Box
     *
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    public final void MyBackButtonWithBox(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String contentDesc, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public final void MyBackButtonWithoutBox(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String contentDesc, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    public final void DropdownBoxWithBorder(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> items, @org.jetbrains.annotations.Nullable
    java.lang.String selectedItem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemSelected) {
    }
    
    @androidx.compose.runtime.Composable
    public final void MyProgressBarView() {
    }
    
    @androidx.compose.runtime.Composable
    public final void CircularProfilePictureEdit(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.Nullable
    android.net.Uri imageUrl, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public final void CircularProfilePictureView(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, int image, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.layout.ContentScale contentScale, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @kotlin.OptIn(markerClass = {com.google.accompanist.pager.ExperimentalPagerApi.class})
    @androidx.compose.runtime.Composable
    public final <T extends java.lang.Object>void HorizontalPagerScreen(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.util.List<? extends T> items, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    public final void MyLazyHorizontalStaggeredGrid(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> items, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.layout.ContentScale contentScale) {
    }
}