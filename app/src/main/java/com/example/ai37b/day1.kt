package com.example.ai37b

fun main(){

    val age = arrayOf(10,20,30)
    age[2] = 50
    println(age[2])

    val age1 = ArrayList<Int>() //Cannot initialize value on same line
    val age2 =arrayListOf<Int>(10,20,30)

    age1.add(5) //Initialized ArrayList value here
    age2.add(10)

    fun sum(a:Int,b:Int) : Int{
        return a+b;
    }



//    //mutable
//    var name: String = "ram"
//    name = "hari"
//
//    //immutable
//    val age: Int = 20
//
//    println("My name is $name and age is $age")
//    println("My name is ${name.uppercase()} and age is $age")
}
