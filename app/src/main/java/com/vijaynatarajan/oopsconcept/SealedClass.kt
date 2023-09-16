package com.vijaynatarajan.oopsconcept

//sealed class SealedClass {
//
//    class A : SealedClass() {
//        fun display() {
//            println("class A is sealed")
//        }
//    }
//
//    class B : SealedClass() {
//        fun display() {
//            println("class B is sealed")
//        }
//    }
//
//}
//// out side class
//class X: SealedClass() {
//    class y: SealedClass(){
//
//    }
//}
//
//fun main(args: Array<String>) {
//    var a = SealedClass.A()
//    a.display()
//    var b = SealedClass.B()
//    b.display()
//}

sealed class Fruit(val x: String) {
    // Two subclasses of sealed class defined within
    class Apple : Fruit("Apple")
    class Mango : Fruit("Mango")
}

// A subclass defined outside the sealed class
class Pomegranate : Fruit("Pomegranate")

// A function to take in an object of type Fruit
// And to display an appropriate message depending on the type of Fruit
fun display(fruit: Fruit) {
    when (fruit) {
        is Fruit.Apple -> println("${fruit.x} is good for iron")
        is Fruit.Mango -> println("${fruit.x} is delicious")
        is Pomegranate -> println("${fruit.x} is good for vitamin d")
    }
}

fun main() {
    // Objects of different subclasses created
    val obj = Fruit.Apple()
    val obj1 = Fruit.Mango()
    val obj2 = Pomegranate()

    // Function called with different objects
    display(obj)
    display(obj1)
    display(obj2)
}
