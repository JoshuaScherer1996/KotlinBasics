package com.datphoenixstudios.kotlinbasics.c_loops

fun main() {
    //while executes a code as long as the condition for it is true
    // while (this condition is true) {repeat this codeblock}
    var x = 1
    while (x<=10) {
        print(x)
        //You need to increase the variable for the condition. Otherwise you will have an endless loop
        x++
    }
    //"\n" prints the following stuff in the next line. This is a line break.
    println("\nWhile loop is done!")

    //challenge: Print every second value from 100 downwards.Include 0
    var num = 100
    while (num >= 0) {
        print(num)
        /*
        num--
        num--
        */

        //cleaner way
        num -= 2
    }

    //throw away print to organize my output
    println("")

    //using strings and combining if and while
    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp >= 20) {
            feltTemp = "warm"
            println("It's warm now!")
        }
    }

    // do {this code} while (this condition is true)
    x = 1
    do {
       println(x)
       x++
    } while (x > 100)

    //for every (variable in current iteration - keyword in - a range) {do this}
    for (num in 1..10){
        println(num)
    }

    //instead of .. using until
    for (i in 1 until 10){
        print(i)
    }

    //throw away print to organize my output
    println("")

    //using down to
    for (j in 10 downTo 1) {
        print(j)
    }

    //throw away print to organize my output
    println("")

    //using steps
    for (nr in 10 downTo 1 step 2) {
        print(nr)
    }
}