package com.artemis.software.kotlintutorial.classes

data class CustomerKotlin (var id: Int, var name: String, var email: String){

    override fun toString(): String {
        return "{\"id\":  \"$id\", \"name\":  \"$name\"}\n"
    }
}

fun main(args: Array<String>){

    val customer = CustomerKotlin(1, "Shaka", "ss@sactuary.com")
    val customer2 = CustomerKotlin(2, "Shaka", "ss@sactuary.com")

    println(customer)

    val customer3 = customer;

    if(customer == customer2){
        println("They are the same")
    }

    println(customer3.id)

    val customer4 = customer.copy(name = "Camus");

    println(customer4)
    println(customer4.name)
}