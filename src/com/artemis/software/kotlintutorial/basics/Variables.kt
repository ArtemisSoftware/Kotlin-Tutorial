package com.artemis.software.kotlintutorial.basics

fun main(args: Array<String>){

    var streetNumber: Int
    var streetCode: Int = 10
    var streetName = "High Street"

    //val - o valor não pode ser alterado
    val zip = "E11 P1"

    val myLong = 10L
    val myFloat = 10F
    val myHex = 0x0F
    val myBinary = 0xb01


    //String

    val myChar = 'A'
    val myString = "My String"

    val escapeCharacters = "A new link \n"

    val multipleLinea ="""
        This is still a string
        and this is another line
        """

    val years = 10
    val message = "A decade is $years years "

    val name = "Mary"
    val anotherMessage = "Length of name is ${name.length}"
}