package com.vijaynatarajan.oopsconcept

//Kotlin program of using both abstract and non-abstract members in an abstract class

//abstract class Employee1(val name: String,val experience: Int) {
//
//    abstract var salary: Double
//
//    abstract fun dateOfBirth(date:String)
//
//    fun employeeDetails() {
//        println("Name of the employee: $name")
//        println("Experience in years: $experience")
//        println("Annual Salary: $salary")
//    }
//}
//
//class Engineer(name: String,experience: Int):Employee1(name, experience) {
//    override var salary: Double = 50000.0
//    override fun dateOfBirth(date: String) {
//        println("Date of birth is $date")
//    }
//
//}
//
//fun main(args: Array<String>) {
//    var engineer = Engineer("Jhon",5)
//    engineer.dateOfBirth("12.03.1984")
//    engineer.employeeDetails()
//}

// Overriding a non-abstract open member with an abstract one

//open class LivingThings {
//    open fun breathe() {
//        println("All living things are breathe")
//    }
//}
//
//abstract class Animal: LivingThings() {
//    override abstract fun breathe()
//
//
//}
//
//class Dog:Animal() {
//    override fun breathe() {
//        println("Dog is a animal")
//    }
//}
//
//fun main(args: Array<String>) {
//    var it = LivingThings()
//    it.breathe()
//
//    val dog = Dog()
//    dog.breathe()
//}

// Multiple derived classes

abstract class Calculator {
    abstract fun cal(x: Int, y: Int) : Int
}
// addition of two numbers
class Sum : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x + y
    }
}
// subtraction of two numbers
class Sub : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x - y
    }
}
// multiplication of two numbers
class Mul : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x * y
    }
}
fun main(args: Array<String>) {
    var add: Calculator = Sum()
    var x1 = add.cal(4, 6)
    println("Addition of two numbers $x1")
    var sub: Calculator = Sub()
    var x2 = sub.cal(10,6)
    println("Subtraction of two numbers $x2")
    var mul: Calculator = Mul()
    var x3 = mul.cal(20,6)
    println("Multiplication of two numbers $x3")
}