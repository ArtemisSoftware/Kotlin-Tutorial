package com.artemis.software.kotlintutorial.inheritance

abstract class StoredEntity{

    val isActive = true


    abstract fun store()

    fun status(): String{
        return isActive.toString()
    }

}

class Employee: StoredEntity(){
    override fun store() {
        TODO("Not yet implemented")
    }


}


fun main(args: Array<String>){

    val se = Employee()
}