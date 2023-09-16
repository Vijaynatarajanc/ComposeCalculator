package com.vijaynatarajan.oopsconcept

class Collection {
}

fun main(args: Array<String>) {
    var list = mutableListOf("john", "raja", "gani")
    list[0] = "prabu"
    list.add("gani")
    for (key in list) {
        println(key)
    }

}