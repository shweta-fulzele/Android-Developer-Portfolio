package com.base.portfolio.presentation.module.dashboard.screens.mainscreen

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Cancel
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.CircularImageCardView
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.UsernameWithEmail
import com.base.portfolio.presentation.module.dashboard.screens.aboutme.model.ProfileDetailsModel
import com.base.portfolio.presentation.navigation.NavigationDestination
import com.base.portfolio.theme.theme.Primary30Color
import com.base.portfolio.theme.theme.PrimaryColor
import com.base.portfolio.theme.theme.PrimaryLightColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.theme.theme.typography.MyTypography

@SuppressLint("UnrememberedMutableInteractionSource")
@Composable
fun DrawerContent(
    modifier: Modifier = Modifier,
    navController: NavController,
    onItemClick: () -> Unit
) {
    val profileInfo: ProfileDetailsModel = ProfileDetailsModel()

    val context = LocalContext.current
    val userName = "${profileInfo.firstName} ${profileInfo.lastName}"
    val email = profileInfo.email
    val phoneNumber = profileInfo.primaryMobileNumber
    val linkedinUrl = "https://www.linkedin.com/in/shweta-fulzele/"
    val githubUrl = "https://github.com/shweta-fulzele"
    val hobbiesUrl = "https://www.instagram.com/itsmy_mandala/"
    Column(verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier.verticalScroll(
        rememberScrollState())) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.85f)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    imageVector = Icons.Outlined.Cancel,
                    contentDescription = "Close the Drawer",
                    tint = PrimaryColor,
                    modifier = Modifier.clickable {
                        onItemClick()
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth().clickable {
                                                             navController.navigate(NavigationDestination.AboutMeViewScreen.route)
                },
                horizontalArrangement = Arrangement.Absolute.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                CircularImageCardView(
                    image = R.drawable.profile_pic,
                    modifier = Modifier
                        .size(150.dp)
                        .padding(16.dp)
                )

                UsernameWithEmail(
                    username = userName,
                    email = email,
                    modifier = Modifier.wrapContentSize(),
                    textAlign = TextAlign.Start,
                    userNameColor = PrimaryLightColor,
                    emailColor = WhiteColor
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(Primary30Color)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

//            profile details Me
                Text(
                    text = stringResource(id = R.string.my_profile),
                    style = TextStyle(
                        fontFamily = MyTypography.body3.fontFamily,
                        fontSize = MyTypography.body3.fontSize,
                        letterSpacing = MyTypography.body3.letterSpacing,
                        fontWeight = MyTypography.body3.fontWeight,
                        lineHeight = MyTypography.body3.lineHeight
                    ),
                    color = Color.White,
                    modifier = modifier
                        .wrapContentSize()
                        .clickable {
                            navController.navigate(NavigationDestination.ProfileScreen.route)
                        }
                )

                Spacer(modifier = Modifier.height(12.dp))


//            Education
                Text(
                    text = stringResource(id = R.string.education),
                    style = TextStyle(
                        fontFamily = MyTypography.body3.fontFamily,
                        fontSize = MyTypography.body3.fontSize,
                        letterSpacing = MyTypography.body3.letterSpacing,
                        fontWeight = MyTypography.body3.fontWeight,
                        lineHeight = MyTypography.body3.lineHeight
                    ),
                    color = Color.White,
                    modifier = modifier
                        .wrapContentSize()
                        .clickable {
                            navController.navigate(NavigationDestination.EducationScreen.route)
                        }
                )

                Spacer(modifier = Modifier.height(12.dp))


//            Experience
                Text(
                    text = stringResource(id = R.string.experience),
                    style = TextStyle(
                        fontFamily = MyTypography.body3.fontFamily,
                        fontSize = MyTypography.body3.fontSize,
                        letterSpacing = MyTypography.body3.letterSpacing,
                        fontWeight = MyTypography.body3.fontWeight,
                        lineHeight = MyTypography.body3.lineHeight
                    ),
                    color = Color.White,
                    modifier = modifier
                        .wrapContentSize()
                        .clickable {
                            navController.navigate(NavigationDestination.ExperienceScreen.route)
                        }
                )

                Spacer(modifier = Modifier.height(12.dp))


//            Projects
                Text(
                    text = stringResource(id = R.string.projects),
                    style = TextStyle(
                        fontFamily = MyTypography.body3.fontFamily,
                        fontSize = MyTypography.body3.fontSize,
                        letterSpacing = MyTypography.body3.letterSpacing,
                        fontWeight = MyTypography.body3.fontWeight,
                        lineHeight = MyTypography.body3.lineHeight
                    ),
                    color = Color.White,
                    modifier = modifier
                        .wrapContentSize()
                        .clickable {
                            navController.navigate(NavigationDestination.ProjectsScreen.route)
                        }
                )

                Spacer(modifier = Modifier.height(12.dp))


//            Achievements
                Text(
                    text = stringResource(id = R.string.achievements),
                    style = TextStyle(
                        fontFamily = MyTypography.body3.fontFamily,
                        fontSize = MyTypography.body3.fontSize,
                        letterSpacing = MyTypography.body3.letterSpacing,
                        fontWeight = MyTypography.body3.fontWeight,
                        lineHeight = MyTypography.body3.lineHeight
                    ),
                    color = Color.White,
                    modifier = modifier
                        .wrapContentSize()
                        .clickable {
                            navController.navigate(NavigationDestination.AchievementScreen.route)
                        }
                )

                Spacer(modifier = Modifier.height(12.dp))

//            Certificates
                Text(
                    text = stringResource(id = R.string.certification),
                    style = TextStyle(
                        fontFamily = MyTypography.body3.fontFamily,
                        fontSize = MyTypography.body3.fontSize,
                        letterSpacing = MyTypography.body3.letterSpacing,
                        fontWeight = MyTypography.body3.fontWeight,
                        lineHeight = MyTypography.body3.lineHeight
                    ),
                    color = Color.White,
                    modifier = modifier
                        .wrapContentSize()
                        .clickable {
                            navController.navigate(NavigationDestination.CertificationScreen.route)
                        }
                )

                Spacer(modifier = Modifier.height(12.dp))


//            Technical Skill Set
                Text(
                    text = stringResource(id = R.string.technical_skill_Set),
                    style = TextStyle(
                        fontFamily = MyTypography.body3.fontFamily,
                        fontSize = MyTypography.body3.fontSize,
                        letterSpacing = MyTypography.body3.letterSpacing,
                        fontWeight = MyTypography.body3.fontWeight,
                        lineHeight = MyTypography.body3.lineHeight
                    ),
                    color = Color.White,
                    modifier = modifier
                        .wrapContentSize()
                        .clickable {
                            navController.navigate(NavigationDestination.TechnicalSkills.route)
                        }
                )

                Spacer(modifier = Modifier.height(12.dp))

                //            Hobbies
                Text(
                    text = stringResource(id = R.string.hobbies), textDecoration = TextDecoration.Underline,
                    style = TextStyle(
                        fontFamily = MyTypography.body3.fontFamily,
                        fontSize = MyTypography.body3.fontSize,
                        letterSpacing = MyTypography.body3.letterSpacing,
                        fontWeight = MyTypography.body3.fontWeight,
                        lineHeight = MyTypography.body3.lineHeight
                    ),
                    color = Color.White,
                    modifier = modifier
                        .wrapContentSize()
                        .clickable {
                            val urlIntent = Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse(hobbiesUrl)
                            )
                            context.startActivity(urlIntent)
                        }
                )

            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(Primary30Color)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .wrapContentHeight()
        ) {

//            ContactMe
            Text(
                text = stringResource(id = R.string.contact_me),
                style = TextStyle(
                    fontFamily = MyTypography.body3.fontFamily,
                    fontSize = MyTypography.body3.fontSize,
                    letterSpacing = MyTypography.body3.letterSpacing,
                    fontWeight = MyTypography.body3.fontWeight,
                    lineHeight = MyTypography.body3.lineHeight
                ),
                color = PrimaryColor,
                modifier = modifier
                    .wrapContentSize()
                    .clickable {
                        navController.navigate(NavigationDestination.ContactMe.route)
                    }
            )

            Spacer(modifier = Modifier.height(12.dp))

//            FAQ
            Text(
                text = stringResource(id = R.string.faq),
                style = TextStyle(
                    fontFamily = MyTypography.body3.fontFamily,
                    fontSize = MyTypography.body3.fontSize,
                    letterSpacing = MyTypography.body3.letterSpacing,
                    fontWeight = MyTypography.body3.fontWeight,
                    lineHeight = MyTypography.body3.lineHeight
                ),
                color = PrimaryColor,
                modifier = modifier
                    .wrapContentSize()
                    .clickable {
                        navController.navigate(NavigationDestination.FAQ.route)
                    }
            )

            Spacer(modifier = Modifier.height(12.dp))

            //            Linkedin
            Text(
                text = stringResource(id = R.string.linkedin), textDecoration = TextDecoration.Underline,
                style = TextStyle(
                    fontFamily = MyTypography.body3.fontFamily,
                    fontSize = MyTypography.body3.fontSize,
                    letterSpacing = MyTypography.body3.letterSpacing,
                    fontWeight = MyTypography.body3.fontWeight,
                    lineHeight = MyTypography.body3.lineHeight
                ),
                color = PrimaryColor,
                modifier = modifier
                    .wrapContentSize()
                    .clickable {
                        val urlIntent = Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse(linkedinUrl)
                        )
                        context.startActivity(urlIntent)
                    }
            )

            Spacer(modifier = Modifier.height(12.dp))

            //            FAQ
            Text(
                text = stringResource(id = R.string.github), textDecoration = TextDecoration.Underline,
                style = TextStyle(
                    fontFamily = MyTypography.body3.fontFamily,
                    fontSize = MyTypography.body3.fontSize,
                    letterSpacing = MyTypography.body3.letterSpacing,
                    fontWeight = MyTypography.body3.fontWeight,
                    lineHeight = MyTypography.body3.lineHeight
                ),
                color = PrimaryColor,
                modifier = modifier
                    .wrapContentSize()
                    .clickable {
                        val urlIntent = Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse(githubUrl)
                        )
                        context.startActivity(urlIntent)
                    }
            )

            Spacer(modifier = Modifier.height(12.dp))

//            Go back to Splash Screen

            Text(
                text = stringResource(id = R.string.logout),
                style = TextStyle(
                    fontFamily = MyTypography.body3.fontFamily,
                    fontSize = MyTypography.body3.fontSize,
                    letterSpacing = MyTypography.body3.letterSpacing,
                    fontWeight = MyTypography.body3.fontWeight,
                    lineHeight = MyTypography.body3.lineHeight
                ),
                color = PrimaryColor,
                modifier = modifier
                    .wrapContentSize()
                    .clickable {
                        navController.navigate(NavigationDestination.SplashScreen.route)
                    }
            )

        }

    }
}