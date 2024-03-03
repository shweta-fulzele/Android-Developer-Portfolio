package com.base.portfolio.presentation.module.dashboard.screens.technicalskills.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.screens.home.HomeScreenUI
import com.base.portfolio.presentation.module.dashboard.screens.technicalskills.model.technicalSkillsImages
import com.base.portfolio.presentation.module.dashboard.screens.technicalskills.model.technicalSkillsList
import com.base.portfolio.theme.theme.Green100Color
import com.base.portfolio.theme.theme.Green30Color
import com.base.portfolio.theme.theme.GreenColor
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MySubTitleText
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.MyLazyHorizontalStaggeredGrid

@Composable
fun TechnicalSkillsScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        TechnicalSkillsContentUI()
    }
}

@Composable
fun TechnicalSkillsContentUI() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        LazyColumn(modifier = Modifier.padding(vertical = 16.dp)) {
            items(technicalSkillsList.size) {
                Column(
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .clip(
                                RoundedCornerShape(8.dp)
                            )
                            .background(Green30Color)

                            .padding(horizontal = 16.dp, vertical = 8.dp)

                    )
                    {
                        MySubTitleText(
                            text = technicalSkillsList[it],
                            textColor = Green100Color,
                            modifier = Modifier
                                .wrapContentSize()
                                .padding(8.dp)
                        )
                    }

                }

            }
        }
    }
}