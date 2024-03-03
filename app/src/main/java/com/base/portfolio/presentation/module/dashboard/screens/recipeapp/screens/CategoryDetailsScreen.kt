package com.base.portfolio.presentation.module.dashboard.screens.recipeapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.Category
import com.base.portfolio.theme.theme.Green50Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent

@Composable
fun CategoryDetailsScreen(category: Category) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextStyleComponent.MyHeadlineText(
            text = category.strCategory,
            textAlign = TextAlign.Center,
            textColor = Green50Color
        )
        Image(
            painter = rememberAsyncImagePainter(model = category.strCategoryThumb),
            contentDescription = "Food Image",
            modifier = Modifier
                .wrapContentSize()
                .aspectRatio(1f)
        )

        TextStyleComponent.MySubTitleText(
            text = category.strCategoryDescription,
            textColor = GreenColor,
            modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp) .verticalScroll(
                rememberScrollState()
            )
        )

    }
}