package com.base.portfolio.presentation.module.dashboard.component

import android.annotation.SuppressLint
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Adb
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Work
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.ArrowForwardIos
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.CardWithTitleBody
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.MyTopBarBackBtnTitle
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.MyTopBarSideNavLogoProfileIcon
import com.base.portfolio.presentation.navigation.NavigationDestination
import com.base.portfolio.theme.theme.Green30Color
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.theme.theme.Grey60Color
import com.base.portfolio.theme.theme.Primary15Color
import com.base.portfolio.theme.theme.PrimaryColor
import com.base.portfolio.theme.theme.PrimaryTextColor
import com.base.portfolio.theme.theme.Secondary90Color
import com.base.portfolio.theme.theme.SecondaryDarkColor
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.theme.theme.typography.MyTypography
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MySubTitleText
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.CircularProfilePictureEdit
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.CircularProfilePictureView

object HomeUiComponent {

    private const val AUTO_SLIDE_DURATION = 1000L

    @Composable
    fun IndicatorDot(
        modifier: Modifier = Modifier,
        size: Dp,
        color: Color
    ) {
        Box(
            modifier = modifier
                .size(size)
                .clip(CircleShape)
                .background(color)
        )
    }

    @Composable
    fun DotsIndicator(
        modifier: Modifier = Modifier,
        totalDots: Int,
        selectedIndex: Int,
        selectedColor: Color = SecondaryDarkColor,
        unSelectedColor: Color = Grey60Color,
        dotSize: Dp
    ) {
        LazyRow(
            modifier = modifier
                .wrapContentWidth()
                .wrapContentHeight()
        ) {
            items(totalDots) { index ->
                IndicatorDot(
                    color = if (index == selectedIndex) selectedColor else unSelectedColor,
                    size = dotSize
                )

                if (index != totalDots - 1) {
                    Spacer(modifier = Modifier.padding(horizontal = 2.dp))
                }
            }
        }
    }


    @Composable
    fun UsernameWithEmail(
        modifier: Modifier = Modifier,
        username: String,
        email: String,
        textAlign: TextAlign = TextAlign.Center,
        userNameColor: androidx.compose.ui.graphics.Color = SecondaryDarkColor,
        emailColor: androidx.compose.ui.graphics.Color = Green50Color
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .wrapContentHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = username,
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(
                    fontFamily = MyTypography.body3.fontFamily,
                    fontSize = MyTypography.body3.fontSize,
                    letterSpacing = MyTypography.body3.letterSpacing,
                    fontWeight = MyTypography.body3.fontWeight,
                    lineHeight = MyTypography.body3.lineHeight,
                    textAlign = textAlign
                ),
                color = userNameColor
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = email,
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(
                    fontFamily = MyTypography.body5Regular.fontFamily,
                    fontSize = MyTypography.body5Regular.fontSize,
                    letterSpacing = MyTypography.body5Regular.letterSpacing,
                    fontWeight = MyTypography.body5Regular.fontWeight,
                    lineHeight = MyTypography.body5Regular.lineHeight,
                    textAlign = textAlign
                ),
                color = emailColor
            )
        }
    }

    @Composable
    fun ProfileRoundedCornerCard(boxHeight: Dp) {
        Column {
            Spacer(
                modifier = Modifier
                    .height(boxHeight + 65.dp)
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


            }
        }
    }

    @Composable
    fun CircularImageCardWithEditIcon(
        modifier: Modifier = Modifier,
        imageUrl: Uri?,
        isEditable: Boolean = false,
        onEditClick: () -> Unit = {}
    ) {
        Box {
            Card(
                modifier = modifier
                    .size(80.dp)
                    .shadow(elevation = 10.dp, shape = CircleShape)
                    .clip(CircleShape),
                colors = CardColors(
                    containerColor = WhiteColor,
                    contentColor = PrimaryColor,
                    disabledContentColor = WhiteColor,
                    disabledContainerColor = WhiteColor
                )
            ) {
                CircularProfilePictureEdit(imageUrl = imageUrl, modifier = Modifier.fillMaxSize())
            }

            if (isEditable) {
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.BottomEnd)
                        .clickable(indication = null, interactionSource = remember {
                            MutableInteractionSource()
                        }) { onEditClick() }
                        .size(45.dp)
                        .clip(shape = CircleShape)
                        .border(10.dp, color = WhiteColor, shape = CircleShape)
                        .background(WhiteColor)
                ) {
                    Image(
                        imageVector = Icons.Outlined.Edit,
                        contentDescription = "Edit Profile Picture",
                        modifier = Modifier
                            .size(15.dp)
                            .align(alignment = Alignment.Center),
                        contentScale = ContentScale.Fit
                    )
                }
            }

        }

    }

    @Composable
    fun CircularImageCardView(
        modifier: Modifier = Modifier,
        image: Int
    ) {
        Box {
            Card(
                modifier = modifier
                    .size(80.dp)
                    .shadow(elevation = 10.dp, shape = CircleShape)
                    .clip(CircleShape),
                colors = CardColors(
                    containerColor = WhiteColor,
                    contentColor = PrimaryColor,
                    disabledContentColor = WhiteColor,
                    disabledContainerColor = WhiteColor
                )
            ) {
                CircularProfilePictureView(image = image, modifier = Modifier.fillMaxSize())
            }
        }

    }

    @Composable
    fun CardWithRightArrow(
        onAboutMeDetailsClick: () -> Unit,
        onEducationDetailsClick: () -> Unit,
        onExperienceDetailsClick: () -> Unit,
        onProjectDetailsClick: () -> Unit,
        onCertificateDetailsClick: () -> Unit,
        onAchievementDetailsClick: () -> Unit,
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .border(width = 0.5.dp, shape = RoundedCornerShape(10.dp), color = PrimaryColor)
        ) {

            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onAboutMeDetailsClick() }
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = stringResource(id = R.string.about_me),
                            modifier = Modifier.fillMaxWidth(0.8f),
                            style = TextStyle(
                                fontFamily = MyTypography.title3Medium.fontFamily,
                                fontSize = MyTypography.title3Medium.fontSize,
                                letterSpacing = MyTypography.title3Medium.letterSpacing,
                                fontWeight = MyTypography.title3Medium.fontWeight,
                                lineHeight = MyTypography.title3Medium.lineHeight,
                                textAlign = TextAlign.Start
                            ),
                            color = SecondaryTextColor
                        )

                        Icon(
                            imageVector = Icons.Outlined.ArrowForwardIos,
                            contentDescription = "About Me Details",
                            tint = WhiteColor,
                            modifier = Modifier.size(14.dp)
                        )
                    }
                }

                item {
                    Spacer(
                        modifier = Modifier
                            .height(0.5.dp)
                            .fillMaxWidth()
                            .background(
                                PrimaryColor
                            )
                    )
                }


                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onEducationDetailsClick() }
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = stringResource(id = R.string.education),
                            modifier = Modifier.fillMaxWidth(0.8f),
                            style = TextStyle(
                                fontFamily = MyTypography.title3Medium.fontFamily,
                                fontSize = MyTypography.title3Medium.fontSize,
                                letterSpacing = MyTypography.title3Medium.letterSpacing,
                                fontWeight = MyTypography.title3Medium.fontWeight,
                                lineHeight = MyTypography.title3Medium.lineHeight,
                                textAlign = TextAlign.Start
                            ),
                            color = SecondaryTextColor
                        )

                        Icon(
                            imageVector = Icons.Outlined.ArrowForwardIos,
                            contentDescription = "Education Details",
                            tint = PrimaryColor,
                            modifier = Modifier.size(14.dp)
                        )
                    }
                }


                item {
                    Spacer(
                        modifier = Modifier
                            .height(0.5.dp)
                            .fillMaxWidth()
                            .background(
                                PrimaryColor
                            )
                    )
                }

                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onExperienceDetailsClick() }
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = stringResource(id = R.string.experience),
                            modifier = Modifier.fillMaxWidth(0.8f),
                            style = TextStyle(
                                fontFamily = MyTypography.title3Medium.fontFamily,
                                fontSize = MyTypography.title3Medium.fontSize,
                                letterSpacing = MyTypography.title3Medium.letterSpacing,
                                fontWeight = MyTypography.title3Medium.fontWeight,
                                lineHeight = MyTypography.title3Medium.lineHeight,
                                textAlign = TextAlign.Start
                            ),
                            color = SecondaryTextColor
                        )

                        Icon(
                            imageVector = Icons.Outlined.ArrowForwardIos,
                            contentDescription = "Experience Details",
                            tint = WhiteColor,
                            modifier = Modifier.size(14.dp)
                        )
                    }
                }
                item {
                    Spacer(
                        modifier = Modifier
                            .height(0.5.dp)
                            .fillMaxWidth()
                            .background(
                                PrimaryColor
                            )
                    )

                }

                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onProjectDetailsClick() }
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = stringResource(id = R.string.projects),
                            modifier = Modifier.fillMaxWidth(0.8f),
                            style = TextStyle(
                                fontFamily = MyTypography.title3Medium.fontFamily,
                                fontSize = MyTypography.title3Medium.fontSize,
                                letterSpacing = MyTypography.title3Medium.letterSpacing,
                                fontWeight = MyTypography.title3Medium.fontWeight,
                                lineHeight = MyTypography.title3Medium.lineHeight,
                                textAlign = TextAlign.Start
                            ),
                            color = SecondaryTextColor
                        )

                        Icon(
                            imageVector = Icons.Outlined.ArrowForwardIos,
                            contentDescription = "Projects Details",
                            tint = WhiteColor,
                            modifier = Modifier.size(14.dp)
                        )
                    }
                }

                item {

                    Spacer(
                        modifier = Modifier
                            .height(0.5.dp)
                            .fillMaxWidth()
                            .background(
                                PrimaryColor
                            )
                    )
                }

                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onAchievementDetailsClick() }
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = stringResource(id = R.string.achievements),
                            modifier = Modifier.fillMaxWidth(0.8f),
                            style = TextStyle(
                                fontFamily = MyTypography.title3Medium.fontFamily,
                                fontSize = MyTypography.title3Medium.fontSize,
                                letterSpacing = MyTypography.title3Medium.letterSpacing,
                                fontWeight = MyTypography.title3Medium.fontWeight,
                                lineHeight = MyTypography.title3Medium.lineHeight,
                                textAlign = TextAlign.Start
                            ),
                            color = SecondaryTextColor
                        )

                        Icon(
                            imageVector = Icons.Outlined.ArrowForwardIos,
                            contentDescription = "Achievements Details",
                            tint = WhiteColor,
                            modifier = Modifier.size(14.dp)
                        )
                    }
                }

                item {
                    Spacer(
                        modifier = Modifier
                            .height(0.5.dp)
                            .fillMaxWidth()
                            .background(
                                PrimaryColor
                            )
                    )
                }

                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onCertificateDetailsClick() }
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = stringResource(id = R.string.certification),
                            modifier = Modifier.fillMaxWidth(0.8f),
                            style = TextStyle(
                                fontFamily = MyTypography.title3Medium.fontFamily,
                                fontSize = MyTypography.title3Medium.fontSize,
                                letterSpacing = MyTypography.title3Medium.letterSpacing,
                                fontWeight = MyTypography.title3Medium.fontWeight,
                                lineHeight = MyTypography.title3Medium.lineHeight,
                                textAlign = TextAlign.Start
                            ),
                            color = SecondaryTextColor
                        )

                        Icon(
                            imageVector = Icons.Outlined.ArrowForwardIos,
                            contentDescription = "Certificate Details",
                            tint = WhiteColor,
                            modifier = Modifier.size(14.dp)
                        )
                    }
                }
            }

        }
    }

    @SuppressLint("UnrememberedMutableInteractionSource")
    @Composable
    fun MyTopBarSideNavLogoProfileIcon(
        modifier: Modifier = Modifier,
        onNavDrawerClick: () -> Unit,
        onProfileClick: () -> Unit
    ) {
        Box(modifier = modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .background(PrimaryTextColor)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .fillMaxHeight(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Navigation Drawer on Left",
                        tint = WhiteColor,
                        modifier = Modifier.clickable(
                            interactionSource =
                            MutableInteractionSource(), indication = null
                        ) {
                            onNavDrawerClick()
                        }
                    )

                    TextStyleComponent.MyHeadlineText(
                        text = "Shweta Fulzele",
                        textColor = WhiteColor,
                        textAlign = TextAlign.Center
                    )

                    Icon(
                        imageVector = Icons.Outlined.AccountCircle,
                        contentDescription = "User Profile",
                        tint = WhiteColor,
                        modifier = Modifier.clickable(
                            interactionSource =
                            MutableInteractionSource(), indication = null
                        ) {
                            onProfileClick()
                        }
                    )
                }
            }
        }

    }

    @Composable
    fun MyTopBarBackBtnTitle(
        modifier: Modifier = Modifier,
        titleText: String,
        backBtnContentDesc: String,
        onBack: () -> Unit
    ) {
        Box(modifier = modifier.fillMaxWidth()) {

            Box(
                modifier = Modifier
                    .background(GreenColor)
                    .fillMaxWidth()
                    .fillMaxHeight(0.07f),
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp)
                    .fillMaxHeight(0.07f),
                horizontalArrangement = Arrangement.Absolute.Left,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(id = R.drawable.back_arrow),
                    contentDescription = backBtnContentDesc,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(12.dp)
                        .clickable {
                            onBack()
                        }
                )

                Spacer(modifier = Modifier.width(30.dp))

                TextStyleComponent.MyTopBarTitleText(text = titleText, textColor = WhiteColor)
            }
        }
    }

    @Composable
    fun TitleWithCardRows(
        navController: NavController
    ) {
        MySubTitleText(
            text = stringResource(id = R.string.unlock_my_achievements),
            modifier = Modifier.padding(horizontal = 16.dp),
            textColor = SecondaryDarkColor,
            textAlign = TextAlign.Center
        )

//        Experience and Projects
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(150.dp),
            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardColors(
                    containerColor = Primary15Color,
                    contentColor = SecondaryTextColor,
                    disabledContentColor = Grey60Color,
                    disabledContainerColor = Green30Color
                ), onClick = {
                    navController.navigate(NavigationDestination.ExperienceScreen.route)
                }
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        imageVector = Icons.Default.Work,
                        contentDescription = "My Work Experience",
                        modifier = Modifier
                            .wrapContentSize()
                    )
                    TextStyleComponent.MySubTitleText(
                        text = stringResource(id = R.string.experience),
                        textColor = Secondary90Color
                    )
                }

            }

            Card(
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardColors(
                    containerColor = Primary15Color,
                    contentColor = SecondaryTextColor,
                    disabledContentColor = Grey60Color,
                    disabledContainerColor = Green30Color
                ), onClick = {
                    navController.navigate(NavigationDestination.ProjectsScreen.route)
                }
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        imageVector = Icons.Default.Adb,
                        contentDescription = "My Projects",
                        modifier = Modifier
                            .wrapContentSize()
                    )
                    TextStyleComponent.MySubTitleText(
                        text = stringResource(id = R.string.projects),
                        textColor = Secondary90Color
                    )
                }
            }
        }

//          Education and Acheivements
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(150.dp),
            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardColors(
                    containerColor = Primary15Color,
                    contentColor = SecondaryTextColor,
                    disabledContentColor = Grey60Color,
                    disabledContainerColor = Green30Color
                ), onClick = {
                    navController.navigate(NavigationDestination.EducationScreen.route)
                }
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        imageVector = Icons.Default.HistoryEdu,
                        contentDescription = "My Education",
                        modifier = Modifier
                            .wrapContentSize()
                    )
                    MySubTitleText(
                        text = stringResource(id = R.string.education),
                        textColor = Secondary90Color
                    )
                }

            }

//            Achievements
            Card(
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardColors(
                    containerColor = Primary15Color,
                    contentColor = SecondaryTextColor,
                    disabledContentColor = Grey60Color,
                    disabledContainerColor = Green30Color
                ), onClick = {
                    navController.navigate(NavigationDestination.AchievementScreen.route)
                }
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "My Acheivements",
                        modifier = Modifier
                            .wrapContentSize()
                    )
                    MySubTitleText(
                        text = stringResource(id = R.string.achievements),
                        textColor = Secondary90Color
                    )
                }
            }
        }
    }

    @Composable
    fun CardWithTitleBody(modifier: Modifier = Modifier, text: Int, textColor: Color = WhiteColor) {
        Row(
            modifier = modifier
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
                    containerColor = SecondaryDarkColor,
                    contentColor = SecondaryTextColor,
                    disabledContentColor = Grey60Color,
                    disabledContainerColor = Green30Color
                )
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.android_logo_white),
                        contentDescription = "Selft Introduction Android Logo",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(50.dp)
                    )
                    TextStyleComponent.MyBasicText(
                        text = stringResource(id = text),
                        textColor = textColor,
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxSize()
                    )
                }

            }

        }
    }

    @Composable
    fun SimpleCardWithTitleBody(modifier: Modifier = Modifier, text: String, textColor: Color = Green50Color) {
        Row(
            modifier = modifier
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
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    TextStyleComponent.MyBasicText(
                        text = text,
                        textColor = textColor,
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxSize()
                    )
                }

            }

        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewHomeScreenUI() {

    Column(modifier = Modifier.fillMaxSize()) {

        MyTopBarSideNavLogoProfileIcon(
            onNavDrawerClick = {},
            onProfileClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        )
        MyTopBarBackBtnTitle(
            titleText = "MyTopBarBackBtnTitle",
            onBack = {},
            backBtnContentDesc = ""
        )
    }

}