package com.datphoenixstudios.kotlinbasics.e_oop

fun main() {
    var appDev: Person2 = Person2("Joshua", "Scherer")
    //We give specifically our AppDev a new individual hobby
    appDev.hobby = "to read manga"
    appDev.stateHobby()
    var john = Person2()
    john.hobby = "to play guitar"
    john.stateHobby()
    //our variables here are objects. john and appDev are objects. basically everything with a datatype
    //is an object in Kotlin

    //creating a person with the secondary constructor, passing the age as well
    val peter = Person2("Peter", "Paker", 25)
    println("Peter is ${peter.age} years old.")

}

class Person2(firstName: String = "John", lastName: String = "Doe") {
    //member variable - properties
    var age: Int? = null
    var hobby: String = "playing videogames"
    //creating new variable to clearly show the functionality of keyword this
    var firstName: String = ""

    init {
        println("App Developer successfully created! First name is $firstName and last name is $lastName")
        //we need to put the first name here cause it needs to get initialized and it wouldn't get
        //initialized within the secondary constructor, cause not every object uses that one
        this.firstName = firstName
    }
    //member secondary constructor
    constructor(firstName: String, lastName: String, age: Int)
            //this says that the first and last name we are using comes from the primary constructor
            : this(firstName, lastName) {
                //the age given through the constructor (after the =) is the value of the parameter
                //this.age references the age variable of the class
                this.age = age

                //second initialized constructor. First it gives us the print from primary constructor and then this one
                println("App Developer successfully created! First name is $firstName and last name is $lastName and age is $age")
            }

    //member functions - methods
    fun stateHobby() {
        println("$firstName's hobby is $hobby")
    }

}