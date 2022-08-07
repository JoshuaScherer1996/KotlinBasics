package com.datphoenixstudios.kotlinbasics.f_collections

open class Base() {
    var a = 1
    private var b = 2
    protected open val c = 3
    internal val d = 4
    protected fun e() {println(5)}
    fun f() {println(6)}
}

class Derived: Base(){
    override val c = 9
}

fun main() {
    val base = Base()
    println(base.a) //accessible cause public
    //println(base.b) //not accessible (outside of class) cause private
    //println(base.c) //not accessible (outside of class and subclasses) cause protected
    println(base.d) //accessible (inside of package) cause internal
    //println(base.e()) //not accessible (outside of class and subclasses) cause protected
    println(base.f()) //accessible cause public

    val derived = Derived()
    //same rules go for this object as they do for base
    println(derived.a)
    //println(derived.b)
    //println(derived.c)
    println(derived.d)
    //println(derived.e())
    println(derived.f())
}