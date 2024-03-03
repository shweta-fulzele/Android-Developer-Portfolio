package com.base.portfolio.utils.userinterfaceutils.uicomponent

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.base.portfolio.theme.theme.ButtonBorder
import com.base.portfolio.theme.theme.Green30Color
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.Primary30Color
import com.base.portfolio.theme.theme.PrimaryColor
import com.base.portfolio.theme.theme.PrimaryTextColor
import com.base.portfolio.theme.theme.SecondaryDarkColor
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.theme.theme.typography.MyTypography
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils.MyPrimaryBgButton
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils.MySecondaryBgButton
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils.MyWhiteColorBgButton

object ButtonUiUtils {

    @Composable
    fun MyCancelAndSaveButton(
        onCancelClick: () -> Unit,
        onSaveClick: () -> Unit,
        btnTextLeft: String,
        btnTextRight: String
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            MyWhiteColorBgButton(
                btnText = btnTextLeft,
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .wrapContentHeight()
            ) {
                onCancelClick()
            }

            Spacer(modifier = Modifier.width(16.dp))

            MySecondaryBgButton(
                btnText = btnTextRight,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                onSaveClick()
            }

        }
    }


    /**
     * Primary Button which can be modified as per background
     * text color
     * Primary BG Button
     * Secondary BG Button
     * WhiteColor BG Button
     *
     * @author Shweta Fulzele
     */
    @Composable
    private fun MyPrimaryButton(
        modifier: Modifier = Modifier,
        textModifier: Modifier = Modifier.padding(vertical = 16.dp, horizontal = 31.dp),
        backgroundColor: Color,
        textColor: Color,
        borderColor: Color,
        borderWidth: Dp,
        shape: Shape,
        btnText: String,
        btnStyle: TextStyle,
        loadingValue: Boolean,
        loaderColor: Color,
        onClick: () -> Unit
    ) {
        Surface(
            color = backgroundColor,
            border = BorderStroke(borderWidth, borderColor),
            shape = shape,
            modifier = modifier.clickable(onClick = onClick)
        ) {
            if (loadingValue) {
                Box(modifier = Modifier.wrapContentSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(35.dp),
                        color = loaderColor,
                        strokeWidth = 2.dp
                    )
                }
            } else {
                Text(
                    text = btnText,
                    style = btnStyle,
                    modifier = textModifier,
                    color = textColor,
                    textAlign = TextAlign.Center
                )
            }

        }
    }


    /**
     * Secondary Button with Light background and Dark text color
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MySecondaryBgButton(
        modifier: Modifier = Modifier,
        loadingValue: Boolean = false,
        loaderColor: Color = PrimaryTextColor,
        shape: Shape = RoundedCornerShape(8.dp),
        btnText: String, onClick: () -> Unit
    ) {
        MyPrimaryButton(
            backgroundColor = Green50Color,
            borderColor = Green50Color,
            textColor = Color.White,
            btnText = btnText,
            btnStyle = TextStyle(
                fontFamily = MyTypography.buttonCTALarge.fontFamily,
                fontSize = MyTypography.buttonCTALarge.fontSize,
                letterSpacing = MyTypography.buttonCTALarge.letterSpacing,
                fontWeight = MyTypography.buttonCTALarge.fontWeight,
                lineHeight = MyTypography.buttonCTALarge.lineHeight
            ), onClick = onClick,
            modifier = modifier,
            loadingValue = loadingValue,
            loaderColor = loaderColor,
            shape = shape,
            borderWidth = 1.dp
        )
    }

    /**
     * Small Secondary Button with Light background and Dark text color
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MySmallSecondaryButton(
        modifier: Modifier = Modifier,
        loadingValue: Boolean = false,
        loaderColor: Color = PrimaryTextColor,
        borderColor: Color = ButtonBorder,
        textColor: Color = PrimaryTextColor,
        shape: Shape = RoundedCornerShape(8.dp),
        btnText: String, onClick: () -> Unit
    ) {
        MyPrimaryButton(
            backgroundColor = WhiteColor,
            borderColor = borderColor,
            textColor = textColor,
            btnText = btnText,
            btnStyle = TextStyle(
                fontFamily = MyTypography.body6Medium.fontFamily,
                fontSize = MyTypography.body6Medium.fontSize,
                letterSpacing = MyTypography.body6Medium.letterSpacing,
                fontWeight = MyTypography.body6Medium.fontWeight,
                lineHeight = MyTypography.body6Medium.lineHeight,
                textAlign = TextAlign.Center
            ), onClick = onClick,
            modifier = modifier,
            loadingValue = loadingValue,
            loaderColor = loaderColor,
            shape = shape,
            borderWidth = 1.dp,
            textModifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }

    /**
     * Primary Button with Dark Background and Light text color
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyPrimaryBgButton(
        modifier: Modifier = Modifier, loadingValue: Boolean = false,
        loaderColor: Color = SecondaryTextColor,
        backgroundColor: Color = Primary30Color,
        borderColor: Color = Primary30Color,
        textColor: Color = Color.White,
        shape: Shape = RoundedCornerShape(8.dp), btnText: String, onClick: () -> Unit
    ) {
        MyPrimaryButton(
            backgroundColor = backgroundColor,
            borderColor = borderColor,
            textColor = textColor,
            btnText = btnText,
            btnStyle = TextStyle(
                fontFamily = MyTypography.buttonCTALarge.fontFamily,
                fontSize = MyTypography.buttonCTALarge.fontSize,
                letterSpacing = MyTypography.buttonCTALarge.letterSpacing,
                fontWeight = MyTypography.buttonCTALarge.fontWeight,
                lineHeight = MyTypography.buttonCTALarge.lineHeight
            ), onClick = onClick,
            modifier = modifier.alpha(0.8f),
            loadingValue = loadingValue,
            loaderColor = loaderColor,
            shape = shape,
            borderWidth = 1.dp
        )
    }


    /**
     * WhiteColor Background Button with Dark text color
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyWhiteColorBgButton(
        modifier: Modifier = Modifier, loadingValue: Boolean = false,
        loaderColor: Color = PrimaryTextColor,
        shape: Shape = RoundedCornerShape(8.dp),
        btnText: String, onClick: () -> Unit
    ) {
        MyPrimaryButton(
            backgroundColor = Color.White,
            borderColor = Color.White,
            textColor = PrimaryColor,
            btnText = btnText,
            btnStyle = TextStyle(
                fontFamily = MyTypography.buttonCTALarge.fontFamily,
                fontSize = MyTypography.buttonCTALarge.fontSize,
                letterSpacing = MyTypography.buttonCTALarge.letterSpacing,
                fontWeight = MyTypography.buttonCTALarge.fontWeight,
                lineHeight = MyTypography.buttonCTALarge.lineHeight
            ), onClick = onClick,
            modifier = modifier,
            loadingValue = loadingValue,
            loaderColor = loaderColor,
            shape = shape,
            borderWidth = 1.dp
        )
    }
}

@Preview
@Composable
fun PreviewButtonsUi(){

    Column {
        MyPrimaryBgButton(
            btnText = "Hello",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {

        }
        MySecondaryBgButton(
            btnText = "Hello",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {

        }

        MyWhiteColorBgButton(
            btnText = "Hello",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {

        }
    }

}