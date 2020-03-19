package basics

fun main(args: Array<String>){

    for(a: Int in 1..100) {
        println(a)
    }

    val numbers = 1..100

    for(a in numbers){
        print(a)
    }

    for(a in 100 downTo 1){
        println(a)
    }

    for(a in 100..1){
        print(a)
    }

    for(b in 100 downTo 1 step 5){
        print(b)
    }


    val capitals = listOf("London", "Paris", "Rome", "Madrid")
    for(capital in capitals){
        println(capital)
    }

    for(a: Int in 1..100) {
        for(b: Int in 1..100) {
            if(b % a == 0){
                break
            }
        }
    }
}