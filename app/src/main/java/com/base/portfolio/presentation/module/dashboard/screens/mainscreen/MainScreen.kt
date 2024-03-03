package com.base.portfolio.presentation.module.dashboard.screens.mainscreen

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DrawerDefaults
import androidx.compose.material.DrawerValue
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ModalDrawer
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.rememberDrawerState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.base.portfolio.R
import com.base.portfolio.presentation.module.dashboard.screens.aboutme.screen.AboutMeViewScreen
import com.base.portfolio.presentation.module.dashboard.screens.home.HomeScreen
import com.base.portfolio.presentation.navigation.NavigationDestination
import com.base.portfolio.theme.theme.PrimaryColor
import com.base.portfolio.theme.theme.SecondaryColor
import com.base.portfolio.theme.theme.SecondaryDarkColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.utils.userinterfaceutils.annotation.MultiplePreviews
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.CircularProfilePictureView
import kotlinx.coroutines.launch

@Composable
fun MainScreen(navController: NavController) {
    val context = LocalContext.current
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = WhiteColor)
    ) {
        NavDrawer(navController, context = context)
    }
}


@Composable
fun NavDrawer(navController: NavController, context: Context) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    val profileIcon = R.drawable.profile_pic
    ModalDrawer(
        drawerState = drawerState,
        gesturesEnabled = false, // Enable gestures for the drawer
        drawerContent = {
            DrawerContent(onItemClick = {
                scope.launch {
                    drawerState.close()
                }
            }, navController = navController)
        },
        drawerShape = MaterialTheme.shapes.small,
        drawerElevation = DrawerDefaults.Elevation,
        drawerBackgroundColor = SecondaryDarkColor,
        scrimColor = MaterialTheme.colors.surface.copy(alpha = DrawerDefaults.ScrimOpacity),
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        TextStyleComponent.MyTitleText(
                            text = stringResource(id = R.string.shweta_fulzele),
                            textColor = WhiteColor
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                drawerState.open() // Open the drawer when the menu icon is clicked
                            }
                        }) {
                            Icon(
                                Icons.Filled.Menu, contentDescription = "Menu",
                                tint = PrimaryColor
                            )
                        }
                    },
                    actions = {
                        CircularProfilePictureView(image = profileIcon) {
                            navController.navigate(NavigationDestination.AboutMeViewScreen.route)
                        }

                    },
                    backgroundColor = SecondaryColor,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.07f)
                )
            },
            backgroundColor = SecondaryColor
        ) {
            // Main content
            Box(modifier = Modifier.padding(it)) {
               HomeScreen(navController = navController)
            }
        }
    }


}

@Preview(showBackground = true, showSystemUi = true)
@MultiplePreviews
@Composable
fun PreviewHomeScreen() {
    val navController = rememberNavController()
    MainScreen(navController)
}


//Swipe nav Drawer

/*@Composable
fun HomeScreenUI(navController: NavController) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    *//*  Box(modifier = Modifier.fillMaxSize()) {
           Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
               HomeUiComponent.MyTopBarSideNavLogoProfileIcon(onProfileClick = {
                   navController.navigate(NavRoutes.PROFILE_SCREEN.name)
               }, onNavDrawerClick = {
                   scope.launch {
                       drawerState.apply {
                           if (isClosed) open() else close()
                       }
                   }
               })
           }
       }*//*
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet { }
        },
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Image(
                            painter = painterResource(id = R.drawable.urgent_care_logo),
                            contentDescription = "Splash Screen Background Image",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxWidth()
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                drawerState.apply {
                                    if (isClosed) open() else close()
                                }
                            }
                        }) {
                            Icon(Icons.Filled.Menu, contentDescription = "Menu")
                        }
                    },
                    actions = {
                        IconButton(onClick = {
                            navController.navigate(NavRoutes.PROFILE_SCREEN.name)
                        }) {
                            Icon(Icons.Outlined.AccountCircle, contentDescription = "Profile")
                        }
                    }, colors = TopAppBarColors(
                        containerColor = PrimaryColor,
                        actionIconContentColor = WhiteColor,
                        navigationIconContentColor = WhiteColor,
                        scrolledContainerColor = PrimaryColor,
                        titleContentColor = PrimaryColor
                    )
                )
            },
            containerColor = WhiteColor

        ) { contentPadding ->
            // Screen content
            Box(modifier = Modifier.padding(contentPadding)) {}
        }
    }

}*/

