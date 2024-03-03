package com.base.portfolio.presentation.module.dashboard.screens.projects.screen

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent
import com.base.portfolio.presentation.module.dashboard.screens.achievements.model.achievementList
import com.base.portfolio.presentation.module.dashboard.screens.projects.model.projectsList
import com.base.portfolio.theme.theme.Green100Color
import com.base.portfolio.theme.theme.Green30Color
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.theme.theme.Grey60Color
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils.MyWhiteColorBgButton
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents
import com.google.accompanist.pager.ExperimentalPagerApi


@Composable
fun ProjectsScreen(navController: NavController) {
    val context = LocalContext.current
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        ProjectsContentUI(context)
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ProjectsContentUI(context: Context) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        UIComponents.GradientBox(
            primaryColor = Green100Color,
            secondaryColor = Green50Color,
            midColor = GreenColor
        )

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            UIComponents.HorizontalPagerScreen(
                items = projectsList,
                content = { currentPage, item ->
                    Box(modifier = Modifier.fillMaxSize()) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .verticalScroll(rememberScrollState())
                                .padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {

                            Column {
                                //                            Project name
                                TextStyleComponent.MyTitleText(
                                    text = "Project Name " + item.projectName,
                                    textColor = WhiteColor,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp)
                                        .wrapContentWidth(),
                                    textAlign = TextAlign.Center
                                )

//                            Desc
                                TextStyleComponent.MyBasicText(
                                    text = item.content,
                                    textColor = WhiteColor,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentWidth(),
                                    textAlign = TextAlign.Center
                                )

                                Spacer(modifier = Modifier.height(16.dp))
                                TextStyleComponent.MySubTitleText(
                                    text = "Responsibilities:",
                                    textColor = Color.White,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentWidth(),
                                    textAlign = TextAlign.Center
                                )

                                Spacer(modifier = Modifier.height(6.dp))
//                            Responsibilities
                                UIComponents.HorizontalPagerScreen(
                                    items = item.responsibilities, content = { currentPage, item ->
                                        HomeUiComponent.SimpleCardWithTitleBody(text = item)
                                    }, modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp)
                                )

                                Spacer(modifier = Modifier.height(16.dp))
//                            Skills
                                TextStyleComponent.MySubTitleText(
                                    text = "Skils:",
                                    textColor = Color.White,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentWidth(),
                                    textAlign = TextAlign.Center
                                )
                                Spacer(modifier = Modifier.height(6.dp))

                                UIComponents.HorizontalPagerScreen(
                                    items = item.skillSet, content = { currentPage, item ->
                                        HomeUiComponent.SimpleCardWithTitleBody(text = item)
                                    }, modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp)
                                )
                            }

                            if (item.playStoreLink != "") {
                                ButtonUiUtils.MySecondaryBgButton(btnText = "Click to Download the App") {
                                    val appPackageName = item.playStoreLink
                                    val intent =
                                        Intent(Intent.ACTION_VIEW, Uri.parse(appPackageName))
                                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                                    context.startActivity(intent)
                                }
                            }
                        }
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.8f)
            )
        }
    }
}


