package com.base.portfolio.presentation.navigation

import com.base.portfolio.utils.apputils.constant.navconstants.NavRoutes

/**
 * Interface to describe the navigation destinations for the app
 **/
sealed class NavigationDestination(var route: String, var id: String) {
    object SplashScreen :
        NavigationDestination(NavRoutes.SPLASH_SCREEN.name, id = NavRoutes.SPLASH_SCREEN.name)

    object PreviewScreen :
        NavigationDestination(NavRoutes.PREVIEW_SCREEN.name, id = NavRoutes.PREVIEW_SCREEN.name)

    object MainScreen :
        NavigationDestination(NavRoutes.MAIN_SCREEN.name, id = NavRoutes.MAIN_SCREEN.name)

    object HomeScreen :
        NavigationDestination(NavRoutes.HOME_SCREEN.name, id = NavRoutes.HOME_SCREEN.name)

    object ProfileScreen :
        NavigationDestination(NavRoutes.PROFILE_SCREEN.name, id = NavRoutes.PROFILE_SCREEN.name)

    object AboutMeViewScreen :
        NavigationDestination(
            NavRoutes.ABOUT_ME_VIEW_SCREEN.name,
            id = NavRoutes.ABOUT_ME_VIEW_SCREEN.name
        )

    object AboutMeEditScreen :
        NavigationDestination(
            NavRoutes.ABOUT_ME_EDIT_SCREEN.name,
            id = NavRoutes.ABOUT_ME_EDIT_SCREEN.name
        )

    object AboutMeScreen :
        NavigationDestination(
            NavRoutes.ABOUT_ME_SCREEN.name,
            id = NavRoutes.ABOUT_ME_SCREEN.name
        )

    object EducationScreen :
        NavigationDestination(
            NavRoutes.EDUCATION_DETAIL_SCREEN.name,
            id = NavRoutes.EDUCATION_DETAIL_SCREEN.name
        )


    object ExperienceScreen :
        NavigationDestination(
            NavRoutes.EXPERIENCE_DETAIL_SCREEN.name,
            id = NavRoutes.EXPERIENCE_DETAIL_SCREEN.name
        )

    object CertificationScreen :
        NavigationDestination(
            NavRoutes.CERTIFICATION_DETAILS_SCREEN.name,
            id = NavRoutes.CERTIFICATION_DETAILS_SCREEN.name
        )


    object AchievementScreen :
        NavigationDestination(
            NavRoutes.ACHIEVEMENT_DETAILS_SCREEN.name,
            id = NavRoutes.ACHIEVEMENT_DETAILS_SCREEN.name
        )


    object ProjectsScreen :
        NavigationDestination(
            NavRoutes.PROJECT_DETAIL_SCREEN.name,
            id = NavRoutes.PROJECT_DETAIL_SCREEN.name
        )

    object TechnicalSkills :
        NavigationDestination(
            NavRoutes.TECHNICAL_SKILL_SET_SCREEN.name,
            id = NavRoutes.TECHNICAL_SKILL_SET_SCREEN.name
        )

      object ContactMe :
        NavigationDestination(
            NavRoutes.CONTACT_ME_SCREEN.name,
            id = NavRoutes.CONTACT_ME_SCREEN.name
        )

    object RecipeScreen :
        NavigationDestination(NavRoutes.RECIPE_SCREEN.name, id = NavRoutes.RECIPE_SCREEN.name)


    object CategoryScreen :
        NavigationDestination(NavRoutes.CATEGORY_SCREEN.name, id = NavRoutes.CATEGORY_SCREEN.name)

    object FAQ :
        NavigationDestination(
            NavRoutes.FAQ_SCREEN.name,
            id = NavRoutes.FAQ_SCREEN.name
        )

    fun withArgs(vararg args: Any): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}