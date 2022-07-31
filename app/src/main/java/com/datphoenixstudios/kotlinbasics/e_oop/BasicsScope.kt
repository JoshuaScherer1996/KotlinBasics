package com.datphoenixstudios.kotlinbasics.e_oop

fun main() {
    //calling out function with an argument
    myFunction(5)
    //b = 5 -> Doesn't work cause it is declared in the scope of the function myFunction so it
    //can't be used here. error: unresolved reference
}

//used parameter a is != variable a in codeblock
fun myFunction(a: Int) {
    //we create a variable a and give it the value of our parameter
    var a = a
    //this prints the value of our variable
    println(" a is $a")

    //creating a variable within the scope of the function
    var b = 10
}