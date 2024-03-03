package com.base.portfolio.theme.theme.typography

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

/**
 * TextStyle Data Class to maintain TextStyle configurations
 * fontFamily
 * fontSize
 * letterSpacing
 *
 * @author Shweta Fulzele
 */
data class MyTextStyle(
    val fontFamily: FontFamily,
    val fontSize: TextUnit,
    val letterSpacing: TextUnit = 0.5.sp,
    val lineHeight: TextUnit = 10.5.sp,
    val fontWeight: FontWeight
)