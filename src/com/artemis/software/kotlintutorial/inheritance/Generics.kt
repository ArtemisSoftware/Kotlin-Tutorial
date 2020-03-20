package com.artemis.software.kotlintutorial.inheritance


interface Repository<T> {
    fun geById(id: Int): T
    fun getAll(): List<T>
}



fun main(args: Array<String>){

    val customerRepo = GenericRepository<Customer>()

    val customer = customerRepo.geById(10)
    val customers = customerRepo.getAll()
}