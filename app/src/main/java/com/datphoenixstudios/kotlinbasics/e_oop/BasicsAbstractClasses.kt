package com.datphoenixstudios.kotlinbasics.e_oop

//can't instantiate an abstract class or interface
//can inherit from abstract class
//members of abstract class are non abstract unless they are declared as such

abstract class Mammal(private val name: String, private  val origin: String,
    private val weight: Double) { //Concrete (Non Abstract) Properties

    //Abstract Property (Must be overwritten by subclass)
    abstract var maxSpeed: Double

    //Abstract Methods (Must be implemented by Subclasses)
    abstract fun run()
    abstract fun breath()

    //Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, Max Speed: $maxSpeed")
    }

}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double)
    : Mammal(name, origin, weight) {
    //need to override all abstract members. already did for maxSpeed in the constructor

    override fun run() {
        println("Runs on two legs")
    }

    override fun breath() {
        println("Breath through mouth or nose")
    }
}


class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double)
    : Mammal(name, origin, weight) {
    override fun run() {
        println("Runs on four legs")
    }

    override fun breath() {
        println("Breath through the trunk")
    }
}

fun main() {
    val human = Human("Josh", "Germany", 98.0, 30.0)
    val elephant = Elephant("Dumbo", "India", 3200.0, 20.0)

    //val mammel = Mammal("Peter", "USA", 65.0, 3250.0) -> Error can't create instance of abstract class

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}