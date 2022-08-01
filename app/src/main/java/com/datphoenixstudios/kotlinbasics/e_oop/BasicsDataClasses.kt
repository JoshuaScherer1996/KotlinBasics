package com.datphoenixstudios.kotlinbasics.e_oop

//structure: Keyword dara - keyword class - class name - constructor with properties
//primary constructor needs at least one property. we need to use val or var
//note: a data class doesn't need a codeblock
data class User(val id: Long, val name: String)

fun main() {
    val user1 = User(1, "Josh")

    val user2 = User(1, "Peter")

    //we compare both objects. output will be false cause the content is not exactly the same (different names)
    println(user1 == user2)

    //we can print the entire object details of our user
    println("User 1 details: $user1")

    //updated user is a copy of user1 with the difference that we gave them a different name
    val updatedUser = user1.copy(name = "Reed")
    println(updatedUser)

    //using components
    println(updatedUser.component1()) //prints the id=1 which is the first component of the data class
    println(updatedUser.component2()) //prints the name (Reed) which is our second component

    //using deconstruction
    //takes the component 1 and component 2 of updatedUser and creates two variables id and name with those
    val (id,name) = updatedUser
    println("id=$id, name=$name")
}