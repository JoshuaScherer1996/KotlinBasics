package com.datphoenixstudios.kotlinbasics.e_oop

import java.lang.Math.floor

fun main() {
    val stringList: List<String> = listOf(
        "Josh", "Peter", "Logan", "Wade"
    )
    val mixedTypeList: List<Any> = listOf(
        "Josh", 19, 12, "B-Day", 98.3, "weighs", "kg"
    )

    for (value in mixedTypeList) {
        if (value is Int) {
            println("Integer: $value")
        } else if (value is Double) {
            println("Double: $value with floor value (next lower full number): ${floor(value)}")
        } else if (value is String) {
            println("String: $value of length: ${value.length}")
        } else {
            println("Unknown Type")
        }
    }

    //Alternatively when:
    for (value in mixedTypeList) {
        when (value) {
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with floor value (next lower full number): ${floor(value)}")
            is String -> println("String: $value of length: ${value.length}")
            else -> println("Unknown Type")
        }
    }

    //Smart cast
    //recognises, that our type is string and acts based on our if statement
    val object1: Any = "I have a dream!"
    if (object1 !is String) {
        println("Not a string")
    } else {
        println("Found a String ($object1) with the length ${object1.length}")
    }

    //Explicit (unsafe) Casting using the "as" keyword -> can go wrong!
    //here tries to use object1 as a String
    val str1: String = object1 as String
    println(str1.length)

    //goes wrong because we try to cast an Integer as a String
    val object2: Any = 1883
    val str2: String = object2 as String
    println(str2)

    //Explicit (safe) Casting using the "as?" keyword
    val object3: Any = 1883
    val str3: String? = object3 as? String //works
    println(str3) //prints null
    //here it works because we take a nullable string and use as? which either gives us the wanted type or null
}