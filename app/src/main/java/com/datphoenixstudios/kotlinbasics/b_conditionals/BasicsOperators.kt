package com.datphoenixstudios.kotlinbasics.b_conditionals

fun main() {
    //aritmetic operators (+, -, *, /, %)
    //saves calculation in our variable
    var result = 5+3
    println(result)

    //first writing our operation and then using the short form of the operation
    //long form: result = result / 2
    //short:
    result /= 2
    println(result)

    //modulo in detail
    val a = 3
    val b = 16

    //using modulo to get our rest
    val modulo = b % a
    println(modulo)

    //dividing integer values
    val intDiv = 16/3
    println(intDiv)
}