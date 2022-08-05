package com.datphoenixstudios.kotlinbasics.f_collections


fun main() {
    //creating a list with the type of String (via type inference)
    val months = listOf("January", "February", "March")

    //creating a list with the type of Any
    val anyTypes = listOf(1,2,3,true,false,"String")

    //printing how many elements are in our list
    println(anyTypes.size)
    //printing the month at the position with the index 1
    println(months[1])
    //printing out all our months
    for (month in months){
        println(month)
    }

    //converting our normal list to a mutable list
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    //combining our lists
    additionalMonths.addAll(newMonths)
    //adding a a single element
    additionalMonths.add("July")
    val lastMonths = arrayOf("August", "September", "October", "November", "December")
    additionalMonths.addAll(lastMonths)
    println(additionalMonths)

    //defining that we have a mutable list as well as giving it it's type
    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    //changing an item at a certain position in our list
    days[2] = "Sun"
    //removing an item at a certain position in our list
    //days.removeAt(3)
    //creating a filter remove list with which we will remove these specific elements from days
    val removeList = mutableListOf<String>("Mon", "Wen")
    //removes our removeList elements from days
    days.removeAll(removeList)
    //removes all days elements from days
    days.removeAll(days)
    println(days)
}

