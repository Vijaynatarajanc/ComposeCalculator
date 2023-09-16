package com.vijaynatarajan.oopsconcept

interface Vehicle{
    fun start()
    fun stop()


}

class MaruthiCar:Vehicle {
    override fun start() {
        println("Start the car")
    }

    override fun stop() {
       println("stop the car")
    }

}

fun main(args: Array<String>) {
    val maruthiCar =MaruthiCar()
    maruthiCar.start()
    maruthiCar.stop()
}

// Default values and Default Methods –

//interface FirstInterface {
//
//    fun add(a: Int, b: Int = 6)
//    fun print() {
//        println("default values")
//    }
//}

//class InterfaceDemo : FirstInterface {
//    override fun add(a: Int, b: Int) {
//        val x = a + b
//        println(x)
//    }
//
//    override fun print() {
//        super.print()
//    }
//}
//
//fun main(args: Array<String>) {
//    val interfaceDemo = InterfaceDemo()
//    interfaceDemo.add(5)
//    interfaceDemo.print()
//}

//    Properties in interface


//interface InterfaceProperties {
//    val a: Int
//    val b: String
//}
//
//class PropertiesDemo: InterfaceProperties {
//    override val a: Int
//        get() = 5000
//    override val b: String
//        get() = "properties overridden"
//}
//
//fun main(args: Array<String>) {
//    val propertiesDemo =PropertiesDemo()
//
//    println(propertiesDemo.a)
//    println(propertiesDemo.b)
//}

// Inheritance in Interfaces –

//interface Dimensions {
//
//    val width: Double
//    val breath: Double
//
//}
//
//interface CalculateParameters : Dimensions {
//    fun area()
//    fun perimeter()
//}
//
//class XYZ : CalculateParameters {
//    override val breath: Double
//        get() = 2.0
//    override val width: Double
//        get() = 2.0
//
//    override fun area() {
//        println("Area is ${width * breath}")
//    }
//
//    override fun perimeter() {
//        println("Perimeter is ${2 * (width + breath)}")
//    }
//}
//
//fun main(args: Array<String>) {
//    val xyz = XYZ()
//    xyz.area()
//    xyz.perimeter()
//}


//interface InterfaceProperties {
//    val a : Int
//    val b : String get()  = "hello"
//
//}
//
//interface InterfaceMethods {
//    fun description()
//}
//
//interface Demo :InterfaceProperties,InterfaceMethods{
//
//}
//class MultipleInterface : InterfaceProperties, InterfaceMethods {
//    override val a : Int
//        get() = 50
//
//    override fun description()
//    {
//        println("Multiple Interfaces implemented")
//    }
//}
//fun main()
//{
//    val obj = MultipleInterface()
//    obj.description()
//}