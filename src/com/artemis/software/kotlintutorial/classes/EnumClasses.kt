package com.artemis.software.kotlintutorial.classes

enum class Priority(val value: Int){
    MINOR(-1){
        override fun text(): String {
            return "[MINOR PRIORITY]"
        }

        override fun toString(): String {
            return "Minor Priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            TODO("Not yet implemented")
        }
    },
    MAJOR(1) {
        override fun text(): String {
            TODO("Not yet implemented")
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            TODO("Not yet implemented")
        }
    };

    abstract fun text(): String
}


fun main(args: Array<String>){

    val priority = Priority.MINOR

    println(priority)
    println(priority.text())
    println(priority.value)
    println(priority.ordinal)
    println(Priority.CRITICAL.name)

    for(priorityInList in Priority.values()){
        println(priorityInList)
    }

    val p = Priority.valueOf("MAJOR")
    println(p.ordinal)
}