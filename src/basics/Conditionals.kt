package basics


fun main(args: Array<String>){

    var myString = "Not Empty"

    val result = "Valuel"

    val whenValue = when (result){

        "Value" ->{
            println("It's a value")
            println("Second")
            "Return from first"
        }
        is String -> {
            println("Excellent")
            "Return from second"
        }
        else -> {
            println("It came to this?")
            "The other"
        }
    }

    println(whenValue)
}