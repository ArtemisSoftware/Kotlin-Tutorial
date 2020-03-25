package com.artemis.software.kotlintutorial.stdlib


fun main(args: Array<String>){

    val elements = 1..100000000

    /*
    val output = elements.asSequence().filter { it < 30 }.map{ Pair("Yes", it)}

    output.forEach{ println(it)}
    */

    val outputSecond = elements.asSequence().take(2).sum()
    println(outputSecond)


    val numbers = generateSequence(1) { x -> x + 1  }
    println(numbers.take(0).sum())
    println(numbers.take(1).sum())
    println(numbers.take(2).sum())
    println(numbers.take(3).sum())


    val lazyInit: Int by lazy { 10 }
}