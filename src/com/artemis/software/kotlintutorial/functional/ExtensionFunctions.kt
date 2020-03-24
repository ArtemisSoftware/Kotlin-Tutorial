package com.artemis.software.kotlintutorial.functional

fun String.hello(){
    println("Its me!")
}


fun String.toTilteCase(prefix: String): String {
    return this.split(" ").joinToString(" ") { "$prefix ${it.capitalize()}" }
}

fun main(args: Array<String>){

    "Hello".hello()

    println("this is a simple string to Title Case it".toTilteCase("Again!-"))

    val customer = Customer()
    customer.makePreferred()
    customer.makePreferred("The message")

    val instance: BaseClass = InheritedClass()

    instance.extension()
}

class Customer{

    fun makePreferred(){
        println("Customer Version")
    }
}

fun Customer.makePreferred(message: String){
    println("Extended version " + message)
}

open class BaseClass
class InheritedClass : BaseClass()

fun BaseClass.extension(){
    println("Base Extension")
}

fun InheritedClass.extension(){
    println("Inherited Extension")
}