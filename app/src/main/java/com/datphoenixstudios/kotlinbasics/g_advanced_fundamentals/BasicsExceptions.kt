package com.datphoenixstudios.kotlinbasics.g_advanced_fundamentals

fun main() {
    validate(15)
    println("Code after validation check!") //since exception is thrown code won't continue to run
}

fun validate(age: Int) {
    if (age < 18) {
        throw ArithmeticException("Under age!")
    }
    else {
        println("Allowed to drive!")
    }
}