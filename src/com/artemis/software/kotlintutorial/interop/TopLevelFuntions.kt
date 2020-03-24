@file:JvmName("UtilityClass")
package com.artemis.software.kotlintutorial.interop

const val CopyrightYear = 2016


fun prefix (prefix: String, value: String): String {
    return "$prefix-$value"
}