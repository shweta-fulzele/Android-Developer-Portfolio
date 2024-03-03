package com.base.portfolio.presentation.module.dashboard.screens.profile.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.CircularImageCardView
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.ProfileRoundedCornerCard
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.UsernameWithEmail
import com.base.portfolio.presentation.module.dashboard.screens.aboutme.model.ProfileDetailsModel
import com.base.portfolio.presentation.module.dashboard.screens.achievements.screen.AchievementsScreen
import com.base.portfolio.presentation.module.dashboard.screens.certifications.screen.CertificateScreen
import com.base.portfolio.presentation.module.dashboard.screens.education.screen.EducationScreen
import com.base.portfolio.presentation.module.dashboard.screens.experience.screen.ExperienceScreen
import com.base.portfolio.presentation.module.dashboard.screens.projects.screen.ProjectsScreen
import com.base.portfolio.presentation.module.dashboard.screens.technicalskills.screen.TechnicalSkillsScreen
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.utils.userinterfaceutils.annotation.MultiplePreviews


@Composable
fun ProfileScreen(navController: NavController) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = WhiteColor)
    ) {
        ProfileScreenUI(navController)
    }
}

@Composable
fun ProfileScreenUI(navController: NavController) {

    val profileDetailsModel = ProfileDetailsModel()
//    Initializations
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(WhiteColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            BoxWithConstraints(
                Modifier
                    .background(color = WhiteColor)
                    .shadow(1.dp, shape = RectangleShape)
            ) {
                val boxHeight = this.minHeight

                Image(
                    painter = painterResource(id = R.drawable.top_nav_bg),
                    contentDescription = "Profile Screen Top Bar",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(boxHeight + 84.dp),
                    contentScale = ContentScale.FillBounds
                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .zIndex(3f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(
                        modifier = Modifier
                            .height(boxHeight + 45.dp)
                            .background(WhiteColor)
                    )

//                  Circular Image Card
                    CircularImageCardView(image = profileDetailsModel.image)

//                 Username && Email
                    UsernameWithEmail(
                        username = "${profileDetailsModel.firstName} ${profileDetailsModel.lastName}",
                        email = profileDetailsModel.email
                    )

                    TopNavigationBar(navController)
                }

//              RoundedCornerCard
                ProfileRoundedCornerCard(boxHeight)
            }
        }

    }
}

@Composable
fun TopNavigationBar(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .fillMaxHeight()
    ) {

        Box(
            contentAlignment = Alignment.Center, modifier = Modifier
                .fillMaxSize()

        ) {

            val tabItems = listOf(
                TabItem(stringResource(id = R.string.achievements)),
                TabItem(stringResource(id = R.string.education)),
                TabItem(stringResource(id = R.string.experience)),
                TabItem(stringResource(id = R.string.projects)),
                TabItem(stringResource(id = R.string.technical_skills)),
                TabItem(stringResource(id = R.string.certification)),

                )
            Column {
                TabContentUI(
                    tabItems = tabItems,
                    tabComposable = listOf(
                        { AchievementsScreen(navController) },
                        { EducationScreen(navController) },
                        { ExperienceScreen(navController) },
                        { ProjectsScreen(navController) },
                        { TechnicalSkillsScreen() },
                        { CertificateScreen(navController) }
                    )
                )
            }
        }

    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabContentUI(
    tabItems: List<TabItem>,
    tabComposable: List<@Composable (Int) -> Unit>
) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    val pagerState = rememberPagerState {
        tabItems.size
    }
    LaunchedEffect(selectedTabIndex) {
        pagerState.animateScrollToPage(selectedTabIndex)
    }
    LaunchedEffect(pagerState.currentPage, pagerState.isScrollInProgress) {
        if (!pagerState.isScrollInProgress) {
            selectedTabIndex = pagerState.currentPage
        }
    }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = WhiteColor,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(WhiteColor)
        ) {
            ScrollableTabRow(
                selectedTabIndex = selectedTabIndex,
                edgePadding = 0.dp,
                modifier = Modifier.background(WhiteColor),
                contentColor = WhiteColor
            ) {
                tabItems.forEachIndexed { index, tabItem ->
                    Tab(
                        selected = index == selectedTabIndex,
                        onClick = {
                            selectedTabIndex = index
                        },
                        text = {
                            Text(
                                tabItem.title, style = TextStyle(fontWeight = FontWeight.Bold),
                                color =
                                if (index == selectedTabIndex) {
                                    Green50Color
                                } else {
                                    GreenColor
                                }, textAlign = TextAlign.Center
                            )
                        },
                        interactionSource = MutableInteractionSource(),
                        modifier = Modifier
                            .background(
                                color = WhiteColor
                            )
                            .padding(vertical = 1.dp, horizontal = 1.dp)
                    )
                }
            }

            HorizontalPager(
                state = pagerState,
                Modifier
                    .fillMaxWidth()
                    .background(WhiteColor)
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically,

                ) { index ->
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    tabComposable[index].invoke(index)
                }
            }

        }

    }
}

data class TabItem(val title: String)

@Preview(showBackground = true, showSystemUi = true)
@MultiplePreviews
@Composable
fun PreviewLoginScreen() {
    val navController = rememberNavController()
    ProfileScreen(navController)
}




