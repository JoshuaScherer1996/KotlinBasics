package com.datphoenixstudios.kotlinbasics.f_collections

fun main() {
    //Array of integers specifically using the proper Datatype
    //val number: IntArray = intArrayOf(1,2,3,4,5,6)

    //code automatically detects the type of our variable via type inferrence
    //val number = intArrayOf(1,2,3,4,5,6)

    //again also sees that it is an int array in an even shorter form
    val number = arrayOf(1,2,3,4,5,6)

    println(number)
}