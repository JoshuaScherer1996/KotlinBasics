package com.datphoenixstudios.kotlinbasics.e_oop

fun main() {
    //creating a new object with our blueprint class
    //a class is also a datatype
    var appDev: Person = Person("Joshua", "Scherer")
    //here the person is autmatically created with out default values
    var john = Person()
    //creating an object with only the last name known
    var mrPeterson = Person(lastName = "Peterson")

}

//structure of a class: keyword class - name of class - keyword constructor or just round brackets
// - (attributes) - {Codeblock of the class}

//with keyword constructor
/*
class Person constructor(firstName: String, lastName: String) {

}
*/

//without keyword constructor but therefore with default values
class Person(firstName: String = "John", lastName: String = "Doe") {

    //initializers. Runs automatically when an object is created.
    //so our appDev automatically will run this code when created
    init {
        println("App Developer successfully created! First name is $firstName and last name is $lastName")
    }

}