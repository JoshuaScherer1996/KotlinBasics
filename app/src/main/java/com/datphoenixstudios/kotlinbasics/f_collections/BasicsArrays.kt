package com.datphoenixstudios.kotlinbasics.f_collections

import androidx.core.content.contentValuesOf

fun main() {
    //Array of integers specifically using the proper Datatype
    //val number: IntArray = intArrayOf(1,2,3,4,5,6)

    //code automatically detects the type of our variable via type inferrence
    //val number = intArrayOf(1,2,3,4,5,6)

    //again also sees that it is an int array in an even shorter form
    val number = arrayOf(1, 2, 3, 4, 5, 6)

    println(number) //prints: [Ljava.lang.Integer;@27f674d

    //prints the numbers inside the array as: [1, 2, 3, 4, 5, 6]
    println(number.contentToString())

    //to print all number individually use for in:
    for (element in number) {
        print(element)
    }

    //manipulating the elements inside the array only within the loop
    for (element in number) {
        print(" ${element + 1}")
    }

    //printing out the value at the certain index in the array
    println("\n${number[0]}")

    println("Values before manipulation: ${number.contentToString()}")

    //manipulating values
    number[0] = 3
    number[3] = 54
    number[2] = 76
    number[5] = 99
    //array isn't long enough for this. throws out of bounds exception.
    //number[7] = 2

    println("Values after manipulation: ${number.contentToString()}")

    //double and String arrays
    val numberD: DoubleArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0)
    val names = arrayOf("Josh", "Pete", "Johnny", "Steve")

    println(names.contentToString())

    //printing out all fruit objects
    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Banana", 3.5), Fruit("Strawberry", 5.0))
    println(fruits.contentToString())

    //printing the name oft the fruit
    for (fruit in fruits) {
        println("The name of this fruit is: ${fruit.name}")
    }

    //printing the name oft the fruit based off of the index for all objects
    for (index in fruits.indices) {
        println("This is the fruit ${fruits[index].name} inside the index $index")
    }

    //an array mixed with different types
    val mix = arrayOf("Mon", "Tue", "Sun", 4, 5, 6.0, Fruit("Grapes", 1.5))
    println(mix.contentToString())

    //looked up a the function to check the type of an array and as expected: Mix is of type any
    println(mix.isArrayOf<Any>())

}

data class Fruit(
    val name: String, val price: Double
)