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
    //myCar.myModel = "M3" -> Doesn't work cause we can't set this property outside of our class
    //even though the setter is private, the getter isn't. we can get our property publicly
    println("The model of my car: ${myCar.myModel}")
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

    var myModel: String = "M5"
        //here we declare that our setter is private
        //private means that we can only set the variable here within the class
        private set

    //We initialise the variable we declared as late init
    init {
        //this specifies, that we use the owner we declared up top
        this.owner = "Frank"
        //here we can set the value of myModel because it is still within the same class
        this.myModel = "M3"
    }
}