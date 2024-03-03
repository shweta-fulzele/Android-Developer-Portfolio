package com.base.portfolio.utils.userinterfaceutils.uicomponent

import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import android.net.Uri
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowBackIosNew
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.component.HomeUiComponent.CircularImageCardView
import com.base.portfolio.presentation.navigation.NavigationDestination
import com.base.portfolio.theme.theme.BorderStokeColor
import com.base.portfolio.theme.theme.PrimaryColor
import com.base.portfolio.theme.theme.PrimaryTextColor
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.utils.userinterfaceutils.annotation.MultiplePreviews
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyFormText
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.MyBackButtonWithBox
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.MyBackButtonWithoutBox
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.MyDropDownView
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.systemuicontroller.rememberSystemUiController

/**
 * Reusable UI Components sMyh as TextBox, Buttons
 * user is currently using in the application.
 *
 * @author Shweta Fulzele
 */
object UIComponents {

    /**
     * CheckBox to select and unselect
     * Checkbox UI as per Urgent Care
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyCheckBox(
        checkBoxModifier: Modifier = Modifier,
        checkedBorderColor: Color = PrimaryTextColor,
        checkedBoxColor: Color = PrimaryTextColor,
        uncheckedBorderColor: Color = PrimaryTextColor,
        checked: Boolean,
        onCheckedChange: (Boolean) -> Unit
    ) {
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = checkBoxModifier.padding(0.dp),
            colors = CheckboxColors(
                checkedBorderColor = checkedBorderColor,
                checkedBoxColor = checkedBoxColor,
                checkedCheckmarkColor = WhiteColor,
                uncheckedBoxColor = Color.Transparent,
                disabledBorderColor = PrimaryTextColor,
                disabledCheckedBoxColor = Color.Transparent,
                uncheckedBorderColor = uncheckedBorderColor,
                uncheckedCheckmarkColor = Color.Transparent,
                disabledIndeterminateBorderColor = WhiteColor,
                disabledIndeterminateBoxColor = WhiteColor,
                disabledUncheckedBorderColor = WhiteColor,
                disabledUncheckedBoxColor = WhiteColor
            )
        )
    }

    /**
     * Back Button with customizations
     * Back Button without Box
     * Back Button with Border Box
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    private fun MyBackButton(
        modifier: Modifier = Modifier,
        contentDesc: String,
        shape: Shape,
        backgroundColor: Color = Color.Transparent,
        borderWidth: Dp = 1.dp,
        borderColor: Color = WhiteColor,
        showBox: Boolean = true,
        onClick: () -> Unit
    ) {
        Surface(
            color = backgroundColor,
            border = BorderStroke(borderWidth, borderColor),
            shape = shape,
            modifier = modifier.clickable(onClick = onClick)
        ) {
            Image(
                imageVector = Icons.Outlined.ArrowBackIosNew,
                contentDescription = contentDesc,
                modifier = Modifier.padding(4.dp),
                contentScale = ContentScale.Fit
            )
        }
    }

    /**
     * Back Button with customizations
     * Back Button without Box
     * Back Button with Border Box
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyBackButtonWithBox(
        modifier: Modifier = Modifier,
        contentDesc: String,
        onClick: () -> Unit
    ) {
        MyBackButton(
            contentDesc = contentDesc,
            shape = RoundedCornerShape(6.dp),
            modifier = modifier.padding(vertical = 16.dp),
            onClick = onClick
        )
    }

    @Composable
    fun MyBackButtonWithoutBox(
        modifier: Modifier = Modifier,
        contentDesc: String,
        onClick: () -> Unit
    ) {
        Surface(
            color = Color.Transparent,
            modifier = modifier
                .clickable(onClick = onClick)
                .size(38.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.back_arrow),
                contentDescription = contentDesc,
                modifier = Modifier.padding(10.dp),
                contentScale = ContentScale.Fit
            )
        }
    }


    /**
     * Set status bar color as per requirement
     * provide required color as parameter
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun SetStatusBarColor(color: Color) {
        val systemUIController = rememberSystemUiController()
        val darkTheme = !isSystemInDarkTheme()
        DisposableEffect(systemUIController, darkTheme) {
            systemUIController.setStatusBarColor(
                color = color
            )
            onDispose { }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun DropdownBoxWithBorder(
        modifier: Modifier = Modifier,
        items: List<String>,
        selectedItem: String?,
        onItemSelected: (String) -> Unit
    ) {
        var expanded by remember { mutableStateOf(false) }

        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(60.dp)
                .border(1.dp, shape = RoundedCornerShape(8.dp), color = WhiteColor)
                .background(
                    WhiteColor
                )
        ) {
            TextField(
                value = selectedItem ?: "Select Clinic",
                onValueChange = onItemSelected,
                enabled = true,
                readOnly = true,
                modifier = Modifier
                    .wrapContentHeight(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Gray, // Border color when focused
                    unfocusedBorderColor = Color.LightGray, // Border color when not focused
                    disabledBorderColor = Color.LightGray // Border color when disabled
                )
            )

            Spacer(modifier = Modifier.width(8.dp))


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .wrapContentSize(Alignment.TopEnd)
            ) {
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "More"
                    )
                }

                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    items.forEach { item ->
                        DropdownMenuItem(onClick = {
                            onItemSelected(item)
                            expanded = false
                        }, text = { Text(text = item) }, modifier = Modifier.fillMaxWidth())
                    }
                }
            }
        }
    }


    @Composable
    fun MyProgressBarView() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(PrimaryColor)
        ) {
            CircularProgressIndicator(
                modifier = Modifier
                    .size(40.dp)
                    .align(alignment = Alignment.Center), color = PrimaryColor
            )
        }
    }


    @Composable
    fun MyDropDownView(
        modifier: Modifier = Modifier,
        dropdownList: List<String>,
        hint: String,
        inputTextColor: Color = SecondaryTextColor,
        shape: Shape = RoundedCornerShape(8.dp),
        borderColor: Color = BorderStokeColor
    ) {

        var isVisible by remember {
            mutableStateOf(false)
        }

        var selectedItem by remember {
            mutableStateOf("")
        }

        Column {

            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .shadow(0.dp, shape = shape)
                    .border(width = 1.dp, shape = shape, color = borderColor)
            ) {
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    MyFormText(
                        text = if (selectedItem.isBlank()) hint else selectedItem,
                        textColor = inputTextColor,
                        textAlign = TextAlign.Start,
                    )

                    Icon(
                        imageVector = if (isVisible) Icons.Outlined.KeyboardArrowUp else Icons.Outlined.KeyboardArrowDown,
                        contentDescription = "Select Gender Icon",
                        tint = BorderStokeColor,
                        modifier = Modifier.clickable(
                            indication = null,
                            interactionSource = remember {
                                MutableInteractionSource()
                            }) {
                            isVisible = !isVisible
                        }
                    )
                }
            }


            if (isVisible) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .shadow(5.dp)
                        .background(Color.White)
                ) {
                    LazyColumn(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.Start
                    ) {
                        items(dropdownList.size) {
                            MyFormText(
                                text = dropdownList[it], textAlign = TextAlign.Start,
                                modifier = Modifier
                                    .clickable(
                                        indication = null,
                                        interactionSource = remember {
                                            MutableInteractionSource()
                                        }) {
                                        selectedItem = dropdownList[it]
                                        isVisible = false
                                    }
                                    .padding(top = 4.dp, bottom = 4.dp, start = 16.dp),
                            )
                        }
                    }
                }
            }


        }

    }

    @Composable
    fun GradientBox(primaryColor: Color, secondaryColor: Color, midColor: Color) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            primaryColor,
                            secondaryColor,
                            midColor
                        )
                    )
                )
        )
    }

    @Composable
    fun CircularProfilePictureEdit(
        modifier: Modifier = Modifier, imageUrl: Uri?,
        onClick: () -> Unit = {}
    ) {

        if (imageUrl != null) {
            Image(
                painter = rememberImagePainter(imageUrl),
                contentDescription = "Profile Picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)
            )
        } else {
            Image(
                painter = painterResource(id = R.drawable.profile_pic),
                contentDescription = "Profile Picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)
            )
        }

    }

    @Composable
    fun CircularProfilePictureView(
        modifier: Modifier = Modifier, image: Int,
        contentScale: ContentScale = ContentScale.Fit,
        onClick: () -> Unit = {}
    ) {

        Image(
            painter = painterResource(id = image),
            contentDescription = "profile section",
            modifier = modifier
                .size(40.dp)
                .clip(shape = CircleShape)
                .clickable {
                    onClick()
                }
                .shadow(5.dp, shape = CircleShape),
            contentScale = contentScale
        )

    }


    @OptIn(ExperimentalPagerApi::class)
    @Composable
    fun <T> HorizontalPagerScreen(
        modifier: Modifier = Modifier,
        items: List<T>,
        content: @Composable (currentPage: Int, item: T) -> Unit
    ) {
        Column(
            modifier = modifier.fillMaxSize()
        ) {
            val pagerState = rememberPagerState()
            HorizontalPager(
                count = items.size,
                state = pagerState,
                modifier = Modifier.weight(1f)
            ) { currentPage ->
                Box(modifier = Modifier.fillMaxSize()) {
                    content(currentPage, items[currentPage])
                }
            }

            HorizontalPagerIndicator(
                pagerState = pagerState,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .background(Color.Transparent),
            )
        }
    }

    @Composable
    fun MyLazyHorizontalStaggeredGrid(
        modifier: Modifier = Modifier,
        items: List<Int>,
        contentScale: ContentScale,
    ) {
        LazyRow(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            items(items.size, key = { items[it] }) {
                Image(
                    painter = painterResource(id = items[it]),
                    contentDescription = "profile section",
                    modifier = modifier.padding(8.dp)
                        .size(80.dp)
                        .clip(shape = CircleShape),
                    contentScale = contentScale
                )
            }
        }

    }
}

@RequiresApi(Build.VERSION_CODES.O)
@MultiplePreviews
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewUIComponent() {
    Column(verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxSize()) {

//        MyProgressBarView()

        val dropDownList = listOf<String>("Female", "Male")
        MyDropDownView(dropdownList = dropDownList, hint = "")


        MyBackButtonWithBox(contentDesc = "onBackButton", modifier = Modifier.size(28.dp)) {}
        MyBackButtonWithoutBox(contentDesc = "onBackButton") {}
    }
}