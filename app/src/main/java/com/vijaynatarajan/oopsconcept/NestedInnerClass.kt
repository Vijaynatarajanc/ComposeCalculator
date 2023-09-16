package com.vijaynatarajan.oopsconcept

// nested class


class Bike {
    var bikeName: String = "BMW"

   inner class Engine {
        var horsePower: Int = 0
        var cylinder: Int = 0

        fun getEngineInf(hpower:Int,cylinder:Int): String {

            horsePower = hpower
            this.cylinder = cylinder
            return ("$horsePower horsepower,$cylinder")
        }
    }
}


// Inner class

class Outer {

    var name: String = "Hello, Vijay"

    class Inner {

        fun callMe() = Outer().name
    }
}

//class A {
//    inner class B {
//        fun Int.foo() {
//            val a = this@A
//            val b = this@B
//            val c = this@foo
//        }
//    }
//}
//

fun main(args: Array<String>) {
    var bike = Bike().Engine().getEngineInf(260,6)
    println(bike )
//    println(Bike.Engine().cylinder)
//    println(Outer.Nested().callMe())

//    val outer = Outer().name
//    println(outer)
//    println(Outer().Inner().callMe())


}