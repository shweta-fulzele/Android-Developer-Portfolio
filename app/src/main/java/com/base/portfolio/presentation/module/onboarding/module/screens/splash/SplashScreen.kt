package com.base.portfolio.presentation.module.onboarding.module.screens.splash

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.base.portfolio.BuildConfig
import com.base.portfolio.R
import com.base.portfolio.presentation.module.onboarding.component.OBUIComponent.HeadlineWithBody
import com.base.portfolio.presentation.navigation.NavigationDestination
import com.base.portfolio.theme.theme.PrimaryDarkColor
import com.base.portfolio.theme.theme.Secondary30Color
import com.base.portfolio.theme.theme.Secondary90Color
import com.base.portfolio.theme.theme.SecondaryDarkColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.utils.apputils.constant.navconstants.NavRoutes
import com.base.portfolio.utils.userinterfaceutils.annotation.MultiplePreviews
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils.MyPrimaryBgButton
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.GradientBox

@Composable
fun SplashScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = PrimaryDarkColor
    ) {
        val context = LocalContext.current
        SplashScreenUI(
            context,
            navController
        )
    }
}

@Composable
fun SplashScreenUI(context: Context, navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        GradientBox(
            primaryColor = SecondaryDarkColor,
            secondaryColor = Secondary30Color,
            midColor = Secondary90Color
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(16.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.android_logo_white),
                contentDescription = "Android Logo",
                contentScale = ContentScale.Fit
            )
            HeadlineWithBody(
                headlineText = stringResource(id = R.string.shweta_fulzele),
                bodyText = stringResource(
                    id = R.string.android_developer
                ),
            )
            Column(
                modifier = Modifier
                    .padding(horizontal = 18.dp, vertical = 24.dp)
                    .fillMaxWidth()
                    .wrapContentHeight(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                MyPrimaryBgButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .wrapContentHeight(),
                    btnText = stringResource(id = R.string.welcome)
                ) {
                    navController.navigate(NavigationDestination.PreviewScreen.route)
                }

            }


        }

    }


}


@Preview(showBackground = true, showSystemUi = true)
@MultiplePreviews
@Composable
fun PreviewSplashScreen() {
    val navController: NavHostController = rememberNavController()
    SplashScreen(
        navController
    )
}
