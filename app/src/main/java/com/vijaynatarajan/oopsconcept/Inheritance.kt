package com.vijaynatarajan.oopsconcept


//open class Employee() {
//
//    open fun website() {
//        println("Iam google web developer")
//    }
//
//}
//
//class WebDeveloper() : Employee() {
//
//    override fun website() {
//        println("Iam a Web developer")
//        println()
//
//    }
//
//}
//
//class AndroidDeveloper(name: String, age: Int, salary: Double) {
//
//    fun androidApp() {
//
//        println("iam a android developer")
//        println()
//
//    }
//}
//
//class IosDeveloper(name: String, age: Int, salary: Double) {
//
//    fun iosApp() {
//
//        println("iam a ios developer")
//    }
//}
//
//fun main() {
//    var employee = WebDeveloper()
//    employee.website()
//}

// Derived class initialization order

//open class Base(val name: String) {
//
//    init {
//        println("Initializing a base class")
//    }
//
//    open val size: Int =
//        name.length.also { println("Initializing size in the base class: $it") }
//}
//
//class Derived(
//    name: String,
//    val lastName: String,
//) : Base(name.replaceFirstChar { it.uppercase() }
//    .also { println("Argument for the base class: $it") }) {
//
//    override val size: Int =
//        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
//
//    init {
//        println("Initializing a derived class")
//    }
//
//
//}
//
//fun main() {
//    println("Constructing the derived class(\"hello\", \"world\")")
//    Derived("hello", "world")
//}

//Calling the superclass implementation

//open class Rectangle {
//
//    open fun draw() {
//        println("Drawing a Rectangle")
//    }
//
//    val borderColour: String get() = = "Black"
//}
//
//class FilledRectangle(): Rectangle() {
//    override fun draw() {
//        val filler = Filler()
//        filler.drawAndFill()
//    }
//
//    val fillColour: String get() = super.borderColour
//
//    inner class Filler{
//        fun fill() {
//            println("filling")
//        }
//
//        fun drawAndFill() {
//            super@FilledRectangle.draw()
//            fill()
//            println("drawn ${super@FilledRectangle.bor}")
//        }
//    }
//}

// HAS-a Relationship

class Engine {

    fun start() {
        println("Start the engine")
    }

    fun stop() {
        println("Stop the engine")
    }
}

class Car() {
    val engine = Engine()
    fun start() {
        engine.start()
        println("Car started")
    }

    fun stop() {
        engine.stop()
        println("Car Stopped")
    }
}



fun main(args: Array<String>) {
    var car = Car()

    car.start()
    car.stop()
}