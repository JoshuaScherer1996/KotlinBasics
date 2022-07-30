package com.datphoenixstudios.kotlinbasics.d_functions

fun main() {
    //We call our function myFunction which we wrote down below
    myFunction()

    //we give our function two arguments (5 and 3) based on our declared parameters
    //our return from our addUp func is saved in result
    //we print our result
    var result = addUp(5,3)
    println("Our result is $result!")

    //using the myAverage func in one line
    println(myAverage(23.4,54.0))
}

//STRUCTURE: keyword fun - name of the function - () - {function does this code when called}
fun myFunction() {
    println("Called from myFunction")
}

//a and b in the round brackets are called parameters (input of the function)
//the return type, as stated after the double points after the constructor, is Int
fun addUp(a: Int, b: Int) : Int {
    //always returns the sum of our parameters. Must be of type int (output of the function)
    return a+b
}

//Side note: A function within a class is called method! More on that later on

//challenge: write a function which will build the average of two values (add both and divide by 2)
//Kotlin needs the input types (parameters) to match the output type (return)
fun myAverage(a: Double, b: Double): Double {
    return (a+b)/2
}