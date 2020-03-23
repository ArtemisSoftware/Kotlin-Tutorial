package com.artemis.software.kotlintutorial.nulls

import com.artemis.software.kotlintutorial.classes.CustomerJava

fun main(args: Array<String>){

    val message: String = "A message"

    val nullMessage: String? = null
    val inferrefNull = null

    println(nullMessage!!.length)

}
