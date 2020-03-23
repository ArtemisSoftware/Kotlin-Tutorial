package com.artemis.software.kotlintutorial.tidbits

fun capitalAndPopulation(country: String): Pair<String, Long>{
    return Pair("Madrid", 2300000)
}


fun capitalInformation(country: String): Triple<String, String, Long>{
    return Triple("Madrid", "Europe", 2300000)
}

fun main(args: Array<String>){

    val result = capitalAndPopulation("Madrid")

    println(result.first)
    println(result.second)

    val countryInfo = capitalInformation("Madrid")

    println(countryInfo.first)
    println(countryInfo.second)
    println(countryInfo.third)
}