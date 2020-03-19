package com.artemis.software.kotlintutorial.functions

fun hello(): Unit{
    println("Hello")
}

fun throwingException(): Nothing {
    throw Exception("This function throws an exception")
}

fun returnAFour(): Int {
    return 4
}

fun takingString(name: String){
    println(name)
}

fun sum(x: Int, y: Int) = x + y


fun main(args: Array<String>){
    hello()

    val value = returnAFour()

    takingString("Some value")
}