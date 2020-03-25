package com.artemis.software.kotlintutorial.stdlib

import java.io.File


fun main(args: Array<String>){

    val file = File("Filename.txt")

    with(file){

    }

    val string: String? = "Some value"

    string?.let {
        it.length
    }

}