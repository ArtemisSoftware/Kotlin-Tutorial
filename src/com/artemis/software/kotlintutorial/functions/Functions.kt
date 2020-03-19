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

fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

fun printDetails(name: String, email: String = "", phone: String = "NA"){
    println("name: $name - email: $email - phone: $phone")
}


fun printStrings(vararg strings: String){
    reallyPrintingStrings(*strings)
}

private fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>){
    hello()

    val value = returnAFour()

    takingString("Some value")

    sum(1, 2, 3)
    sum(1, 2)
    printDetails("Aldebaran", phone = "555 12 3")


    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "2")
}