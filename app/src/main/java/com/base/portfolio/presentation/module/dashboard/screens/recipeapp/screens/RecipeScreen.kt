package com.base.portfolio.presentation.module.dashboard.screens.recipeapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.base.portfolio.domain.remote.retrofit.listener.UIState
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.Category
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.RecipeCategoryRes
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.viewmodel.RecipeViewModel
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MySubTitleText


@Composable
fun RecipeScreen(
    navigate: (Category) -> Unit = {}
) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        RecipeScreenUI(navigate)
    }
}

@Composable
fun RecipeScreenUI(navigate: (Category) -> Unit) {
    val viewModel: RecipeViewModel = hiltViewModel()
    val categoryState by viewModel.categoryRes.collectAsState()

    viewModel.fetchData()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        when (categoryState) {
            is UIState.Loading -> {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CircularProgressIndicator()
                }
            }

            is UIState.Success<*> -> {
                val recipeList = (categoryState as UIState.Success<RecipeCategoryRes>).data
                CategoryScreenUI(recipeList.categories) {
                    navigate(it)
                }
            }

            is UIState.Error -> {
                val errorMessage = (categoryState as UIState.Error).error.message

                Text(
                    text = errorMessage,
                    style = TextStyle(fontSize = 18.sp),
                    modifier = Modifier.padding(16.dp),
                    color = Color.Red
                )
            }

            else -> {
                val recipeList = (categoryState as UIState.Success<RecipeCategoryRes>).data
                CategoryScreenUI(recipeList.categories) {
                    navigate(it)
                }
            }
        }
    }
}

@Composable
fun CategoryScreenUI(categories: List<Category>, navigate: (Category) -> Unit) {
    LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.fillMaxSize()) {
        items(categories.size) { index ->
            CategoryItem(category = categories[index]) {
                navigate(it)
            }
        }
    }
}

@Composable
fun CategoryItem(category: Category, navigate: (Category) -> Unit) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(Color.White)
            .clickable {
                navigate(category)
            },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Card(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .shadow(10.dp, shape = RoundedCornerShape(16.dp))
                .clip(shape = RoundedCornerShape(16.dp))
                .background(
                    Color.White
                )
        ) {
            Image(
                painter = rememberAsyncImagePainter(category.strCategoryThumb),
                contentDescription = "Category Image",
                modifier = Modifier
                    .aspectRatio(1f)
                    .fillMaxWidth()
            )

            MySubTitleText(
                text = category.strCategory,
                textColor = SecondaryTextColor,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
            )
        }

    }
}
