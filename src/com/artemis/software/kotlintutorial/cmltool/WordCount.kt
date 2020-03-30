package com.artemis.software.kotlintutorial.cmltool

fun main() {

    val allTheWords = "hello there, I am the creator. You are not! You are the message and I am the machine!"

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

    for(word in wordMap){
       println(word)
    }


}