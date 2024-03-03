package com.base.portfolio.presentation.module.dashboard.screens.faq.screen

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent
import com.base.portfolio.presentation.module.dashboard.screens.aboutme.model.ProfileDetailsModel
import com.base.portfolio.presentation.module.dashboard.screens.contactme.screen.ContactMeContent
import com.base.portfolio.presentation.module.dashboard.screens.contactme.screen.ContactMeScreen
import com.base.portfolio.presentation.module.dashboard.screens.contactme.screen.ContactMeScreenUI
import com.base.portfolio.presentation.module.dashboard.screens.faq.model.FaqModel
import com.base.portfolio.theme.theme.Green100Color
import com.base.portfolio.theme.theme.Green30Color
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyFormText
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents


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

        UIComponents.GradientBox(
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
fun FAQScreen(navController: NavController) {
    val context = LocalContext.current

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
    ) {
        FAQScreenUI(navController, context = context)
    }
}

@Composable
fun FAQScreenUI(navController: NavController, context: Context) {

    val faqModel = listOf<FaqModel>(
        FaqModel(
            "Activity Lifecycle",
            "https://developer.android.com/guide/components/activities/activity-lifecycle"
        ),
        FaqModel("Fragment Lifecycle", "https://developer.android.com/guide/fragments/lifecycle"),
        FaqModel(
            "Activity vs Fragment",
            "https://www.geeksforgeeks.org/difference-between-a-fragment-and-an-activity-in-android/"
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        UIComponents.GradientBox(
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

            FAQContent(faqModel, context = context)

        }
    }

}

@Composable
fun FAQContent(faqModel: List<FaqModel>, context: Context) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(WhiteColor)) {
        LazyColumn {
            items(faqModel.size) { index ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    TextStyleComponent.MyDisabledTextInputField(
                        value = faqModel[index].question,
                        modifier = Modifier
                            .padding(bottom = 8.dp)
                            .clickable {
                                val urlIntent = Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse(faqModel[index].url)
                                )
                                context.startActivity(urlIntent)
                            },
                        borderColor = Green30Color,
                        textColor = SecondaryTextColor
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        val isHelpful = remember {
                            mutableStateOf(false)
                        }

                        val isNotHelpful = remember {
                            mutableStateOf(false)
                        }

                        val isHelpfulCount = remember {
                            mutableStateOf(0)
                        }

                        val isNotHelpfulCount = remember {
                            mutableStateOf(0)
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {

                            Icon(
                                imageVector = if (isHelpful.value) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                                contentDescription = "Is Helpful",
                                tint = Green50Color,
                                modifier = Modifier
                                    .size(30.dp)
                                    .clickable {
                                        isHelpful.value = true
                                        isNotHelpful.value = false
                                        isHelpfulCount.value = isHelpfulCount.value + 1
                                        if (isNotHelpfulCount.value > 0) {
                                            isNotHelpfulCount.value = isNotHelpfulCount.value - 1
                                        }

                                    }
                            )

                            MyFormText(
                                text = isHelpfulCount.value,
                                textAlign = TextAlign.Center,
                                textColor = SecondaryTextColor
                            )
                            MyFormText(
                                text = "Helpful",
                                textAlign = TextAlign.Center,
                                textColor = SecondaryTextColor
                            )
                        }

                        Column(horizontalAlignment = Alignment.CenterHorizontally) {

                            Icon(
                                imageVector = if (isNotHelpful.value) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                                contentDescription = "Is Helpful",
                                tint = Green50Color,
                                modifier = Modifier
                                    .size(30.dp)
                                    .clickable {
                                        isNotHelpful.value = true
                                        isHelpful.value = false
                                        isNotHelpfulCount.value = isNotHelpfulCount.value + 1
                                        if (isHelpfulCount.value > 0) {
                                            isHelpfulCount.value = isHelpfulCount.value - 1
                                        }
                                    }
                            )

                            MyFormText(
                                text = isNotHelpfulCount.value,
                                textColor = SecondaryTextColor
                            )
                            MyFormText(
                                text = "Not Helpful",
                                textAlign = TextAlign.Center,
                                textColor = SecondaryTextColor
                            )

                        }

                    }

                }

            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewFAQ() {
    val navController = rememberNavController()
    FAQScreen(navController)
}