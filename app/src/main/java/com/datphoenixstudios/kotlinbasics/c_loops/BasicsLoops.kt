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
}