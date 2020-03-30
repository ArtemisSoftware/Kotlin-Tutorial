package com.artemis.software.kotlintutorial.cmltool

import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {

    val inputStream: InputStream = File(args[0]).inputStream()

    val allTheWords = inputStream.bufferedReader().use{it.readText()}


    //val allTheWords = "hello there, I am the creator. You are not! You are the message and I am the machine!"

    val words = allTheWords.replace(",","").replace("!","").replace(".","").split(" ")

    var wordMap = mutableMapOf<String, Int>()

    for(word in words){

        if(wordMap[word.capitalize()] == null){
            wordMap[word.capitalize()] = 1
        }
        else{
            wordMap[word.capitalize()] = wordMap[word.capitalize()]!! + 1
        }
    }
/*
    for(word in wordMap){
       println(word)
    }
*/
    val wordList = wordMap.toList()
    val sorted = wordList.sortedWith(compareByDescending ({it.second}))

    for(word in sorted){
        println("${word.first} - ${word.second}")
    }
}