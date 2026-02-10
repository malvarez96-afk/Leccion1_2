package edu.example.aspectosbasicoskotlin

fun main(){
    println("STEP1-----------------------------")
    //var rocks: Int = null
    var marbles: Int? = null

    println("STEP2-----------------------------")
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
        println(fishFoodTreats)
    }

    var fishFoodTreats2 = 6 // var fishFoodTreats2: Int? = null
    //fishFoodTreats2 = fishFoodTreats2?.dec()
    fishFoodTreats2 = fishFoodTreats2?.dec() ?: 0
    println(fishFoodTreats2)

    //val len = s!!.length   // throws NullPointerException if s is null
}