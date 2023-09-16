package com.vijaynatarajan.oopsconcept

object Singleton {
    init {
        println("Hi vijay, how dare you")
    }

    var name: String = "Raja"

    fun add(num1: Int, num2: Int): Int {

        var result = num1 + num2
        return result
    }
}

fun main(args: Array<String>) {
    println(Singleton.name)
    println(Singleton.add(2, 4))
    println(Singleton.add(6, 8))

}