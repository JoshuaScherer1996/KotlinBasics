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



    //comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 3==8
    println("Is isEqual false or true? of course it is $isEqual!")

    val notEqual = 3!=4
    println("Is notEqual false or true? of course it is $notEqual!")

    //comparison without saving it in a variable
    println("is 5 greater than 3? That's ${5>3}")




    //assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    println("myNum is: $myNum")
    myNum += 5
    println("myNum is: $myNum")
    myNum *= 10
    println("myNum is: $myNum")

    //Increment and drecement (++, --)
    myNum++
    println("myNum is: $myNum")
    println("myNum is: ${myNum++}")
    println("myNum is: ${++myNum}")
    //difference of putting it before or after:
    //line 53 increses after finished executing the line (end of line)
    //line 54 increses before we finish executing the line (beginning of line)
    myNum--
    println("myNum is: $myNum")
}