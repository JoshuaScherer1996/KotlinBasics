package com.datphoenixstudios.kotlinbasics.e_oop

//class needs to be open to be a super class, cause by default Kotlin classes are non inheritable
open class Vehicle(val name: String, val brand: String) {
    //properties
    //methods
    //we use open to make our property overrideable. by default every property is final (not overrideable)
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if (amount > 0) {
            range += amount
        }
    }

    //made it open so we can override it in sub classes
    open fun drive(distnace: Double) {
        println("Drove for $distnace KM!")
    }
}

//class car2 inherits from vehicle. with sealed we could prevent other classes from inheriting from this class
//open class Car2 : Vehicle() { }

//ElectricCar inherits from Vehicle
//our subclass needs the same properties in the constructor. It can also have additional ones
//Vehicle just uses the same members in it's constructor again
class ElectricCar( name: String, brand: String, batteryLife: Double) : Vehicle(name, brand) {

    var chargerType = "Type A"

    //we are overriding our range from the super class when creating an object with the sub class
    override var range = batteryLife * 6

    //we made the fun drive open as well so that we can override it here
    override fun drive(distnace: Double) {
        println("Drove for $distnace KM!")
    }

    //now drive is a different function than our overrideable drive fun
    //don't rename funs that often to avoid confusion
    fun drive() {
        println("Drove for $range KM on electricity!")
    }
}

fun main() {
    var audi = Vehicle("A8", "Audi")
    var tesla = ElectricCar("S-Model", "Tesla", 85.0)

    //any class in Kotlin inherits from the any class. it has some of the methods we use like toString

    tesla.extendRange(200.0)

    tesla.chargerType = "Type B"

    //Polymorphism
    audi.drive(200.0)
    tesla.drive(200.0)

    tesla.drive()
}