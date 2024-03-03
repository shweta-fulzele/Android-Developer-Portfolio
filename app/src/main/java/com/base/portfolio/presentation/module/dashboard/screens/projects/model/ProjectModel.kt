package com.base.portfolio.presentation.module.dashboard.screens.projects.model

data class ProjectModel(
    val projectName: String,
    val content: String,
    val responsibilities: List<String>,
    val skillSet: List<String>,
    val playStoreLink: String,
    val imageUrl: String
)

val projectsList = listOf<ProjectModel>(
    ProjectModel(
        projectName = "DocsInk Connect",
        content = "Docsink Connect is a HealthCare application. It helps the provider manage their patients via a program called RPM. Remote Patient Monitoring(RPM) is a program to manage patients remotely. Providers can perform diagnosis and chat with their patients .",
        skillSet = listOf(
            "Android",
            "Kotlin",
            "XML",
            "Retrofit",
            "Data Binding",
            "View Binding",
            "MVVM Architecture"
        ),
        responsibilities = listOf(
            "Understanding the goal of Application.",
            "Worked on the UI part of this application.",
            "Work on API integration.",
            "Manage the project with the use of JIRA",
            "Managed App Publication to Stores.",
            "Worked with the quality assurance team to confirm app compatibility and increase test coverage."
        ),
        imageUrl = "",
        playStoreLink = "https://play.google.com/store/apps/details?id=com.healthapp.docsink"
    ),
    ProjectModel(
        projectName = "DocsInk Messenger",
        content = "DocsInk is a healthcare domain project which focuses on the Patient’s daily health tracking. DocsInk is divided into two parts, one is the Patient’s side and another is the Provider’s side.\n" +
                "The provider assigns the patient a remote patient monitoring (RPM) program. The patient is supposed to send the health data as per the RPM program assigned by the provider. The provider checks the data sent by the user and reviews the Check-Ins.\n" +
                "The patient can provide the readings to the provider either manually or with the help of other devices such as iHealth, Google Fit, Fitbit, Accu-Chek etc. directly. \n",
        skillSet = listOf("Android", "Kotlin", "XML", "Retrofit", "Data Binding", "View Binding"),
        imageUrl = "",
        responsibilities = listOf(
            "Re-structure the project according to the MVVM architecture",
            "Code stabilisation",
            "Creation of new modules as per the designs",
            "REST APIs integrations",
            "Socket integrations",
            "Third-party libraries integrations",
            "Firebase Crashlytics integration",
            "Setting up JUnit framework",
            "Periodic unit testing performance",
            "Deploy the app on Play Store"
        ),
        playStoreLink = "https://play.google.com/store/apps/details?id=com.docsink.patient"
    ),
    ProjectModel(
        projectName = "TSRT Health",
        content = "TRST Health, for diabetic and pre-diabetic users, diagnoses and improves treatment plans using data from\n" +
                "devices like Freestyle Libre CGM, Fitbit and GoogleFit. Built with Jetpack Compose Kotlin, it provides graphical\n" +
                "representations of glucose data and tracks habits and Circadian Rhythm.",
        skillSet = listOf(
            "Android",
            "Kotlin",
            "Jetpack Compose",
            "Retrofit",
            "MVVM Architecture",
            "Firebase",
            "RxJava",
            "UI/UX",
            "Animations",
            "AndroidX",
            "Gradle",
            "Payment Integration"
        ),
        playStoreLink = "",
        responsibilities = listOf(
            "Developed projects using Kotlin, Jetpack Compose, MVVM, and Design Patterns.",
            "Managed app deployment on Google Play Console and oversaw app signing, crash reports analysis, and bug tracking.",
            "Conducted continuous code reviews for optimization and maintainability.",
            "Implemented Agile methodologies and workflows using Jira and Git.",
            "Enhanced application performance through memory and network optimization.",
            "Conducted thorough unit tests on emulators and physical devices.",
            "Facilitated client calls for gathering requirements and discussing project progress.",
            "Demonstrated strong interpersonal skills for effective team collaboration and management."
        ),
        imageUrl = ""
    ),

    ProjectModel(
        projectName = "Dash APP",
        content = "Enabling effortless cross-bank money transfers, secure currency conversions, and comprehensive financial operations. Seamlessly integrates with Mobile Money, various card networks, and banking systems. Leverages the power of Jetpack Compose, Kotlin, Hilt, Retrofit, and PLAID to deliver an intuitive and feature-rich experience.",
        skillSet = listOf(
            "Android",
            "Kotlin",
            "Jetpack Compose",
            "Retrofit",
            "MVVM Architecture",
            "Firebase",
            "RxJava",
            "UI/UX",
            "Animations",
            "AndroidX",
            "Gradle",
            "Payment Integration"
        ),
        responsibilities = listOf(
            "In projects: Kotlin, Jetpack Compose, MVVM, and Design Patterns.",
            "Conducted code reviews: optimization, maintainability.",
            "Implemented Agile: Jira, Git.",
            "Enhanced app performance: memory, network optimization.",
            "Performed unit tests: emulators, devices.",
            "Facilitated client communication: project updates.",
        ),
        playStoreLink = "",
        imageUrl = ""
    ),
    ProjectModel(
        projectName = "Urgent Care",
        content = "The Urgent Care Android project integrates Jetpack Compose for a user-friendly interface, enabling virtual and\n" +
                "in-person appointments, medical record access, and Twilio-powered video calls. Payment integration and real-\n" +
                "time chat enhance patient-provider communication, aiming to revolutionize healthcare access and improve outcomes.",
        skillSet = listOf(
            "Android",
            "Kotlin",
            "Jetpack Compose",
            "Retrofit",
            "MVVM Architecture",
            "Firebase",
            "RxJava",
            "Kotlin Coroutines",
            "Kotlin Flows",
            "Dagger/Hilt",
            "Dependency Injection",
            "UI/UX",
            "Animations",
            "AndroidX",
            "Gradle",
            "Payment Integration"
        ),
        responsibilities = listOf(
            "Applied Kotlin, Jetpack Compose, MVVM, and Design Patterns to develop projects.",
            "Managed end-to-end app deployment on Google Play Console, including signing and crash reports analysis.",
            "Conducted ongoing code reviews to ensure optimization and maintainability standards.",
            "Implemented Agile methodologies and workflows seamlessly with Jira and Git.",
            "Enhanced app performance through meticulous memory and network optimization.",
            "Executed comprehensive BLE integration, encompassing protocol implementation and device connectivity.",
            "Performed thorough unit tests on emulators and physical devices for robustness.",
            "Facilitated client communication for requirement gathering and project updates.",
            "Demonstrated strong interpersonal skills for effective team collaboration and management.",
            "Directed project management, architected base structure, and managed resources from inception."
        ),
        playStoreLink = "",
        imageUrl = ""
    ),
)
