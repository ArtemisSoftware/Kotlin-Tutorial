package com.artemis.software.kotlintutorial.tidbits

import com.artemis.software.kotlintutorial.classes.CustomerKotlin

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

    val (capital, population) = capitalAndPopulation("Madrid")

    println(capital)
    println(population)

    val (id, name, email) = CustomerKotlin(1, "Milo", "email.com")

    println(id)
    println(name)
    println(email)


    val listCapitalsCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    for((capital2, country) in listCapitalsCountries){
        println("$capital2 - $country")
    }

}