package com.vijaynatarajan.oopsconcept

import javax.net.ssl.SSLEngineResult.Status

data class DataClass(var name: String, var age: Int) {

    val lastName: String = "saran"
    var firstName: Int = 25
    fun sum(num: String, age: Int): String {
        this.name = num
        this.age = age

        return ("$num $age")
    }
}


fun main(args: Array<String>) {
//    var dataClass = DataClass("vijay", 26)
//    println(dataClass)
//    var dataClass1 = dataClass.copy("a")
//
//    var dataClass3 = dataClass

//    println(dataClass == dataClass1)
//    println(dataClass1 == dataClass3)
//    println(dataClass3 == dataClass)
//    println(dataClass.hashCode())
//    println(dataClass1.hashCode())
//    println(dataClass3.hashCode())


}

