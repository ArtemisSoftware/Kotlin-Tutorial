package com.artemis.software.kotlintutorial.tidbits

import com.artemis.software.kotlintutorial.inheritance.Employee

open class Person{

}

class Employees:  Person(){

    fun vacationDays(days: Int){
        if(days <60){
            println("You need more vacations")
        }
    }
}

class Contractor:  Person(){

}

var input: Any = 10

fun main(args: Array<String>){

    val srt = input as? String

    println(srt?.length)

}


fun hasVacations(obj: Person){

    if(obj is Employees){
        obj.vacationDays(20)
    }

}