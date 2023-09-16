package com.vijaynatarajan.oopsconcept

fun main(args: Array<String>) {
//    While loop
    var number = 2
    while (number < 4) {
//        println(number)
        number++
    }

    var names = arrayOf("vijay", "Ajith", "Rajinikanth", "kamal hasan")
    var index = 0

    while (index < names.size) {
//        println(names[index])
        index++
    }

    //   Do While loop

    var number1 = 6
    var factorial = 1
    do {
        factorial *= number1
        number1--
    } while (number1 > 0)
//    println("Factorial 6 is $factorial")

    var num = 2
    var i = 1
    do {
//        println("$num * $i  ="+num * i)
        i++
    } while (i <= 10)

//    for loop

    for (i in 1..5) {
//        println(i)
    }

    for (i in 1 until 5) {
//        println(i)
    }
    for (i in 1..10 step 3) {
//        println(i)
    }
    for (i in 5 downTo 1) {
//        println(i)
//        println("print nothing")
    }
    for (i in 5 downTo 1 step 3) {
//        println(i)
    }

//    1) ARRAY
//    Without using Index property

    var numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (num in numbers) {
        if (num % 2 == 0) {
            //   println(num)
        }
    }

//    With Using Index property
    var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")

    for (i in planets.indices) {
//        println(planets[i])
    }

//    Using withIndex() Library Function

    var planets2 = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")

    for ((index, value) in planets2.withIndex()) {
//     println("Element at $index th index is $value")
    }

//    2) STRING

    //    Without using Index property

    var name = "Geeks"
    var name2 = "forGeeks"

//    for (alphabet in name) println("$alphabet")
//  With Using Index property

//    for (i in name2.indices) println(name2[i]+"")

//     using withIndex() Library Function:

    for ((index, value) in name2.withIndex()) {
//        println("$index,$value")
    }
// Collection

    var collection = listOf("listOf", "setOf", "mapOf")

    for (element in collection) {
//        println(element)
    }

//    Using when as a statement with else

//    var name3= readLine()!!.toString()
//    when(name3) {
//        "Sun" -> print("Sun is a Star")
//        "Moon" -> print("Moon is a Satellite")
//        "Earth" -> print("Earth is a planet")
//        else -> print("I don't know anything about it")
//    }
// Using when a
// s an expression
    /* var monthOfYear = readLine()!!.toInt()
     var month = when (monthOfYear) {
         1 -> "January"
         2 -> "February"
         3 -> "March"
         4 -> "April"
         5 -> "May"
         6 -> "June"
         7 -> "July"
         8 -> "August"
         9 -> "September"
         10 -> "October"
         11 -> "November"
         12 -> "December"
         else -> "Not a month of year"
     }
     print(month)*/

//multiple branches in one using comma
    /* print("Enter name of the planet: ")
     var name4 = readLine()!!.toString()
     when (name4) {
         "Mercury", "Earth", "Mars", "Jupiter", "Neptune", "Saturn", "Venus", "Uranus" -> print("This is a planet")
         else -> print("This not a planet")
     }*/
// input value in the range or not
    /*print("Enter the month number of year: ")
    var num5 = readln().toInt()
    when (num5) {
        in 1..3 -> print("Spring season")
        in 4..6 -> print("Summer season")
        in 7..8 -> print("Rainy season")
        in 9..10 -> print("Autumn season")
        in 11..12 -> print("Winter season")
        !in 1..12 -> print("Enter valid month of year")
    }*/

//    variable is of a certain type or not

    /* var num6: Any = true
     when (num6) {
         is Int -> println("It is an Integer")
         !is String -> println("It is a String")
         is Double -> printl`n("It is a Double")
     }*/

//     unlabelled break in while loop

    var sum = 0
    var number6: Int = 1
    while (number6 <= Int.MAX_VALUE) {
        sum += number6
        number6++

        if (number6 == 11) {
            break
        }
    }
//    println(sum)

//    unlabelled break in do-while loop –

    var names1 = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn", "Uranus")
    var number7 = 0

    do {
//       println("The name of $number7 th planet: " + names1[number7])
        if (names1[number7] == "Jupiter") {
            break
        }
        number7++
    } while (number7 <= names1.size)

//    unlabelled break in for loop –

    var name1 = "GeeksforGeeks"
    for (i in name1){
//        print("$i")
        if(i == 's') {
            break
        }
    }
}