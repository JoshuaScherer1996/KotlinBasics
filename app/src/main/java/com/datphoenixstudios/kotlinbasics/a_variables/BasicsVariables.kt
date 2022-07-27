package com.datphoenixstudios.kotlinbasicsvariables.variables

fun main() {
    //mutable variable
    var myName = "Josh"

    //immutable variable
    val number = 5
    println("hello " + myName)

    //TODO: this is a todo which is visable in all files within the project

    /*
    multiline comment!
    FYI: Koltin is a typed language. Meaning every variable has a specific type.
    However Kotlin also uses type inference to detect which type a variable is
     */

    //types of integers
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 5555555
    val myLong: Long = 37_327_653_763_572_625
    //usage of bites: Byte (8 bit), Short (16 bit), Int (32 bits), Long (64 bits)

    //types of floating point numbers
    val myFloat: Float = 13.44F
    val myDouble: Double = 324.23242348740
    //usage of bites: Float (32 bits), Double (64 bits)

    //boolean
    var isSunny = false
    isSunny = true

    //character
    val letterChar = 'Z'
    val numberChar = '4'

    //strings
    val myString = "Hello World"
    //accesses the first character in our string
    var firstCharacterInString = myString[0]
    println("First Character: " + firstCharacterInString)

    //accesses the last character in our string
    var lastCharacterInString = myString[myString.length - 1]
    println("Last Character: " + lastCharacterInString)

    //string interpolation / string template expression
    println("First Character of our string is $firstCharacterInString and the length is ${myString.length}!")
    //$ symbole is used to be able to use variables. For longer expressions wrap them in {} brackets.

}