package com.base.portfolio.presentation.module.dashboard.screens.experience.model

import com.base.portfolio.R

data class ExperienceModel(
    val companyName: String,
    val startDate: String,
    val endDate: String,
    val companyType: String,
    val rolesAndResponsibilities: String,
    val projectCount: String,
    val image: Int
)

val experienceList = ExperienceModel(
    companyName = "Thinkitive Technologies Pvt. Ltd.",
    startDate = "13 Jan 2022",
    endDate = "Currently Working Here",
    companyType = "Service Based",
    rolesAndResponsibilities = "1) Developed 4+ projects leveraging Kotlin, Jetpack Compose, MVVM architecture, and Design Patterns.\n 2) Managed app deployment on Google Play Console, overseeing app signing, Crash reports analysis, Bug Tracking, Version Control, and release management.\n 3) Emphasized clean, maintainable code and conducted continuous Code Review for Code Optimization Implemented efficient workflows and Agile methodologies, employing tools like Jira and Git to boost productivity.\n 4) Enhanced application performance through effective Memory Management, Network Optimization, User acceptance testing (UAT) and Network Optimization Hands-on experience in BLE integration, including protocol implementation and device connectivity in a project setting.\n 5) Conducted thorough unit tests on both Android emulators and Physical devices.\n 6) Facilitated client calls to gather project requirements, discuss project progress, and implement new features.\n 7) Demonstrated strong Interpersonal Skills, fostering effective Team Collaboration and management.",
    projectCount = "6+",
    image = R.drawable.thinkitive_technologies
)
