package com.vijaynatarajan.oopsconcept


// Generics: in, out, where
class Box<Int>(t: Int) {

    var value = t

    init {
        println(value)
    }
}

fun main(args: Array<String>) {
    val box: Box<Int> = Box(10)
}