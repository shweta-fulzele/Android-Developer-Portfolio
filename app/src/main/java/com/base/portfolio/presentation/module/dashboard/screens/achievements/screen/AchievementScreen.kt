package com.base.portfolio.presentation.module.dashboard.screens.achievements.screen

import android.content.Context
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
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent
import com.base.portfolio.presentation.module.dashboard.screens.achievements.model.achievementList
import com.base.portfolio.theme.theme.Green100Color
import com.base.portfolio.theme.theme.Green30Color
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.theme.theme.Grey60Color
import com.base.portfolio.theme.theme.SecondaryDarkColor
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.HorizontalPagerScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
fun AchievementsScreen(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
    ) {
        AchievementsContentUI()
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun AchievementsContentUI() {
    Box(
        modifier = Modifier
            .wrapContentSize()
    ) {

        UIComponents.GradientBox(
            primaryColor = Green100Color,
            secondaryColor = Green50Color,
            midColor = GreenColor
        )

        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
            HorizontalPagerScreen(
                items = achievementList, content = { currentPage, item ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Card(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f),
                            shape = RoundedCornerShape(8.dp),
                            colors = CardColors(
                                containerColor = WhiteColor,
                                contentColor = SecondaryTextColor,
                                disabledContentColor = Grey60Color,
                                disabledContainerColor = Green30Color
                            )
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize().padding(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.SpaceEvenly
                            )
                            {


                                Image(
                                    painter = painterResource(id = item.image),
                                    contentDescription = item.achievementName,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier.size(80.dp)
                                )

                                TextStyleComponent.MyTitleText(
                                    text = item.achievementName,
                                    textColor = Green100Color,
                                    modifier = Modifier
                                        .wrapContentWidth(),
                                    textAlign = TextAlign.Center
                                )

                                TextStyleComponent.MySubTitleText(
                                    text = item.description,
                                    textColor = Green50Color,
                                    modifier = Modifier
                                        .wrapContentWidth(),
                                    textAlign = TextAlign.Center
                                )

                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    TextStyleComponent.MyBasicText(
                                        text = item.organization,
                                        textColor = Green50Color,
                                        modifier = Modifier
                                            .wrapContentWidth()
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    TextStyleComponent.MyBasicText(
                                        text = item.year,
                                        textColor = Green50Color,
                                        modifier = Modifier
                                            .wrapContentWidth()
                                    )
                                }
                            }

                        }

                    }


                }, modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f)
            )
        }

    }
}
