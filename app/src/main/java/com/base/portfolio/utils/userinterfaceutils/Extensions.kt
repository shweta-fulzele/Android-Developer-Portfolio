package com.base.portfolio.utils.userinterfaceutils

// Create extension function for TextStyle

fun String.addDotWithExclamation(): String {
    return "$this..!!"
}

fun String.addExclamation(): String {
    return "$this!"
}

fun String.addComma(): String {
    return "$this,"
}

fun String.addColon(): String {
    return "$this:"
}


fun String.addQuestionMark(): String {
    return "$this?"
}
