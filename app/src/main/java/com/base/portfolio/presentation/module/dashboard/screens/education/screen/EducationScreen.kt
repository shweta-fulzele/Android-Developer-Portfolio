package com.base.portfolio.presentation.module.dashboard.screens.education.screen

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
import androidx.compose.foundation.text.BasicText
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
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.ProfileRoundedCornerCard
import com.base.portfolio.presentation.module.dashboard.screens.aboutme.model.ProfileDetailsModel
import com.base.portfolio.presentation.module.dashboard.screens.education.model.EducationModel
import com.base.portfolio.presentation.module.dashboard.screens.education.model.educationList
import com.base.portfolio.theme.theme.Green100Color
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.theme.theme.PrimaryColor
import com.base.portfolio.theme.theme.Secondary90Color
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyBasicText
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MySubTitleText
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyTitleText

@Composable
fun EducationScreen(navController: NavController) {
    EducationScreenUI(navController, educationList)
}

@Composable
fun EducationScreenUI(navController: NavController, educationModel: EducationModel) {
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
                    painter = painterResource(id = educationModel.images),
                    contentDescription = educationModel.highestEducation,
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
                            Image(
                                painter = painterResource(id = R.drawable.mca_college_logo),
                                contentDescription = "College Logo",
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .size(100.dp)
                            )

                            Spacer(modifier = Modifier.height(36.dp))

                            MyTitleText(text = educationModel.highestEducation, textColor = GreenColor)
                            Spacer(modifier = Modifier.height(24.dp))


                            MySubTitleText(text = educationModel.nameOfInstitute, textColor = Green50Color)
                            MySubTitleText(text = educationModel.location, textColor = Green50Color)

                            Spacer(modifier = Modifier.height(24.dp))

                            MySubTitleText(text = educationModel.universityName, textColor = Green50Color)

                            Spacer(modifier = Modifier.height(24.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center
                            ) {

                                MyBasicText(text = "Start Year  "  + educationModel.startDate, textColor = Green100Color)

                                Spacer(modifier = Modifier.width(8.dp))
                                MyBasicText(text = "End Year  " + educationModel.endDate, textColor = Green100Color)
                            }

                            Spacer(modifier = Modifier.height(24.dp))

                            MyBasicText(text = "My CGPA was " + educationModel.cgpa, textColor = Green100Color)
                        }

                    }
                }
            }
        }
    }
}