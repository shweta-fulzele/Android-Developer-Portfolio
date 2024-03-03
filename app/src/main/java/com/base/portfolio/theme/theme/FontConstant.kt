package com.base.portfolio.theme.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.base.portfolio.R

/**
 * Font Figtree as per Application
 * FigTreeBlack
 * FigTreeBold
 * FigTreeExtraBold
 * FigTreeLight
 * FigTreeMedium
 * FigTreeRegular
 * FigTreeSemiBold
 *
 *
 * @author Shweta Fulzele
 */
object FontConstants {
    private val FigTreeBlack = Font(R.font.figtreeblack)
    private val FigTreeBold = Font(R.font.figtreebold)
    private val FigTreeExtraBold = Font(R.font.figtreeextrabold)
    private val FigTreeLight = Font(R.font.figtreelight)
    private val FigTreeMedium = Font(R.font.figtreemedium)
    private val FigTreeRegular = Font(R.font.figtreeregular)
    private val FigTreeSemiBold = Font(R.font.figtreesemibold)

    val FontBlack = FontFamily(FigTreeBlack)
    val FontBold = FontFamily(FigTreeBold)
    val FontExtraBold = FontFamily(FigTreeExtraBold)
    val FontLight = FontFamily(FigTreeLight)
    val FontMedium = FontFamily(FigTreeMedium)
    val FontRegular = FontFamily(FigTreeRegular)
    val FontSemiBold = FontFamily(FigTreeSemiBold)

}