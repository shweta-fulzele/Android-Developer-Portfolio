package com.base.portfolio.presentation.navigation

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

/**
 * Top level composable that represents screens for the application.
 */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyNavApp(context: Context,navController: NavHostController = rememberNavController()) {
    MyAppNavGraph(context,navController = navController)
}