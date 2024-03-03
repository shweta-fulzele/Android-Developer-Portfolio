package com.base.portfolio.presentation.module.dashboard.screens.experience.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.screens.education.model.EducationModel
import com.base.portfolio.presentation.module.dashboard.screens.experience.model.ExperienceModel
import com.base.portfolio.presentation.module.dashboard.screens.experience.model.experienceList
import com.base.portfolio.theme.theme.Green100Color
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.theme.theme.PrimaryColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent

@Composable
fun ExperienceScreen(navController: NavController) {
    ExperienceContentUI(experienceList)
}

@Composable
fun ExperienceContentUI(experienceData: ExperienceModel) {
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
                    painter = painterResource(id = experienceData.image),
                    contentDescription = experienceData.companyName,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(boxHeight + 150.dp),
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
                            .height(boxHeight + 135.dp)
                            .background(WhiteColor)
                    )
                }

                Column {
                    Spacer(
                        modifier = Modifier
                            .height(boxHeight + 135.dp)
                            .background(WhiteColor)
                    )

                    Card(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .zIndex(2f)
                            .shadow(
                                0.dp,
                                shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
                            )
                            .clip(shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)),
                        colors = CardColors(
                            containerColor = WhiteColor,
                            contentColor = PrimaryColor,
                            disabledContentColor = WhiteColor,
                            disabledContainerColor = WhiteColor
                        )
                    ) {

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                                .verticalScroll(rememberScrollState()),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Spacer(modifier = Modifier.height(36.dp))

                            TextStyleComponent.MyTitleText(text = experienceData.companyName, textColor = GreenColor)

                            Spacer(modifier = Modifier.height(24.dp))

                            TextStyleComponent.MyFormText(text = experienceData.rolesAndResponsibilities, textColor = Green50Color)


                            Spacer(modifier = Modifier.height(24.dp))

                            TextStyleComponent.MyBasicText(text = "I have worked on " + experienceData.projectCount + " Projects", textColor = Green100Color)

                            Spacer(modifier = Modifier.height(24.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center
                            ) {

                                TextStyleComponent.MyBasicText(text = "Start Year is  "  + experienceData.startDate + " |", textColor = Green100Color)

                                Spacer(modifier = Modifier.width(8.dp))
                                TextStyleComponent.MyBasicText(text = "End Year is " + experienceData.endDate, textColor = Green100Color)
                            }

                            }

                    }
                }
            }
        }
    }
}