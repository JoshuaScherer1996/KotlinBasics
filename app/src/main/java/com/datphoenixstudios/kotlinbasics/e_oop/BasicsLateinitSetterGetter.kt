package com.datphoenixstudios.kotlinbasics.e_oop

import java.lang.IllegalArgumentException

fun main() {
    var myCar = Car()
    myCar.owner
    println("The brand of my car is: ${myCar.myBrand}")
    //here we SET the speed to 200
    myCar.maxSpeed = 200
    //here we GET the speed in our println
    println("The max speed of my car is: ${myCar.maxSpeed}")
    //checking if our exception gets thrown
    myCar.maxSpeed = -5

}

class Car() {
    //variable needs to be initialized here. lateinit tells it, that i am gonna do it later
    lateinit var owner: String

    val myBrand : String = "BMW"
        //created a custom getter. Everytime we try to access myBrand we will get it as lower case.
    get() {
        return field.toLowerCase()
    }

    //The code Kotlin automatically generates when we create a variable:
    /*
    var maxSpeed: Int = 250
        get() = field
        set(value){
            field = value
         }
     */

    //customizing the getter to check, if the value is positive when someone sets it
    var maxSpeed: Int = 250
        //could technically get rid of this getter cause we only use a custom setter
        get() = field
        set(value){
            //using if else in one line to throw out an exception
            field = if (value >= 0) value else throw IllegalArgumentException("Max speed cannot be less than 0!")
        }

    //We initialise the varibale we declared as late init
    init {
        //this specifies, that we use the owner we declared up top
        this.owner = "Frank"
    }
}