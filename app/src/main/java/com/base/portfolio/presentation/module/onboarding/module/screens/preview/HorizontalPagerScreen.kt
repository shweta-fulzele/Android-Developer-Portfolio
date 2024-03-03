package com.base.portfolio.presentation.module.onboarding.module.screens.preview

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPagerIndicator
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.base.portfolio.R
import com.base.portfolio.presentation.module.onboarding.component.OBUIComponent.PreviewComponent
import com.base.portfolio.presentation.module.onboarding.module.screens.model.HorizontalPagerContent
import com.base.portfolio.presentation.navigation.NavigationDestination
import com.base.portfolio.theme.theme.Green100Color
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.theme.theme.Secondary30Color
import com.base.portfolio.theme.theme.Secondary90Color
import com.base.portfolio.theme.theme.SecondaryDarkColor
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils.MyPrimaryBgButton
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils.MyWhiteColorBgButton
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.GradientBox
import com.google.accompanist.pager.pagerTabIndicatorOffset
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class)
@Composable
fun HorizontalPagerScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val items = createItems()
        val pagerState = rememberPagerState()

        HorizontalPager(
            count = items.size,
            state = pagerState,
            modifier = Modifier.weight(1f)
        ) { currentPage ->

            val certificateModel = items[currentPage]

            Box(modifier = Modifier.fillMaxSize()) {
                if (currentPage % 2 == 0) {
                    GradientBox(
                        primaryColor = Green100Color,
                        secondaryColor = Green50Color,
                        midColor = GreenColor
                    )
                } else {
                    GradientBox(
                        primaryColor = SecondaryDarkColor,
                        secondaryColor = Secondary30Color,
                        midColor = Secondary90Color
                    )
                }

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Box(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxHeight(0.7f)
                    ) {
                        PreviewComponent(
                            title = certificateModel.title,
                            subtitle = certificateModel.subtitle,
                            image = certificateModel.image,
                            desc = certificateModel.description,
                            currentPage
                        )
                    }

                    if (currentPage == items.size - 1) {
                        Text(text = "->",
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NavigationDestination.MainScreen.route)
                                }
                                .align(alignment = AbsoluteAlignment.Right)
                                .padding(16.dp),
                            style = TextStyle(
                                fontSize = 36.sp, fontWeight = FontWeight.ExtraBold
                            ), color = Color.White
                        )
                    }
                }
            }

        }

        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
                .background(Color.White),
        )
    }
}


fun createItems() = listOf(
    HorizontalPagerContent(
        title = "Intro",
        image = R.drawable.profile_pic,
        subtitle = "Hi there! I'm Shweta Fulzele,",
        description = "As a seasoned Android Developer in Pune, Maharashtra, India, I bring over three+ years of expertise in Kotlin and Java. Proficient in architecture design, UI/UX, and backend integration, I excel in Agile/Scrum collaboration. With skills in Jetpack Compose, Retrofit, and MVVM architecture, I deliver clean, user-centric apps. My finger on the pulse of tech trends ensures innovative solutions that captivate audiences."
    ),

    HorizontalPagerContent(
        title = "Short Summary",
        image = R.drawable.summary,
        subtitle = "I love working in dynamic environments.",
        description = "I specialize in using Agile methodologies, Kotlin, Java, XML, and Jetpack Compose to craft intuitive user interfaces. Whether it's optimizing code for better performance, or integrating complex features like payment gateways and healthcare data management, I ensure high-quality solutions that exceed your expectations. Let's work together and create something amazing!"
    ),
    HorizontalPagerContent(
        title = "Skills Overview",
        image = R.drawable.skills,
        subtitle = "My skill set encompasses a wide range of tools and technologies",
        description = "This skills are essential for modern Android development. From version control with Git and Bitbucket to reactive programming using RxJava and Kotlin Coroutines, I'm well-versed in the latest industry practices. Proficient in RESTful API integration, database management with SQLite and RoomDB, and UI design principles like Material Design and Jetpack Compose, I bring a comprehensive approach to every project."
    ),
    HorizontalPagerContent(
        title = "Experience",
        image = R.drawable.profressional_experience_highlight,
        subtitle = "In my current role at Thinkitive Technologies Pvt Ltd.,",
        description = "I've led the development of multiple projects, focusing on clean code architecture and continuous optimization. From managing app deployment on Google Play Console to conducting thorough unit tests and client communication, I've demonstrated a commitment to excellence and effective team collaboration."
    ),
    HorizontalPagerContent(
        title = "Project Showcase",
        image = R.drawable.projects,
        subtitle = "Let me take you through a glimpse of my recent projects.",
        description = "From DocsInk, a comprehensive healthcare solution facilitating patient-provider communication, to TRST Health, empowering users with data-driven insights for managing diabetes, each project reflects my dedication to innovation and user-centric design. Explore the Dash App for seamless online payments and Urgent Care, revolutionizing healthcare access through real-time communication and virtual appointments."
    )
)


