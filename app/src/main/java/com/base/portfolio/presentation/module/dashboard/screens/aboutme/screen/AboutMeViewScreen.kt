package com.base.portfolio.presentation.module.dashboard.screens.aboutme.screen

import android.Manifest
import android.content.Context
import android.net.Uri
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.base.portfolio.presentation.navigation.NavigationDestination
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.CircularImageCardWithEditIcon
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.MyTopBarBackBtnTitle
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.ProfileRoundedCornerCard
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.UsernameWithEmail
import com.base.portfolio.presentation.module.dashboard.screens.aboutme.model.ProfileDetailsModel
import com.base.portfolio.theme.theme.Green30Color
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.theme.theme.PrimaryColor
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.utils.apputils.Logger
import com.base.portfolio.utils.userinterfaceutils.annotation.MultiplePreviews
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils.MySmallSecondaryButton
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ImageUtils.rememberGalleryLauncher
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyTitleWithDisabledInputBox
import com.base.portfolio.utils.userinterfaceutils.uicomponent.MyAlertUiComponent.MySimpleCustomAlert
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState


@Composable
fun AboutMeViewScreen(navController: NavController) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = WhiteColor)
    ) {
        AboutMeViewScreenUI(navController)
    }
}


@Composable
fun AboutMeViewScreenUI(navController: NavController) {
    val context = LocalContext.current
    val profileDetailsModel: ProfileDetailsModel = ProfileDetailsModel()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(WhiteColor)
    ) {

        Column(modifier = Modifier.background(WhiteColor)) {
            MyTopBarBackBtnTitle(
                titleText = stringResource(id = R.string.profile_details),
                backBtnContentDesc = "Profile Details Back Button"
            ) {
                navController.popBackStack()
            }
            AboutMeViewContent(
                context,
                navController,
                profileInfo = profileDetailsModel
            )
        }
    }
}

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun AboutMeViewContent(
    context: Context,
    navController: NavController,
    profileInfo: ProfileDetailsModel
) {

    val permissionStates = rememberMultiplePermissionsState(
        permissions = listOf(
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
    )

    var hasStoragePermission by remember {
        mutableStateOf(false)
    }

    hasStoragePermission = permissionStates.allPermissionsGranted

    var selectedImageUri by remember { mutableStateOf<Uri?>(null) }

    val galleryLauncher = rememberGalleryLauncher(context)

    val galleryResultLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let {
            selectedImageUri = it
        }
    }
    var shouldShowPermissionAlert by remember {
        mutableStateOf(Pair(false, ""))
    }

    var shouldAskStoragePermission by remember {
        mutableStateOf(false)
    }

    val permissionsArray = arrayListOf<String>()
    permissionsArray.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
    permissionsArray.add(Manifest.permission.READ_EXTERNAL_STORAGE)

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        permissionsArray.add(Manifest.permission.READ_MEDIA_IMAGES)
    }
    Logger.debug("Toggle", "Logged in if condition")
    val launcher = rememberLauncherForActivityResult(contract =

    ActivityResultContracts.RequestMultiplePermissions(), onResult = {
        Logger.debug("Toggle", "Logged in Result $it")
        if (it[Manifest.permission.READ_EXTERNAL_STORAGE] == true
            || it[Manifest.permission.WRITE_EXTERNAL_STORAGE] == true
        ) {
            galleryLauncher.launch("image/*")

        } else if (it[Manifest.permission.READ_MEDIA_IMAGES] == true) {
            galleryLauncher.launch("image/*")
        } else {
            shouldShowPermissionAlert = Pair(
                true,
                context.resources.getString(R.string.you_have_denied_storage_permissions)
            )
        }
        shouldAskStoragePermission = false
    })


    if (shouldShowPermissionAlert.first) {
        MySimpleCustomAlert(
            message = shouldShowPermissionAlert.second
        ) {
            shouldShowPermissionAlert = Pair(false, "")
        }
    }

    val userName = "${profileInfo.firstName} ${profileInfo.lastName}"
    val email = profileInfo.email
    val primaryMobileNumber = profileInfo.primaryMobileNumber
    val secondaryMobileNumber = profileInfo.secondaryMobileNumber
    val address = profileInfo.address
    val country = profileInfo.country
    val state = profileInfo.state
    val city = profileInfo.city
    val pincode = profileInfo.pincode
    val gender = profileInfo.gender
    val dob = profileInfo.birthDate
    val imageUrl = profileInfo.image

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

                Box(
                    modifier = Modifier.background(GreenColor)
                        .fillMaxWidth()
                        .height(boxHeight + 84.dp),
                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .zIndex(3f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(
                        modifier = Modifier
                            .height(boxHeight + 15.dp)
                            .background(WhiteColor)
                    )

                    //                  Circular Image Card
                    HomeUiComponent.CircularImageCardView(
                        image = R.drawable.profile_pic,
                        modifier = Modifier.size(150.dp)
                    )

//                 Username && Email
                    UsernameWithEmail(
                        username = userName,
                        email = email
                    )

                  /*  MySmallSecondaryButton(
                        btnText = stringResource(id = R.string.edit_profile_details),
                        modifier = Modifier.wrapContentHeight(),
                        borderColor = Green50Color,
                        textColor = Green50Color
                    ) {
                        navController.navigate(NavigationDestination.AboutMeEditScreen.route)
                    }*/

                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

//            User Name
                        MyTitleWithDisabledInputBox(
                            title = stringResource(id = R.string.name),
                            value = userName,
                            borderColor = Green30Color,
                            textColor = SecondaryTextColor,
                            inputTextColor = GreenColor
                        )

//            User Primary Mobile Number
                        MyTitleWithDisabledInputBox(
                            title = stringResource(id = R.string.primary_mobile_number),
                            value = primaryMobileNumber,
                            borderColor = Green30Color,
                            textColor = SecondaryTextColor,
                            inputTextColor = GreenColor
                        )

                        //            User Secondary Mobile Number
                        MyTitleWithDisabledInputBox(
                            title = stringResource(id = R.string.secondary_mobile_number),
                            value = secondaryMobileNumber,
                            borderColor = Green30Color,
                            textColor = SecondaryTextColor,
                            inputTextColor = GreenColor
                        )

//            User DOB
                        TextStyleComponent.MyTitleWithDisabledInputBoxWithTrailingIcon(
                            title = stringResource(id = R.string.date_of_birth),
                            value = dob,
                            borderColor = Green30Color,
                            textColor = SecondaryTextColor,
                            inputTextColor = GreenColor
                        ) {

                        }

//            User Gender
                        TextStyleComponent.MyTitleWithDisabledInputBoxDropDownIcon(
                            title = stringResource(id = R.string.gender),
                            value = gender,
                            borderColor = Green30Color,
                            textColor = SecondaryTextColor,
                            inputTextColor = GreenColor,
                            trailingIconColor = Green30Color
                        )

//            User Address
                        MyTitleWithDisabledInputBox(
                            title = stringResource(id = R.string.address),
                            value = address,
                            borderColor = Green30Color,
                            textColor = SecondaryTextColor,
                            inputTextColor = GreenColor
                        )

                        //            User Address
                        MyTitleWithDisabledInputBox(
                            title = stringResource(id = R.string.country),
                            value = country,
                            borderColor = Green30Color,
                            textColor = SecondaryTextColor,
                            inputTextColor = GreenColor
                        )

                        //            User Address
                        MyTitleWithDisabledInputBox(
                            title = stringResource(id = R.string.state),
                            value = state,
                            borderColor = Green30Color,
                            textColor = SecondaryTextColor,
                            inputTextColor = GreenColor
                        )


                        //            User Address
                        MyTitleWithDisabledInputBox(
                            title = stringResource(id = R.string.city),
                            value = city,
                            borderColor = Green30Color,
                            textColor = SecondaryTextColor,
                            inputTextColor = GreenColor
                        )

                        //            User Address
                        MyTitleWithDisabledInputBox(
                            title = stringResource(id = R.string.pincode),
                            value = pincode,
                            borderColor = Green30Color,
                            textColor = SecondaryTextColor,
                            inputTextColor = GreenColor
                        )
                    }

                }

//              RoundedCornerCard
                ProfileRoundedCornerCard(boxHeight)
            }
        }

    }


}

@Preview(showBackground = true, showSystemUi = true)
@MultiplePreviews
@Composable
fun PreviewAboutMeViewScreen() {
    val navController = rememberNavController()
    AboutMeViewScreen(navController)
}




