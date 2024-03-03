package com.base.portfolio.presentation.module.dashboard.screens.aboutme.model

import android.graphics.drawable.Drawable
import androidx.compose.ui.res.painterResource
import com.base.portfolio.R

data class ProfileDetailsModel(
    val firstName: String = "Shweta",
    val lastName: String = "Fulzele",
    val email: String = "fulzeleshweta4@gmail.com",
    val image: Int =  R.drawable.profile_pic,
    val address: String = "Baner",
    val city: String = "Pune",
    val state: String = "Maharashtra",
    val pincode: String = "411045",
    val birthDate: String = "19/12/1996",
    val country: String = "India",
    val currentLocation: String = "Pune",
    val nativeLocation: String = "Rajura, Chandrapur",
    val gender: String = "Female",
    val primaryMobileNumber: String = "7066----",
    val secondaryMobileNumber: String = "98347-----"

)