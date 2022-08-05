package com.datphoenixstudios.kotlinbasics.f_collections

/*
Please write a program that adds five Numbers (Double) to an
arrayList and then calculates the average of those numbers.
Please use a for (in) loop in this exercise.
Good luck :)
*/


fun main() {
    val arrayList: ArrayList<Double> = ArrayList(5)
    arrayList.add(1.0)
    arrayList.add(2.0)
    arrayList.add(3.0)
    arrayList.add(4.0)
    arrayList.add(5.0)

    //var divider = 0.0
    var total = 0.0
    for (num in arrayList){
        total += num
        //divider++
    }
    println("Our total comes up to $total!")
    println("We divide by ${arrayList.size}!")

    var solution = total/arrayList.size
    println("With all this we end up with an average of $solution!")

    //commented out the divider but realized that i could be more efficient just using the array size
}