package com.base.portfolio.utils.userinterfaceutils.uicomponent

import android.content.Context
import android.os.Build
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import coil.size.Size
import com.base.portfolio.R
import com.base.portfolio.theme.theme.PrimaryTextColor
import com.base.portfolio.theme.theme.SecondaryDarkColor
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.utils.userinterfaceutils.addDotWithExclamation
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils.MySecondaryBgButton
import com.base.portfolio.utils.userinterfaceutils.uicomponent.MyAlertUiComponent.MyDialogWithDoneGif
import com.base.portfolio.utils.userinterfaceutils.uicomponent.MyAlertUiComponent.MySimpleCustomAlert

object MyAlertUiComponent {

    @OptIn(ExperimentalComposeUiApi::class)
    @Composable
    fun MySimpleCustomAlert(
        message: String,
        buttonText: String = stringResource(id = R.string.okay),
        onDismiss: () -> Unit = {}
    ) {
        val dialogOpen = remember {
            mutableStateOf(true)
        }
        if (dialogOpen.value) {
            AlertDialog(
                onDismissRequest = { dialogOpen.value = false },
                confirmButton = {
                    MySecondaryBgButton(
                        btnText = buttonText,
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                    ) {
                        onDismiss()
                        dialogOpen.value =
                            false
                    }
                },
                properties = DialogProperties(
                    dismissOnClickOutside = false,
                    dismissOnBackPress = false,
                    usePlatformDefaultWidth = true
                ),
                title = {
                    TextStyleComponent.MyTitleText(
                        text = stringResource(id = R.string.app_name),
                        textAlign = TextAlign.Center,
                        textColor = SecondaryDarkColor
                    )
                }, text = {
                    TextStyleComponent.MyBasicText(
                        text = message,
                        textColor = SecondaryTextColor,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            )
        }
    }


    @Composable
    fun MyDialogWithDoneGif(
        context: Context,
        showDialog: Boolean,
        bodyText: String,
        title1Text: String,
        title2Text: String = "",
        btnText: String,
        onDismissRequest: () -> Unit
    ) {
        if (showDialog) {
            Dialog(
                onDismissRequest = onDismissRequest,
                properties = DialogProperties(
                    usePlatformDefaultWidth = false
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        Modifier
                            .pointerInput(Unit) { detectTapGestures { } }
                            .shadow(8.dp, shape = RoundedCornerShape(10.dp))
                            .width(342.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(
                                MaterialTheme.colorScheme.surface,
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        DialogContentWithGif(
                            context,
                            bodyText,
                            title1Text,
                            title2Text,
                            btnText,
                            onDismissRequest
                        )

                    }

                }
            }
        }
    }

    @Composable
    private fun DialogContentWithGif(
        context: Context,
        bodyText: String,
        title1Text: String,
        title2Text: String,
        btnText: String,
        onDismissRequest: () -> Unit
    ) {

        val imageLoader = ImageLoader.Builder(context)
            .components {
                if (Build.VERSION.SDK_INT >= 28) {
                    add(ImageDecoderDecoder.Factory())
                } else {
                    add(GifDecoder.Factory())
                }
            }
            .build()

        Card(
            modifier = Modifier
                .wrapContentHeight()
                .background(color = WhiteColor)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = WhiteColor)
                    .padding(24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(90.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(
                            ImageRequest.Builder(context).data(data = R.drawable.circular_done)
                                .apply(block = {
                                    size(Size.ORIGINAL)
                                }).build(), imageLoader = imageLoader
                        ),
                        contentDescription = "Dialog Box SMycessful Image",
                        modifier = Modifier
                            .wrapContentSize()
                            .align(Alignment.Center)
                    )
                }

                TextStyleComponent.MyHeadlineText(
                    text = title1Text.addDotWithExclamation(),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(6.dp))

                TextStyleComponent.MyHeadlineText(
                    text = title2Text,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(16.dp))

                TextStyleComponent.MyBasicText(
                    text = bodyText,
                    textColor = WhiteColor,
                )

                Spacer(modifier = Modifier.height(16.dp))
                MySecondaryBgButton(
                    modifier = Modifier.fillMaxWidth(),
                    btnText = btnText,
                    onClick = {
                        onDismissRequest()
                    },
                )

            }
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewAlertUi() {
    val context = LocalContext.current

    LazyColumn(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {

        item {
            MyDialogWithDoneGif(
                context = context,
                btnText = "okay",
                bodyText = "Hello",
                title2Text = "cancel",
                title1Text = "my App",
                showDialog = true,
                onDismissRequest = {})
        }
        item {
            MySimpleCustomAlert(message = "hello", buttonText = "SMycess")

        }
    }

}