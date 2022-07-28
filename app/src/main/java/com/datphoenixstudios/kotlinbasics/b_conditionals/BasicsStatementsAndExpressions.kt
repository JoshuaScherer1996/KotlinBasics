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


    //when expression -> similar to switch statements
    val season = 3

    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 ->{
            println("Fall")
            println("Alternative name: Autumn")
        }
        4 -> println("Winter")
        //else is the case that executes if none of the other cases fit
        else -> println("Invalid Season!")
    }
    //goes through the cases and selects the one that fits the condition

    var month = 7
    when (month) {
        // in and .. take a range. First case is all numbers from 3 to 5
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        // we select certain cases ourselves
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season!")
    }

    //using is and Any
    //Any means it can be any type
    //is checks if our variable is of the type we name
    var x: Any = 13.37
    when (x) {
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    //same code as above only with the negation used in cases
    var y: Any = 13.37f
    when (y) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
}