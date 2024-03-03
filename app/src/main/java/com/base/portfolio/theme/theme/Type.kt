package com.base.urgentcareproject.theme.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.base.portfolio.theme.theme.FontConstants.FontMedium
import com.base.portfolio.theme.theme.FontConstants.FontSemiBold

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 48.sp,
        letterSpacing = 0.sp
    ),

    displayMedium = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 40.sp,
        letterSpacing = 0.5.sp
    ),
    displaySmall = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 32.sp,
        letterSpacing = 0.25.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 24.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 20.sp,
        letterSpacing = 0.5.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 16.sp,
        letterSpacing = 0.5.sp
    ),

    titleLarge = TextStyle(
        fontFamily = FontMedium,
        fontSize = 18.sp,
        letterSpacing = 0.25.sp
    ),

    titleMedium = TextStyle(
        fontFamily = FontMedium,
        fontSize = 16.sp,
        letterSpacing = 0.15.sp
    ),

    titleSmall = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 14.sp,
        letterSpacing = 1.sp
    ),

    bodyLarge = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 24.sp,
        letterSpacing = 1.sp
    ),

    bodyMedium = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 18.sp,
        letterSpacing = 0.8.sp
    ),

    bodySmall = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 16.sp,
        letterSpacing = 0.5.sp,
    ),

    labelLarge = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 14.sp,
        letterSpacing = 0.25.sp,
    ),

    labelMedium = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 12.sp,
        letterSpacing = 0.2.sp,
    ),

    labelSmall = TextStyle(
        fontFamily = FontSemiBold,
        fontSize = 10.sp,
        letterSpacing = 0.4.sp,
    )

)