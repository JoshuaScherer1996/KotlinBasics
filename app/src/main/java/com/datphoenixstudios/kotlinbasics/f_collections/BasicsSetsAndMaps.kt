package com.datphoenixstudios.kotlinbasics.f_collections

fun main() {
    val fruits = setOf("Orange", "Apple", "Mango", "Grape", "Apple", "Orange")
    println(fruits.size) //prints 4 cause it ignores duplicates
    //prints the set alphabetically sorted
    println(fruits.toSortedSet())
    //converts set to a mutable set
    val newFruits = fruits.toMutableSet()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    //prints the mutable list. duplicate elements are still gone cause it used to be a set
    println(newFruits)
    println(newFruits.elementAt(4))

    //creating a map with key value pairs. In other languages also known as dictionaries or hashmaps
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    //in the following line we talk about the key and not the index:
    println(daysOfTheWeek[2])

    //loop to print out all elements
    for (key in daysOfTheWeek.keys) {
        println("The key: $key belongs to: ${daysOfTheWeek[key]}")
    }

    //creating a map with our fruit objects from the data class in BasicsArrays
    val fruitsMap = mapOf(1 to Fruit("Grape", 2.5),
        2 to Fruit("Banana", 1.0), 3 to Fruit("Strawberry", 2.0))

    //converting our map to a mutable map
    val newDayOfWeek = daysOfTheWeek.toMutableMap()
    //manipulating the map
    newDayOfWeek[4] = "Wednesday"
    newDayOfWeek[5] = "Friday"

    //prints our sorted map
    println(newDayOfWeek.toSortedMap())
}