package com.base.portfolio.theme.theme.typography

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.base.portfolio.theme.theme.FontConstants.FontExtraBold
import com.base.portfolio.theme.theme.FontConstants.FontMedium
import com.base.portfolio.theme.theme.FontConstants.FontRegular
import com.base.portfolio.theme.theme.FontConstants.FontSemiBold

/**
 * Typography includes TextStyles as per Application
 * H1 H2 H3 H4 H5 H6
 * Title Large, Medium, Small
 * B1 B2 B3 B4 B5 B6
 * Button Text
 * Error Text
 * Hyperlink Text
 *
 * @author Shweta Fulzele
 */
object MyTypography {

    /**
     * Headline H5 TextStyle
     * fontFamily = FontSemiBold,
     * fontSize = 20.sp,
     * letterSpacing = 0.5.sp
     *
     * @author Shweta Fulzele
     */
    val h5: MyTextStyle = MyTextStyle(
        fontFamily = FontSemiBold,
        fontSize = 20.sp,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 30.sp
    )

    /**
     * Headline H4 TextStyle
     * fontFamily = FontSemiBold,
     * fontSize = 20.sp,
     * letterSpacing = 0.5.sp
     *
     * @author Shweta Fulzele
     */
    val h4: MyTextStyle = MyTextStyle(
        fontFamily = FontMedium,
        fontSize = 16.sp,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 22.sp
    )

    /**
     * Headline H6 TextStyle
     * fontFamily = FontExtraBold,
     * fontSize = 36.sp,
     * letterSpacing = 0.5.sp,
     * fontWeight = FontWeight.W800,
     * lineHeight = 55.sp
     *
     * @author Shweta Fulzele
     */
    val h6: MyTextStyle = MyTextStyle(
        fontFamily = FontExtraBold,
        fontSize = 36.sp,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight.W800,
        lineHeight = 55.sp
    )

    /**
     * Title 3 Regular TextStyle
     *  fontFamily = FontRegular,
     *  fontSize = 14.sp,
     *  letterSpacing = 0.1.sp,
     *  lineHeight = 19.6.sp,
     *  fontWeight = FontWeight.W500
     *
     * @author Shweta Fulzele
     */
    val title3Regular: MyTextStyle = MyTextStyle(
        fontFamily = FontRegular,
        fontSize = 14.sp,
        letterSpacing = 0.1.sp,
        lineHeight = 19.6.sp,
        fontWeight = FontWeight.W500
    )

    /**
     * Title Small TextStyle
     *   fontFamily = FontMedium,
     *   fontSize = 14.sp,
     *   letterSpacing = 0.1.sp,
     *   lineHeight = 19.6.sp,
     *   fontWeight = FontWeight.W600
     *
     *
     * @author Shweta Fulzele
     */
    val title3Medium: MyTextStyle = MyTextStyle(
        fontFamily = FontMedium,
        fontSize = 14.sp,
        letterSpacing = 0.1.sp,
        lineHeight = 19.6.sp,
        fontWeight = FontWeight.W600
    )

    /**
     *   fontFamily = FontSemiBold,
     *   fontSize = 18.sp,
     *   letterSpacing = 0.8.sp,
     *   fontWeight = FontWeight.W700,
     *   lineHeight = 27.sp
     *
     * @author Shweta Fulzele
     */
    val body2: MyTextStyle = MyTextStyle(
        fontFamily = FontSemiBold,
        fontSize = 18.sp,
        letterSpacing = 0.8.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 27.sp

    )

    /**
     * Body B3 TextStyle
     * fontFamily = FontSemiBold,
     * fontSize = 16.sp,
     * letterSpacing = 0.5.sp
     *
     * @author Shweta Fulzele
     */
    val body3: MyTextStyle = MyTextStyle(
        fontFamily = FontSemiBold,
        fontSize = 16.sp,
        letterSpacing = 0.5.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.W600
    )

    /**
     * Body B5 Regular TextStyle
     * fontFamily = FontRegular,
     * fontSize = 12.sp,
     * letterSpacing = 1.sp,
     * lineHeight = 15.6.sp,
     * fontWeight = FontWeight.W500
     *
     *
     * @author Shweta Fulzele
     */
    val body5Regular: MyTextStyle = MyTextStyle(
        fontFamily = FontRegular,
        fontSize = 12.sp,
        letterSpacing = 0.5.sp,
        lineHeight = 15.6.sp,
        fontWeight = FontWeight.W500
    )

    /**
     * Body B5 Medium TextStyle
     * fontFamily = FontRegular,
     * fontSize = 12.sp,
     * letterSpacing = 0.1.sp,
     * lineHeight = 15.6.sp,
     * fontWeight = FontWeight.W500
     *
     *
     * @author Shweta Fulzele
     */
    val body5Medium: MyTextStyle = MyTextStyle(
        fontFamily = FontMedium,
        fontSize = 12.sp,
        letterSpacing = 0.1.sp,
        lineHeight = 15.6.sp,
        fontWeight = FontWeight.W600
    )

    /**
     * Body 6 Medium TextStyle for Button Text
     * fontFamily = FontSemiBold,
     *         fontSize = 10.sp,
     *         letterSpacing = 0.4.sp,
     *         fontWeight = FontWeight.W500,
     *         lineHeight = 12.sp
     *
     *
     * @author Shweta Fulzele
     */
    val body6Medium: MyTextStyle = MyTextStyle(
        fontFamily = FontSemiBold,
        fontSize = 10.sp,
        letterSpacing = 0.4.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 12.sp
    )
    /**
     * Button Small TextStyle for Button Text
     * fontFamily = FontRegular,
     * fontSize = 14.sp,
     * letterSpacing = 0.25.sp,
     * fontWeight = FontWeight.W600,
     * lineHeight = 19.6.sp
     *
     *
     * @author Shweta Fulzele
     */
    val buttonSmall: MyTextStyle = MyTextStyle(
        fontFamily = FontMedium,
        fontSize = 14.sp,
        letterSpacing = 0.25.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 19.6.sp
    )

    /**
     * Button CTA Small TextStyle for Button Text
     * fontFamily = FontRegular,
     * fontSize = 16.sp,
     * letterSpacing = 0.25.sp,
     * fontWeight = FontWeight.W600,
     * lineHeight = 19.84.sp
     *
     *
     * @author Shweta Fulzele
     */
    val buttonCTALarge: MyTextStyle = MyTextStyle(
        fontFamily = FontSemiBold,
        fontSize = 16.sp,
        letterSpacing = 0.25.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 19.84.sp
    )

}