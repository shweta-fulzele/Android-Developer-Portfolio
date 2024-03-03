package com.base.portfolio.presentation.module.dashboard.screens.aboutme.screen

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.MyTopBarBackBtnTitle
import com.base.portfolio.presentation.module.dashboard.screens.aboutme.model.ProfileDetailsModel
import com.base.portfolio.presentation.navigation.NavigationDestination
import com.base.portfolio.theme.theme.Green30Color
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.utils.userinterfaceutils.annotation.MultiplePreviews
import com.base.portfolio.utils.userinterfaceutils.uicomponent.ButtonUiUtils.MyCancelAndSaveButton
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyTitleWithDropDownInputBox
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyTitleWithSimpleInputBox


@Composable
fun AboutMeEditScreen(navController: NavController) {
    val context = LocalContext.current
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        AboutMeEditScreenUI(navController, context = context)
    }
}


@Composable
fun AboutMeEditScreenUI(navController: NavController, context: Context) {
    //    Initializations

    val profileViewModel = ProfileDetailsModel()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Column(modifier = Modifier.background(Color.White)) {
            MyTopBarBackBtnTitle(
                titleText = stringResource(id = R.string.profile_details),
                backBtnContentDesc = "Profile Details Back Button"
            ) {
                navController.popBackStack()
            }
            AboutMeEditContent(
                navController,
                context = context,
                profileInfo = profileViewModel)
        }
    }
}

@Composable
fun AboutMeEditContent(
    navController: NavController, context: Context,
    profileInfo: ProfileDetailsModel?) {
    var userFirstName by remember {
        mutableStateOf(profileInfo?.firstName)
    }

    var userLastName by remember {
        mutableStateOf(profileInfo?.lastName)
    }

    var mobileNumber by remember {
        mutableStateOf(profileInfo?.primaryMobileNumber)
    }

    var userDOB by remember {
        mutableStateOf(profileInfo?.birthDate)
    }

    var userGender by remember {
        mutableStateOf(profileInfo?.gender)
    }

    var userAddress by remember {
        mutableStateOf(profileInfo?.address)
    }

    var userCountry by remember {
        mutableStateOf(profileInfo?.country)
    }


    var userState by remember {
        mutableStateOf(profileInfo?.state)
    }


    var userCity by remember {
        mutableStateOf(profileInfo?.city)
    }

    var userPincode by remember {
        mutableStateOf(profileInfo?.pincode)
    }


    val dropDownList = listOf<String>("Female", "Male")

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
//            User First Name
            MyTitleWithSimpleInputBox(
                title = stringResource(id = R.string.first_name),
                value = userFirstName ?: "",
                onValueChange = {
                    userFirstName = it
                }, hint = stringResource(id = R.string.first_name),
                borderColor = Green30Color,
                textColor = SecondaryTextColor
            )

            //            User Last Name
            MyTitleWithSimpleInputBox(
                title = stringResource(id = R.string.last_name),
                value = userLastName ?: "",
                onValueChange = {
                    userLastName = it
                }, hint = stringResource(id = R.string.last_name),  borderColor = Green30Color,
                textColor = SecondaryTextColor
            )

//            User Mobile Number
            MyTitleWithSimpleInputBox(
                title = stringResource(id = R.string.mobile_number),
                value = mobileNumber ?: "",
                hint = stringResource(id = R.string.mobile_number),
                borderColor = Green30Color,
                textColor = SecondaryTextColor,
                onValueChange = { phone ->
                    mobileNumber = phone
                })

//            User DOB
            MyTitleWithSimpleInputBox(
                title = stringResource(id = R.string.date_of_birth),
                value = userDOB ?:"",
                hint = stringResource(id = R.string.date_of_birth),
                onValueChange = { dob ->
                    userDOB = dob
                },
                borderColor = Green30Color,
                textColor = SecondaryTextColor)

//            User Gender
            MyTitleWithDropDownInputBox(
                title = stringResource(id = R.string.gender),
                dropDownList = dropDownList,
                hint = userGender ?: "Select Gender",
                borderColor = Green30Color,
                textColor = SecondaryTextColor,
                inputTextColor = SecondaryTextColor
            )

//            User Address
            MyTitleWithSimpleInputBox(
                title = stringResource(id = R.string.address),
                value = userAddress ?:"",
                hint = stringResource(id = R.string.address),
                onValueChange = { uAddress ->
                    userAddress = uAddress
                },
                borderColor = Green30Color,
                textColor = SecondaryTextColor)

            //            User Country
            MyTitleWithSimpleInputBox(
                title = stringResource(id = R.string.country),
                value = userCountry ?: "",
                borderColor = Green30Color,
                textColor = SecondaryTextColor,
                hint = stringResource(id = R.string.country),
                onValueChange = { country ->
                    userCountry = country
                })

            //            User State
            MyTitleWithSimpleInputBox(
                title = stringResource(id = R.string.state),
                value = userState ?:"",
                borderColor = Green30Color,
                textColor = SecondaryTextColor,
                hint = stringResource(id = R.string.state),
                onValueChange = { state ->
                    userState = state
                })


            //            User City
            MyTitleWithSimpleInputBox(
                title = stringResource(id = R.string.city),
                value = userCity ?:"",
                borderColor = Green30Color,
                textColor = SecondaryTextColor,
                hint = stringResource(id = R.string.city),
                onValueChange = { city ->
                    userCity = city
                })


            //            User Pincode
            MyTitleWithSimpleInputBox(
                title = stringResource(id = R.string.pincode),
                value = userPincode ?:"",
                borderColor = Green30Color,
                textColor = SecondaryTextColor,
                hint = stringResource(id = R.string.pincode),
                onValueChange = { pin ->
                    userPincode = pin
                })

            Spacer(modifier = Modifier.height(24.dp))

//            Cancel and Save Button
            MyCancelAndSaveButton(
                onCancelClick = { navController.navigate(NavigationDestination.AboutMeViewScreen.route) },
                onSaveClick = {
//                              onSave
                              navController.navigate(NavigationDestination.AboutMeViewScreen.route)
                },
                btnTextLeft = stringResource(id = R.string.cancel),
                btnTextRight = stringResource(id = R.string.success)
            )

        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@MultiplePreviews
@Composable
fun PreviewAboutMeEditScreen() {
    val navController = rememberNavController()
    AboutMeEditScreen(navController)
}




