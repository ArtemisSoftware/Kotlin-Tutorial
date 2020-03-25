package com.artemis.software.kotlintutorial.stdlib

import java.util.*


fun main(args: Array<String>){

    val numbers = 1..100

    var list = listOf("First", "Second")

    val cities = listOf("Madrid", "London", "Paris")
    println(cities.javaClass)

    val empty = emptyList<String>()
    println(empty.javaClass)

    val arrayList = Arrays.asList("Madrid", "London")
    println(arrayList.javaClass)


    val mutableCities = mutableListOf("Madrid")
    mutableCities.add("Paris")

    val hashMap = hashMapOf(Pair("Madrid", "Spain"), Pair("Paris", "France"))

    val booleans = booleanArrayOf(true, false, true)
}