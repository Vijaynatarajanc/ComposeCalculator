package com.vijaynatarajan.oopsconcept

import java.util.Scanner

fun main(args: Array<String>) {

//    if-else-if ladder expression:
    /*val reader = Scanner(System.`in`)
    var num = reader.nextInt()
    var result = if (num > 0) {
        "$num is less than 0"
    } else if (num < 0) {
        "$num is greater than 0"
    } else {
        "$num is always true 0"
    }
    println(result)*/

//    nested if expression:

    val reader = Scanner(System.`in`)
    var num1 = reader.nextInt()
    var num2 = reader.nextInt()
    var num3 = reader.nextInt()
    var max = if (num1 > num2) {
        if (num1 > num3) {
            "$num2 is Largest number"
        } else {
            "$num2 is Lowest number"
        }
    } else if (num2 > num3) {
        "$num2 is Lowest number"
    } else {
        "$num3 is Lowest number"
    }
    println(max)
}