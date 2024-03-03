package com.base.portfolio.presentation.module.dashboard.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.CardWithTitleBody
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.TitleWithCardRows
import com.base.portfolio.presentation.module.dashboard.screens.technicalskills.model.technicalSkillsImages
import com.base.portfolio.presentation.module.onboarding.component.OBUIComponent.SubHeadlineWithBody
import com.base.portfolio.presentation.navigation.NavigationDestination
import com.base.portfolio.theme.theme.PrimaryTextColor
import com.base.portfolio.theme.theme.SecondaryDarkColor
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.utils.userinterfaceutils.addDotWithExclamation
import com.base.portfolio.utils.userinterfaceutils.annotation.MultiplePreviews
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyTitleText
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.HorizontalPagerScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
fun HomeScreen(navController: NavController) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        HomeScreenUI(navController)
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomeScreenUI(navController: NavController) {
    val introList = listOf(
        R.string.experienced_android_Developer_with_3_years,
        R.string.proficiend_in_developing_dynamic_uis_using_xml,
        R.string.skilled_in_leveraging_agile_methodologies,
        R.string.adept_at_collaborating_with_cross_functional_teams
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
            .fillMaxHeight()
    ) {
        SubHeadlineWithBody(
            subheadlineText = stringResource(id = R.string.welcome_to_my_portfolio).addDotWithExclamation(),
            bodyText = stringResource(id = R.string.im_delighted_to_have_you_here),
        )

        HorizontalPagerScreen(
            items = introList, content = { currentPage, item ->
                CardWithTitleBody(text = item)
            }, modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        TitleWithCardRows(
            navController
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            MyTitleText(
                text = "The Food App",
                textColor = SecondaryTextColor
            )

            TextStyleComponent.MyBasicText(
                text = "View More",
                textColor = PrimaryTextColor,
                modifier = Modifier.clickable(indication = null, interactionSource = remember {
                    MutableInteractionSource()
                }) {
                    navController.navigate(NavigationDestination.RecipeScreen.route)
                })
        }

        Image(
            painter = painterResource(id = R.drawable.food_app),
            contentDescription = "My Food Application",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .height(200.dp)
                .padding(16.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                MyTitleText(
                    text = stringResource(id = R.string.technical_skill_Set),
                    textColor = SecondaryTextColor
                )

                TextStyleComponent.MyBasicText(
                    text = "View More",
                    textColor = PrimaryTextColor,
                    modifier = Modifier.clickable(indication = null, interactionSource = remember {
                        MutableInteractionSource()
                    }) {
                        navController.navigate(NavigationDestination.TechnicalSkills.route)
                    })
            }

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            ) {
                UIComponents.MyLazyHorizontalStaggeredGrid(
                    items = technicalSkillsImages,
                    contentScale = ContentScale.FillBounds
                )
            }
        }


    }

}


@Preview(showBackground = true, showSystemUi = true)
@MultiplePreviews
@Composable
fun PreviewLoginScreen() {
    val navController = rememberNavController()
    HomeScreen(navController)
}




