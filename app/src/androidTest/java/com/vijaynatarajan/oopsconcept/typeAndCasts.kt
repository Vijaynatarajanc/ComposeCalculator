package com.vijaynatarajan.oopsconcept

// is and !is Operator

/*fun main(args: Array<String>) {
    var myName: String = "John Felker"
    var myAge: Int = 25
    var mySalry: Double = 25000.0
    var employeeDetails: List<Any> = listOf(myName, myAge, mySalry)
    for (element in employeeDetails) {
        if (element is String) {
            println("My Name $element")
        } else if (element is Int) {
            println("My Age $element")
        } else if (element is Double) {
            println("My Salary $element")
        } else {
            println("hi vijay")
        }
    }

    println()

    for (element in employeeDetails) {
        when (element) {
            is String -> println("My Name $element")
            is Int -> println("My Age $element")
            is Double -> println("My Salary $element")
            else -> println("This Null Safety")
        }
    }
}*/

// Smart Casts

/*fun main(args: Array<String>) {
// only access non - null values
    /*var string: String? = "hello"
    println(string.length)   */ //   compiler error

    var string: String? = "hello"
    if (string != null) {                             //  smart cast
        println(string.length)
    }

//    Use of is for smart cast

    var name: Any = "hey ther"
    if (name is String) {
        println(name)
    } else if (name !is String) {
        println(name)
    } else {
        println("This is Smart Cast")
    }
}*/

// Unsafe cast operator: as

/*fun main(args: Array<String>) {

   /* var name: Any? = null

//     cannot access non - null type
    var name2: String = name as String
    println(name2)*/

// Type Mismatch

   /* val obj: Any = 123
    val str: String = obj as String
    println(str)*/

    val obj: String? = "hi geeks"
    val str : String? = obj as String
    println(str)

}*/

// Kotlin Safe cast operator: as?

fun main(args: Array<String>) {

    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)
}