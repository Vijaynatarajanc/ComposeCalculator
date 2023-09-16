package com.vijaynatarajan.oopsconcept

//class Car {
//    lateinit var make: String
//    lateinit var model: String
//    var year: Int = 0
//
//    fun getInfo(): String {
//        return "$make $model $year"
//    }
//}
//
//
//class Employee {
//    var name: String = ""
//    var age: Int = 0
//    var gender: String = ""
//    var salary: Double = 0.0
//
//    fun insertValues(
//        name: String,
//        age: Int,
//        gender: String,
//        salary: Double
//    ) {
//
//        this.name = name
//        this.age = age
//        this.gender = gender
//        this.salary = salary
//        println("My name is $name,Iam $age years Old ")
//        println("My gender is $gender")
//        println("My monthly Salary is $salary")
//    }
//
//    fun insertName(name: String) {
//
//        this.name = name
//
//        println("My friend name is $name")
//
//    }
//
//
//}
//
//class Add(id: Int = 10, name: String = "Vijay") {
//
//    var id1: Int = 0
//    var name1: String = ""
//
//    init {
//        this.id1 = id
//        this.name1 = name
//
//        println("Employee Id is $id1")
//        println("Employee name is $name1")
//    }
//
//}
//
//
//class Employee2 {
//
//    constructor(name1: String, name2: String):this(name1,name2, name3 = "") {
//
//        var flower: String = name1.plus(name2)
//
//        println("My name is $flower")
//    }
//
//    constructor(name1: String, name2: String, name3: String) {
//
//        var flower1: String = name1 + name2 + name3
//        println("excutes the first")
//        println("My floer is $flower1")
//
//
//
//    }
//}
//
//open class Man {
//
//    constructor(name: String,age: Int,salary: Double) {
//
//        var name: String = name
//        var age:Int = age
//        var salary: Double = salary
//        println("My name is $name, Iam $age years old ")
//        println("My salary is $salary")
//    }
//}
//
//class Person1 : Man {
//
//    constructor(name: String,age:Int):super(name,age,50000.0) {
//
//
//    }
//
//}
//

//fun main() {
//    var myCar = Car()
//    myCar.make = "Mahenthira"
//    myCar.model = "camry"
//    myCar.year = 2023
//
//    println(myCar.getInfo())

//    Object1

//    var employee = Employee()
//
//    employee.insertValues(
//        "Vijay",
//        25,
//        "Male",
//        250000.0
//    )

// Object 2

//    var employee2 = Employee()
//
//    employee2.insertName("Raja")
//

//    var add = Add(12, "Ajay")
//    println()

//     Employee2("hello","world")


//}

fun Fact(num: Int): Long
{
    return if (num == 1) num.toLong() // terminate condition
    else num* Fact(num - 1)
}
// main method
fun main()
{
    println("Factorial of 5 is: " + Fact(5))
    // Recursive call
}