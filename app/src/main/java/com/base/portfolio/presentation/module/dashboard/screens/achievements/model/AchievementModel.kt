package com.base.portfolio.presentation.module.dashboard.screens.achievements.model

import com.base.portfolio.R

data class AchievementModel(
    val achievementName: String,
    val description: String,
    val year: String,
    val organization: String,
    val image : Int
)

val achievementList = listOf<AchievementModel>(
    AchievementModel(
        achievementName = "Above and Beyond",
        description = "Awarded 'Above and Beyond' for exemplary performance and significant contributions towards achieving new\n" +
                "milestones for Thinkitive Technologies Pvt Ltd in 2023.",
        year = "2023",
        organization = "Thinkitive Technologies Pvt. Ltd, Pune",
        image = R.drawable.thinnkitive_above_beyond_award
    ),

    AchievementModel(
        achievementName = "First from Gondwana University",
        description = "I ranked first from Gondwana University for MCA-CET Exam with score 95.90 Percentile",
        year = "2018",
        organization = "Sardar Patel Mahavidyalaya, Chandrapur",
        image = R.drawable.first_mca_cet
    )

)
