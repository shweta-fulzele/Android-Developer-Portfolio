package com.base.portfolio.utils.userinterfaceutils.uicomponent;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import com.base.portfolio.theme.theme.typography.MyTypography;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007Jq\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u007f\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b!\u0010\"JS\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b$\u0010%Jg\u0010&\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\'\u0010(JS\u0010)\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b*\u0010%\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/base/portfolio/utils/userinterfaceutils/uicomponent/ButtonUiUtils;", "", "()V", "MyCancelAndSaveButton", "", "onCancelClick", "Lkotlin/Function0;", "onSaveClick", "btnTextLeft", "", "btnTextRight", "MyPrimaryBgButton", "modifier", "Landroidx/compose/ui/Modifier;", "loadingValue", "", "loaderColor", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "borderColor", "textColor", "shape", "Landroidx/compose/ui/graphics/Shape;", "btnText", "onClick", "MyPrimaryBgButton-NghDbR4", "(Landroidx/compose/ui/Modifier;ZJJJJLandroidx/compose/ui/graphics/Shape;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "MyPrimaryButton", "textModifier", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "btnStyle", "Landroidx/compose/ui/text/TextStyle;", "MyPrimaryButton-v_wjkMo", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;JJJFLandroidx/compose/ui/graphics/Shape;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;ZJLkotlin/jvm/functions/Function0;)V", "MySecondaryBgButton", "MySecondaryBgButton-FNF3uiM", "(Landroidx/compose/ui/Modifier;ZJLandroidx/compose/ui/graphics/Shape;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "MySmallSecondaryButton", "MySmallSecondaryButton-aDBTMWw", "(Landroidx/compose/ui/Modifier;ZJJJLandroidx/compose/ui/graphics/Shape;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "MyWhiteColorBgButton", "MyWhiteColorBgButton-FNF3uiM", "app_developmentDebug"})
public final class ButtonUiUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils INSTANCE = null;
    
    private ButtonUiUtils() {
        super();
    }
    
    @androidx.compose.runtime.Composable
    public final void MyCancelAndSaveButton(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCancelClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSaveClick, @org.jetbrains.annotations.NotNull
    java.lang.String btnTextLeft, @org.jetbrains.annotations.NotNull
    java.lang.String btnTextRight) {
    }
}