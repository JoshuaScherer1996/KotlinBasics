package com.datphoenixstudios.kotlinbasics.e_oop

//interface doesn't need to provide a default implementation of it's members (like drive() in here)
//default implementations of interfaces are always overrideable
interface Driveable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The driveable is braking!")
    }
}

//class needs to be open to be a super class, cause by default Kotlin classes are non inheritable
//vehicle inherits from driveable. now we need to implement the interfaces' members like in the constructor or new drive fun
open class Vehicle(override val maxSpeed: Double, val name: String, val brand: String): Driveable {
    //properties
    //methods
    //we use open to make our property overrideable. by default every property is final (not overrideable)
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if (amount > 0) {
            range += amount
        }
    }

    //implementation of the drive function that we need
    override fun drive(): String {
        return "using the interface function drive"
    }

    //implementation of drive in a shortform
    //override fun drive(): String = "using the interface function drive"

    //made it open so we can override it in sub classes
    open fun drive(distance: Double) {
        println("Drove for $distance KM!")
    }
}

//class car2 inherits from vehicle. with sealed we could prevent other classes from inheriting from this class
//open class Car2 : Vehicle() { }

//ElectricCar inherits from Vehicle
//our subclass needs the same properties in the constructor. It can also have additional ones
//Vehicle just uses the same members in it's constructor again
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double)
    : Vehicle(maxSpeed, name, brand) {

    var chargerType = "Type A"

    //we are overriding our range from the super class when creating an object with the sub class
    override var range = batteryLife * 6

    //we made the fun drive open as well so that we can override it here
    override fun drive(distance: Double) {
        println("Drove for $distance KM!")
    }

    //now drive is a different function than our overrideable drive fun
    //don't rename funs that often to avoid confusion
    /*
    old dive function:

    fun drive() {
        println("Drove for $range KM on electricity!")
    }
     */
    /*
    after inheriting from an interface this function doesn't work anymore. We have drive in this form
    already in our interface. now we need to add override and return a string cause we need to follow
    the same structure as in the interface
    */
    override fun drive(): String {
        return "Drove for $range KM on electricity!"
    }

    //even though it is already implemented we can still implement our brake function in this sub class
    override fun brake() {
        //the keyword super says, that we call the brake function of the super class (Vehicle)
        //Vehicle doesn't implement it but it inherits from the interface so we can just use that one
        super.brake()
        //added implementation of our brake function
        println("Now we brake again, only that we do it from inside the Subclass!")
    }
}

fun main() {
    //needed to add the double maxSpeed in our objects
    var audi = Vehicle(200.0, "A8", "Audi")
    var tesla = ElectricCar(300.0, "S-Model", "Tesla", 85.0)

    //any class in Kotlin inherits from the any class. it has some of the methods we use like toString

    tesla.extendRange(200.0)

    tesla.chargerType = "Type B"

    //Polymorphism
    audi.drive(200.0)
    tesla.drive(200.0)

    //calls the drive fun that doesn't require a distance as a parameter
    //doesn't have an output on it's own cause it returns a string but doesn't print it
    val print = tesla.drive()
    //print function for our drive that overrides the interfaces function
    println(print)

    //calling the brake fun
    tesla.brake()
    audi.brake()

}