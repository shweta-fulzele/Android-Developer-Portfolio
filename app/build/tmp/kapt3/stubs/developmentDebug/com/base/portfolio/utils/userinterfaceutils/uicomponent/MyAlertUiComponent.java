package com.base.portfolio.utils.userinterfaceutils.uicomponent;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.window.DialogProperties;
import coil.decode.GifDecoder;
import coil.decode.ImageDecoderDecoder;
import coil.request.ImageRequest;
import com.base.portfolio.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0003JH\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0007J*\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/base/portfolio/utils/userinterfaceutils/uicomponent/MyAlertUiComponent;", "", "()V", "DialogContentWithGif", "", "context", "Landroid/content/Context;", "bodyText", "", "title1Text", "title2Text", "btnText", "onDismissRequest", "Lkotlin/Function0;", "MyDialogWithDoneGif", "showDialog", "", "MySimpleCustomAlert", "message", "buttonText", "onDismiss", "app_developmentDebug"})
public final class MyAlertUiComponent {
    @org.jetbrains.annotations.NotNull
    public static final com.base.portfolio.utils.userinterfaceutils.uicomponent.MyAlertUiComponent INSTANCE = null;
    
    private MyAlertUiComponent() {
        super();
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.ui.ExperimentalComposeUiApi.class})
    @androidx.compose.runtime.Composable
    public final void MySimpleCustomAlert(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.String buttonText, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    @androidx.compose.runtime.Composable
    public final void MyDialogWithDoneGif(@org.jetbrains.annotations.NotNull
    android.content.Context context, boolean showDialog, @org.jetbrains.annotations.NotNull
    java.lang.String bodyText, @org.jetbrains.annotations.NotNull
    java.lang.String title1Text, @org.jetbrains.annotations.NotNull
    java.lang.String title2Text, @org.jetbrains.annotations.NotNull
    java.lang.String btnText, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest) {
    }
    
    @androidx.compose.runtime.Composable
    private final void DialogContentWithGif(android.content.Context context, java.lang.String bodyText, java.lang.String title1Text, java.lang.String title2Text, java.lang.String btnText, kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest) {
    }
}