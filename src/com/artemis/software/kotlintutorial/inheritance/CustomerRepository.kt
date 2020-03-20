package com.artemis.software.kotlintutorial.inheritance

interface CustomerRepository {

    val isEmpty: Boolean
        get() = true

    fun store(obj: Customer){
        //implement code to store
    }
    fun geById(id: Int): Customer
}

class SQLCustomerRepository: CustomerRepository{

    override fun geById(id: Int): Customer {
        return Customer()
    }

    override fun store(obj: Customer){

    }

    override val isEmpty: Boolean
        get() = false
}

interface Interface1{

    fun funA(){
        println("FUN A form interface 1")
    }
}

interface Interface2{

    fun funA(){
        println("FUN A form interface 2")
    }
}


class Class1And2: Interface1, Interface2{
    override fun funA() {
        super<Interface2>.funA()

    }
}


fun main(args: Array<String>){

    val c = Class1And2()
    c.funA()
}