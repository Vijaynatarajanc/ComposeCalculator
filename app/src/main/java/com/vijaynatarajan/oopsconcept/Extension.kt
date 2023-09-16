package com.vijaynatarajan.oopsconcept

import android.graphics.Insets.add

//class Circle(val radius: Double) {
//
//    fun area(): Double {
//
//        return Math.PI * radius * radius
//    }
//}
//
//fun main(args: Array<String>) {
//    fun Circle.perimeter(): Double {
//
//        return 2 * radius * Math.PI
//    }
//
//    val newCircle = Circle(2.5)
////    println("Area of the Circle ${newCircle.area()}")
////    println("Area of the Circle ${newCircle.perimeter()}")
//
//    fun Int.abc(): Int {
//        return if (this < 0) this else this
//    }
//
//    println((-4).abc())
//    println((4).abc())
//}

//open class A(val num1: Int, val num2: Int) {
//
//
//}
//
//class B : A(5, 5) {
//
//}
//
//fun main(args: Array<String>) {
//    fun A.operate(): Int {
//
//        return num1 + num2
//    }
//
//    fun B.operate(): Int {
//        return num1 * num2
//    }
//
//    fun display(a: A) {
//        println(a.operate())
//    }
//
//    println(display(B()))
//}

//fun MutableList<Int>.swap(index1: Int, index2: Int) {
//    val temp = this[index1]
//    this[index1] = this[index2]
//    this[index2] = temp
//}
//
//fun main(args: Array<String>) {
//    val list = mutableListOf(1,2,3,4)
//    println(list.swap(0,2))
//}


fun main() {
    var operation = Operation()

    operation.sum()


}

annotation class MyAnnotation(val number: Int)

class Operation {
    @MyAnnotation(0)
    fun sum() {

    }


    //overlodd
    @MyAnnotation(12)
    fun sum(a: Int = 2, b: Int = 3, c: Int = 4, d: Int = 5) {
        println("${a + b + c + d}")
    }
}