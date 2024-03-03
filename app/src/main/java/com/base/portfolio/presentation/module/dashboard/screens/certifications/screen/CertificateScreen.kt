package com.base.portfolio.presentation.module.dashboard.screens.certifications.screen

import android.content.Context
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.PhoneForwarded
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent
import com.base.portfolio.presentation.module.dashboard.screens.certifications.model.CertificateModel
import com.base.portfolio.presentation.module.onboarding.component.OBUIComponent
import com.base.portfolio.presentation.module.onboarding.module.screens.preview.createItems
import com.base.portfolio.presentation.navigation.NavigationDestination
import com.base.portfolio.theme.theme.Green100Color
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.theme.theme.Secondary30Color
import com.base.portfolio.theme.theme.Secondary90Color
import com.base.portfolio.theme.theme.SecondaryDarkColor
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPagerIndicator
import kotlinx.coroutines.launch
import kotlin.math.absoluteValue

@Composable
fun CertificateScreen(navController: NavController) {
    val context = LocalContext.current

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
    ) {
        CertificateScreenUI(navController, context)
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CertificateScreenUI(navController: NavController, context: Context) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        UIComponents.GradientBox(
            primaryColor = Green100Color,
            secondaryColor = Green50Color,
            midColor = GreenColor
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            val items = certificateItems()
            val pagerState = com.google.accompanist.pager.rememberPagerState()

            com.google.accompanist.pager.HorizontalPager(
                count = items.size,
                state = pagerState,
                modifier = Modifier.weight(1f)
            ) { currentPage ->

                val certificateModel = items[currentPage]

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = certificateModel.certificateImage),
                        contentDescription = certificateModel.certificateName,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .padding(24.dp)
                            .clip(RoundedCornerShape(24.dp))
                    )
                }
            }

            HorizontalPagerIndicator(
                pagerState = pagerState,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(16.dp)
                    .background(Color.Transparent),
            )
        }
    }

}

fun certificateItems() = listOf<CertificateModel>(
    CertificateModel(
        certificateImage = R.drawable.android_14_certificate,
        certificateName = "The Complete Android 14 and Kotlin Development Masterclass"
    ),
    CertificateModel(
        certificateImage = R.drawable.mangtas_certificate,
        certificateName = "The Complete Android 14 and Kotlin Development Masterclass"
    ),
    CertificateModel(
        certificateImage = R.drawable.jetpack_compose,
        certificateName = "The Complete Android 14 and Kotlin Development Masterclass"
    ),

    CertificateModel(
        certificateImage = R.drawable.awscertified,
        certificateName = "The Complete Android 14 and Kotlin Development Masterclass"
    ),
    CertificateModel(
        certificateImage = R.drawable.awsinnovate,
        certificateName = "The Complete Android 14 and Kotlin Development Masterclass"
    ),

    CertificateModel(
        certificateImage = R.drawable.thinkatone,
        certificateName = "The Complete Android 14 and Kotlin Development Masterclass"
    ),
    CertificateModel(
        certificateImage = R.drawable.aboveandbeyond,
        certificateName = "The Complete Android 14 and Kotlin Development Masterclass"
    ),
    CertificateModel(
        certificateImage = R.drawable.carromvolunteer,
        certificateName = "The Complete Android 14 and Kotlin Development Masterclass"
    )

)

