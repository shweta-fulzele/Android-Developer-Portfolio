package com.base.portfolio.presentation.module.dashboard.screens.education.model

import com.base.portfolio.R

data class EducationModel(
    val highestEducation: String,
    val nameOfInstitute: String,
    val universityName: String,
    val primarySubject: String,
    val location: String,
    val cgpa: String,
    val startDate: String,
    val endDate: String,
    val images: Int,
)

val educationList = (
    EducationModel(
        highestEducation = "Master of Computer Application (MCA)",
        nameOfInstitute = "Shri. Ramdeobaba College of Engineering and Management",
        universityName = "Rashtrasant Tukadoji Maharaj Nagpur University",
        primarySubject = "Computer Application",
        location = "Nagpur, Maharastra, India",
        cgpa = "8.38 / 10",
        startDate = "2018",
        endDate = "2020",
        images = R.drawable.shri_ramdeobaba_college
    )
)
