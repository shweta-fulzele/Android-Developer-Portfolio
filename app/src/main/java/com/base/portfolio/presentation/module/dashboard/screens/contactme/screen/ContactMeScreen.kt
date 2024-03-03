package com.base.portfolio.presentation.module.dashboard.screens.contactme.screen

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent
import com.base.portfolio.presentation.module.dashboard.screens.aboutme.model.ProfileDetailsModel
import com.base.portfolio.theme.theme.Green100Color
import com.base.portfolio.theme.theme.Green30Color
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.theme.theme.Grey60Color
import com.base.portfolio.theme.theme.Grey90Color
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils.MyPrimaryBgButton
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.GradientBox

@Composable
fun ContactMeScreen(navController: NavController) {
    val context = LocalContext.current

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
    ) {
        ContactMeScreenUI(navController, context)
    }
}

@Composable
fun ContactMeScreenUI(navController: NavController, context: Context) {
    val profileDetailsModel: ProfileDetailsModel = ProfileDetailsModel()
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        GradientBox(
            primaryColor = Green100Color,
            secondaryColor = Green50Color,
            midColor = GreenColor
        )

        Column(modifier = Modifier.fillMaxSize()) {

            HomeUiComponent.MyTopBarBackBtnTitle(
                titleText = stringResource(id = R.string.contact_me),
                backBtnContentDesc = "Contact Me Back Button"
            ) {
                navController.popBackStack()
            }

            ContactMeContent(profileDetailsModel.email, context = context)

        }
    }
}

@Composable
fun ContactMeContent(senderEmail: String, context: Context) {

    val senderEmailText = remember {
        mutableStateOf(senderEmail)
    }
    val emailSubject = remember {
        mutableStateOf("")
    }
    val emailBody = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Card(
            modifier = Modifier
                .padding(16.dp)
                .clip(RoundedCornerShape(24.dp)),
            colors = CardColors(
                contentColor = WhiteColor,
                containerColor = WhiteColor,
                disabledContainerColor = Grey60Color,
                disabledContentColor = Grey90Color
            )
        ) {

            Column(modifier = Modifier.padding(16.dp)) {

                TextStyleComponent.MyTitleWithDisabledInputBox(
                    title = stringResource(id = R.string.sender_email),
                    value = senderEmailText.value,
                    borderColor = Green30Color,
                    textColor = SecondaryTextColor,
                    inputTextColor = GreenColor
                )

                TextStyleComponent.MyTitleWithSimpleInputBox(
                    title = stringResource(id = R.string.email_subject),
                    value = emailSubject.value ?: "",
                    onValueChange = {
                        emailSubject.value = it
                    }, hint = stringResource(id = R.string.enter_email_subject),
                    borderColor = Green30Color,
                    textColor = SecondaryTextColor
                )


                TextStyleComponent.MyTitleWithSimpleInputBox(
                    title = stringResource(id = R.string.email_body),
                    value = emailBody.value ?: "",
                    onValueChange = {
                        emailBody.value = it
                    }, hint = stringResource(id = R.string.enter_email_body),
                    borderColor = Green30Color,
                    textColor = SecondaryTextColor
                )

                Spacer(modifier = Modifier.height(20.dp))

                MyPrimaryBgButton(
                    btnText = "Send Email",
                    modifier = Modifier.fillMaxWidth(),
                    backgroundColor = Green50Color, textColor = WhiteColor
                ) {
                    val i = Intent(Intent.ACTION_SEND)
                    val emailAddress = arrayOf(senderEmailText.value)
                    i.putExtra(Intent.EXTRA_EMAIL, emailAddress)
                    i.putExtra(Intent.EXTRA_SUBJECT, emailSubject.value)
                    i.putExtra(Intent.EXTRA_TEXT, emailBody.value)

                    i.setType("message/rfc822")

                    context.startActivity(Intent.createChooser(i, "Choose an Email client : "))
                }

                Spacer(modifier = Modifier.height(12.dp))

            }
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewContactUs() {
    val navController = rememberNavController()
    ContactMeScreen(navController)
}