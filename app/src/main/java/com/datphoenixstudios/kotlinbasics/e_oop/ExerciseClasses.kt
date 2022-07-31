package com.datphoenixstudios.kotlinbasics.e_oop

fun main() {
    val phone1 = MobilePhone("Android", "Xiaomi", "MI 10")
    val phone2 = MobilePhone("Android", "Samsung", "Galaxy S22 Ultra")
    val phone3 = MobilePhone("iOs", "Apple", "Iphone 12 pro")
}



class MobilePhone(osName: String, brand: String, model: String) {

    init {
        println("------------------------------------")
        println("Operating system: $osName")
        println("The brand: $brand")
        println("The model: $model")
        println("------------------------------------")
    }
}