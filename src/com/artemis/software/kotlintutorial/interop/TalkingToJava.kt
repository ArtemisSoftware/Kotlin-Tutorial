package com.artemis.software.kotlintutorial.interop

import com.artemis.software.kotlintutorial.classes.CustomerJava

fun main(args: Array<String>) {

    val customer = CustomerJava()

    customer.email = "hades@ss.com"

    customer.prettyPrint()

    val runnable = Runnable {println("Invokig runnable")}
}


class PersonKotlin: PersonJava(){

}


class KotlinCustomerRepo: CustomerRepository{
    override fun getById(id: Int): CustomerJava {
        TODO("Not yet implemented")
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("Not yet implemented")
    }

}