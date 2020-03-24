package com.artemis.software.kotlintutorial.interop

import com.artemis.software.kotlintutorial.classes.CustomerJava
import kotlin.test.currentStackTrace

fun main(args: Array<String>) {

    val customer = CustomerJava()

    customer.email = "hades@ss.com"

    customer.prettyPrint()

    customer.neverNull()

    val runnable = Runnable {println("Invokig runnable")}

    val kr = KotlinCustomerRepo()

    val customerJava = kr.getById(10)

    customerJava?.id
}


class PersonKotlin: PersonJava(){

}


class KotlinCustomerRepo: CustomerRepository{
    override fun getById(id: Int): CustomerJava? {
        TODO("Not yet implemented")
    }

    override fun getAll(): MutableList<CustomerJava>? {
        TODO("Not yet implemented")
    }

}