package com.datphoenixstudios.kotlinbasics.b_conditionals

fun main() {
    val weightPerson1 = 80
    val weightPerson2 = 90

    // if (this condition is true) {we do this stuff}
    if (weightPerson1 > weightPerson2) {
        println("Person 1 has more weight!")
    } else if (weightPerson1 == weightPerson2){
        println("Both weigh the same!")
        //else if (this condition is true) {we do this stuff}
        //we can have as many else if statements as we want
    } else {
        println("Person 2 has more weight!")
    }
    //else {we do this stuff}

    val myAge = 25
    if (myAge >= 21) {
        println("You can now drink alcohol in the us!")
    } else if (myAge >= 18) {
        println("You can now vote in the us!")
    } else if (myAge >= 16) {
        println("You can now drive in the us!")
    } else {
        println("You are too young")
    }
    //the program stops after the first if condition is true


    //special tip: one if statement without codeblock
    if (myAge >= 25)
        println("You have one quarter of your life behind you!")

    //different data types within if
    val name = "Josh"

    if (name == "Josh") {
        println("Welcome home $name!")
    } else {
        println("Waaaaiiiiiiit a minute! Who are you?")
    }

    val isSkyBlue = true
    if (isSkyBlue) {
        println("We have great weather today!")
    } else {
        println("It's cloudy today")
    }
}