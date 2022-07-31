package com.datphoenixstudios.kotlinbasics.d_functions

fun main() {
    //We call our function myFunction which we wrote down below
    myFunction()

    //we give our function two arguments (5 and 3) based on our declared parameters
    //our return from our addUp func is saved in result
    //we print our result
    var result = addUp(5,3)
    println("Our result is $result!")

    //using the myAverage func in one line
    println(myAverage(23.4,54.0))

    var name: String = "Josh"
    // name = null -> Compilation error. When we create and assign a variable it is of a non null type

    //here null is ok cause the ? says, the value can be null. Sets a "Nullable string"
    var nullableName: String? = "Josh"
    nullableName = null

    var len = name.length
    //var len2 = nullableName.length -> Error! Says only safe(?) or non-null asserted(!!) are allowed

    //old way - check via if
    if (nullableName != null) {
        var len2 = nullableName.length
    } else {
        null
    }

    //new way 1 with Kotlin (which is the same as the if statement above)
    var len2 = nullableName?.length
    //basically ? says: could be null but for now we assume it's not

    //if you only want to print something only when it truely isn't null -> safecall(?) with let
    //nullableName?.let { println(it.length) }

    //sometimes we assign a new variable (which means it should be non nullable) with a nullable object
    //here we can use the elvis operator
    var name2 = nullableName ?: "Guest"
    println(name2)
    //checks, if nullableName is empty. If yes we use default value Guest. Otherwise we use the already
    //assigned value.

    //not null assertion operator !! - Converts nullable in not nullable and if it is null it throws an exception

    //nullableName!!.toLowerCase() -> Nullpointer exception cause nullableName is in fact null
    nullableName = "Josh"
    println(nullableName!!.lowercase())
    //now it prints "josh" cause nullableName isn't null

    //note: safecall can be used in a chain call. Example: user?.wife?.age ?: 0
}

//STRUCTURE: keyword fun - name of the function - () - {function does this code when called}
fun myFunction() {
    println("Called from myFunction")
}

//a and b in the round brackets are called parameters (input of the function)
//the return type, as stated after the double points after the constructor, is Int
fun addUp(a: Int, b: Int) : Int {
    //always returns the sum of our parameters. Must be of type int (output of the function)
    return a+b
}

//Side note: A function within a class is called method! More on that later on

//challenge: write a function which will build the average of two values (add both and divide by 2)
//Kotlin needs the input types (parameters) to match the output type (return)
fun myAverage(a: Double, b: Double): Double {
    return (a+b)/2
}