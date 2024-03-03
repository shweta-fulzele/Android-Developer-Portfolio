package com.base.portfolio.presentation.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.base.portfolio.presentation.module.dashboard.screens.aboutme.screen.AboutMeEditScreen
import com.base.portfolio.presentation.module.dashboard.screens.aboutme.screen.AboutMeViewScreen
import com.base.portfolio.presentation.module.dashboard.screens.achievements.screen.AchievementsScreen
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.model.Category
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.screens.CategoryDetailsScreen
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.screens.RecipeScreen
import com.base.portfolio.presentation.module.dashboard.screens.recipeapp.viewmodel.RecipeViewModel
import com.base.portfolio.presentation.module.dashboard.screens.certifications.screen.CertificateScreen
import com.base.portfolio.presentation.module.dashboard.screens.contactme.screen.ContactMeScreen
import com.base.portfolio.presentation.module.dashboard.screens.education.screen.EducationScreen
import com.base.portfolio.presentation.module.dashboard.screens.experience.screen.ExperienceScreen
import com.base.portfolio.presentation.module.dashboard.screens.faq.screen.FAQScreen
import com.base.portfolio.presentation.module.dashboard.screens.mainscreen.MainScreen
import com.base.portfolio.presentation.module.dashboard.screens.profile.screens.ProfileScreen
import com.base.portfolio.presentation.module.dashboard.screens.projects.screen.ProjectsScreen
import com.base.portfolio.presentation.module.dashboard.screens.technicalskills.screen.TechnicalSkillsScreen
import com.base.portfolio.presentation.module.onboarding.module.screens.preview.HorizontalPagerScreen
import com.base.portfolio.presentation.module.onboarding.module.screens.splash.SplashScreen

/**
 * Provides Navigation graph for the application.
 * We have graph of all nav routes
 */
@Composable
fun MyAppNavGraph(
    context: Context,
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {

    NavHost(
        navController = navController,
        startDestination = NavigationDestination.SplashScreen.route,
        modifier = modifier
    ) {
        composable(route = NavigationDestination.SplashScreen.route) {
            SplashScreen(
                navController
            )
        }

        composable(route = NavigationDestination.PreviewScreen.route) {
            HorizontalPagerScreen(
                navController
            )
        }

        composable(route = NavigationDestination.MainScreen.route) {
            MainScreen(
                navController
            )
        }

        composable(route = NavigationDestination.HomeScreen.route) {
            SplashScreen(
                navController
            )
        }

        composable(route = NavigationDestination.AboutMeViewScreen.route) {
            AboutMeViewScreen(
                navController
            )
        }

        composable(route = NavigationDestination.AboutMeEditScreen.route) {
            AboutMeEditScreen(
                navController
            )
        }

        composable(route = NavigationDestination.ProfileScreen.route) {
            ProfileScreen(
                navController
            )
        }

        composable(route = NavigationDestination.EducationScreen.route) {
            EducationScreen(
                navController
            )
        }

        composable(route = NavigationDestination.ExperienceScreen.route) {
            ExperienceScreen(
                navController
            )
        }

        composable(route = NavigationDestination.AchievementScreen.route) {
            AchievementsScreen(
                navController
            )
        }

        composable(route = NavigationDestination.CertificationScreen.route) {
            CertificateScreen(
                navController
            )
        }

        composable(route = NavigationDestination.ProjectsScreen.route) {
            ProjectsScreen(
                navController
            )
        }

        composable(route = NavigationDestination.TechnicalSkills.route) {
            TechnicalSkillsScreen()
        }

        composable(route = NavigationDestination.CertificationScreen.route) {
            ContactMeScreen(
                navController
            )
        }

        composable(NavigationDestination.RecipeScreen.route) {
            RecipeScreen() {
                navController.currentBackStackEntry?.savedStateHandle?.set("cat", it)
                navController.navigate(NavigationDestination.CategoryScreen.route)
            }
        }

        composable(NavigationDestination.CategoryScreen.route) {
            val category =
                navController.previousBackStackEntry?.savedStateHandle?.get<Category>("cat")
                    ?: Category("", "", "", "")
            CategoryDetailsScreen(category = category)
        }

        composable(route = NavigationDestination.FAQ.route) {
            FAQScreen(
                navController
            )
        }
    }
}
