package com.base.portfolio.presentation.module.onboarding.component

//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.base.portfolio.R
import com.base.portfolio.presentation.module.onboarding.component.OBUIComponent.HeadlineWithBody
import com.base.portfolio.theme.theme.Green100Color
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.theme.theme.Grey30Color
import com.base.portfolio.theme.theme.PrimaryColor
import com.base.portfolio.theme.theme.PrimaryLightTextColor
import com.base.portfolio.theme.theme.Secondary90Color
import com.base.portfolio.theme.theme.SecondaryDarkColor
import com.base.portfolio.theme.theme.SecondaryLightColor
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.theme.theme.typography.MyTypography
import com.base.portfolio.utils.userinterfaceutils.annotation.MultiplePreviews
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyEmailInputBoxSet
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyIconTextInputField
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyPasswordInputBoxSet
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyPhoneNumberInputBoxSet
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyTitleWithInputTextSet
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents

object OBUIComponent {

    /**
     * Headline Text with H5
     * Body text in grey color with b5 Regular
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun HeadlineWithBody(headlineText: String, bodyText: String) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            TextStyleComponent.MyHeadlineText(
                text = "$headlineText ",
                textColor = SecondaryDarkColor,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            TextStyleComponent.MyTitleText(
                text = bodyText,
                textColor = Grey30Color,
                modifier = Modifier.fillMaxWidth()
            )

        }
    }

    /**
     * Sub Headline Text with H5
     * Body text in grey color with b5 Regular
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun SubHeadlineWithBody(subheadlineText: String, bodyText: String) {
        Column(
            modifier = Modifier
                .fillMaxWidth().padding(16.dp)
                .wrapContentHeight()
        ) {
            TextStyleComponent.MyTitleText(
                text = "$subheadlineText ",
                textColor = SecondaryDarkColor,
                textAlign = TextAlign.Start,
                modifier = Modifier.wrapContentWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            TextStyleComponent.MyBasicText(
                text = bodyText,
                textColor = PrimaryColor,
                modifier = Modifier.wrapContentWidth(),
                textAlign = TextAlign.Start
            )

        }
    }

    @Composable
    fun PreviewComponent(
        title: String,
        subtitle: String,
        image: Int,
        desc: String,
        currentPage: Int
    ) {

        var titleColor by remember {
            mutableStateOf(PrimaryColor)
        }

        var subtitleColor by remember {
            mutableStateOf(PrimaryColor)
        }

        var bodyColor by remember {
            mutableStateOf(PrimaryColor)
        }

         if (currentPage % 2 == 0) {
             titleColor = GreenColor
             subtitleColor = Green100Color
             bodyColor = Green50Color
        } else {
             titleColor = SecondaryDarkColor
             subtitleColor = Secondary90Color
             bodyColor = SecondaryLightColor
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Spacer(modifier = Modifier.height(24.dp))

            Image(
                painter = painterResource(id = image),
                contentDescription = "Preview Image",
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)
                    .shadow(10.dp, shape = CircleShape),
                contentScale = ContentScale.FillBounds
            )

            Spacer(modifier = Modifier.height(24.dp))

            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                elevation = 10.dp,
                backgroundColor = WhiteColor,
                shape = RoundedCornerShape(24.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    TextStyleComponent.MyTitleText(
                        text = "$title ",
                        textColor = titleColor,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    TextStyleComponent.MySubTitleText(
                        text = subtitle,
                        textColor = subtitleColor,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    TextStyleComponent.MyBasicText(
                        text = desc,
                        textColor = bodyColor,
                        modifier = Modifier.fillMaxWidth()
                    )

                }
            }
        }
    }


    /**
     * Headline Text with H5
     * Body text in grey color with b5 Regular
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyBackButtonWithHeadline(
        contentDesc: String,
        bodyComposable: @Composable() () -> Unit,
        onBackClick: () -> Unit
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            UIComponents.MyBackButtonWithBox(contentDesc = contentDesc) {
                onBackClick()
            }

            Spacer(modifier = Modifier.height(24.dp))
            bodyComposable()

        }
    }

    @Composable
    fun MySearchTextField(
        modifier: Modifier = Modifier,
        value: String,
        onValueChange: (String) -> Unit,
        hint: String,
        contentDesc: String,
    ) {
        MyIconTextInputField(
            value = value,
            onValueChange = onValueChange,
            hint = hint,
            leadingIcon = Icons.Outlined.Search,
            contentDescIcon = contentDesc,
            modifier = modifier.padding(bottom = 8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            textStyle = TextStyle(
                fontFamily = MyTypography.title3Medium.fontFamily,
                fontSize = MyTypography.title3Medium.fontSize,
                letterSpacing = MyTypography.title3Medium.letterSpacing,
                fontWeight = MyTypography.title3Medium.fontWeight,
                lineHeight = MyTypography.title3Medium.lineHeight,
                color = SecondaryTextColor
            )
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewUIComponent() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(GreenColor)
    ) {
        OBUIComponent.PreviewComponent(
            title = "Hi", subtitle = "Im shweta", image = R.drawable.profile_pic,
            desc = "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh",
            5
        )

        OBUIComponent.SubHeadlineWithBody(subheadlineText = "sfhsd", bodyText = "shdsdsds")

        MyEmailInputBoxSet(value = "Email", onValueChange = {})
        Spacer(modifier = Modifier.height(16.dp))
        MyPhoneNumberInputBoxSet(value = "Phone Number", onValueChange = { })
        Spacer(modifier = Modifier.height(16.dp))
        MyTitleWithInputTextSet(
            title = stringResource(id = R.string.first_name),
            value = "First Name",
            onValueChange = { },
            contentDesc = "",
            hint = ""
        )
        Spacer(modifier = Modifier.height(16.dp))
        MyTitleWithInputTextSet(
            title = stringResource(id = R.string.last_name),
            value = "Last Name",
            onValueChange = { },
            contentDesc = "",
            hint = ""
        )
        Spacer(modifier = Modifier.height(16.dp))
        MyPasswordInputBoxSet(value = "Password", onValueChange = { })
        Spacer(modifier = Modifier.height(16.dp))

        Spacer(modifier = Modifier.height(16.dp))

        Spacer(modifier = Modifier.height(16.dp))

        HeadlineWithBody("Hello", bodyText = "hello")
        var checked by remember {

            mutableStateOf(false)
        }
        Spacer(modifier = Modifier.height(16.dp))

    }
}