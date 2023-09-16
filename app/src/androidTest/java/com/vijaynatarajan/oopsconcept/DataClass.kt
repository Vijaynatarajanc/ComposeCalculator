package com.vijaynatarajan.oopsconcept

data class Student(val name: String, val age: Double):Teacher {
    var height: Int = 0

}

interface Teacher {



}



fun main(args: Array<String>) {

    var student1 = Student("Vijay", 25.0)

//    Copy() Declaration

    var student2 = student1.copy("Raja", 27.0)
    var student3 = student1.copy()

    student1.height = 67
    student2.height = 65
    student3.height = 66

//    toString() Declaration

    println("${student1} has ${student1.height} cm height ")
    println("${student2} has ${student2.height} cm height")
    println("${student3} has ${student3.height} cm height")

//    Hashcode() Declaration

    val hash1 = student1.hashCode()
    val hash2 = student2.hashCode()
    val hash3 = student3.hashCode()

    println(hash1)
    println(hash2)
    println(hash3)

//     Equal() declaration

    println("hash1 == hash 2 ${hash1 .equals(hash3) }")
    println("hash2 == hash 3 ${hash2.equals(hash3)  }")
    println("hash1 == hash 3 ${hash1 == hash3}")

//    componentN()

    var student4 = Student("Saravanan", 26.0)
    val (name, age) = student4

    println("$name,$age years old")
}