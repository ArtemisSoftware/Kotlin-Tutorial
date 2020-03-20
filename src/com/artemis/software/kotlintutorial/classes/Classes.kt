package com.artemis.software.kotlintutorial.classes

import java.lang.IllegalArgumentException
import java.util.*

class Customer(val id: Int, var name: String = "", val yearOfBirth: Int){

    init {
        name = name.toUpperCase()
    }

    constructor(email: String): this(0, "", 1900){

    }

    val age: Int
        get() =  Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value){
            if (!value.startsWith("SN")){
                throw IllegalArgumentException("Social security should start with SN")
            }

            field = value
        }
}

fun main(args: Array<String>){

    val customer = Customer(2, "Aldebaran", 1790)
    val customer2 = Customer(2, yearOfBirth= 1000)
    val customer3 = Customer("Camus")

    customer.id
    customer.name
    customer.socialSecurityNumber = "SN1234"

    println(customer.name)
    println(customer.age)
    println(customer.socialSecurityNumber)

}