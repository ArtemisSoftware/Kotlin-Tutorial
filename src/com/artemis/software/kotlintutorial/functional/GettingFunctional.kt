package com.artemis.software.kotlintutorial.functional

import java.sql.DatabaseMetaData

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int{
    return op(x, y)
}

fun operation(x: Int, op: (Int) -> Unit){

}

fun route(path: String, vararg actions: (String, String) -> String){

}

fun unaryOp(op: (Int) -> Int){

}

fun unaryOperation(z: Int, op: (Int) -> Int){
    op(z)
}
fun sum(x: Int, y: Int) = x + y


fun transaction(db: Database,  code: () -> Unit){

    try{
        code()
    }
    finally {
        db.commit()
    }
}

class Database {
    fun commit() {}
}


fun main(args: Array<String>){

    println(operation(1,2, ::sum))

    val sumLambda: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    operation(1,2, sumLambda)

    unaryOperation(2, {x -> x + x})

    unaryOperation(3, {it * it})

    unaryOperation(3) {it * it}

    unaryOp{
        it * it
    }

    val db = Database()

    transaction(db){
        //interact with the database
    }


    unaryOperation(5, fun(x: Int): Int{ return x * x } )
}