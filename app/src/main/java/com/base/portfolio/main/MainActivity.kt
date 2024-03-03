package com.base.portfolio.main


import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.base.portfolio.presentation.navigation.MyNavApp
import com.base.portfolio.theme.theme.BlackColor
import com.base.portfolio.theme.theme.PrimaryTextColor
import com.base.portfolio.theme.theme.UrgentCareProjectTheme
import com.base.portfolio.utils.apputils.BaseActivity
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.SetStatusBarColor
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {


    //    val viewModel = OnboardingViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UrgentCareProjectTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    // This will allows app to draw under OS status bar
                    val systemUiController = rememberSystemUiController()
                    systemUiController.isStatusBarVisible = false

                    SetStatusBarColor(BlackColor)

                    MyNavApp(this@MainActivity)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UrgentCareProjectTheme {
        val context = LocalContext.current
//        UrgentCareNavApp(context)
    }
}