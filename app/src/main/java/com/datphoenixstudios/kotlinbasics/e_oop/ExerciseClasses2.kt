package com.datphoenixstudios.kotlinbasics.e_oop

/*
Please extend our example of the MobilePhone class with

class MobilePhone(osName: String, brand: String, model: String){
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
}
Add a member to it, which indicates how much battery is left (call it "battery". Initialize this value with a number between 0 and 50.

Then add a function
"chargeBattery"
Which needs details about how much was charged.

It should print out how much battery the phone had before, how much was charged and how much it has now.
Create an Object of the class and call this function. Charge the battery by 30.
 */

fun main() {
    val samsung: MobilePhone2 = MobilePhone2("Android", "Samsung", "Galaxy S22", 50)

    val charged = samsung.chargeBattery(30)
    println(charged)

}

class MobilePhone2(osName: String, brand: String, model: String, var battery: Int) {
    init {
        println("The phone $model from $brand uses $osName as its Operating System. Current battery level: $battery")
        this.battery = battery
    }

    fun chargeBattery(charged: Int) {
        var newBattery = charged + battery
        println("Before charging our battery was at $battery. We charged $charged. Now we have $newBattery!")
    }
}

/*
Alternatively:

fun main(){
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}

class MobilePhone(osName: String, brand: String, model: String){

    private var battery = 30

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }
}
 */