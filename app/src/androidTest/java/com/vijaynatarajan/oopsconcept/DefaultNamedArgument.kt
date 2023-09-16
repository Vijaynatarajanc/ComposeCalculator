package com.vijaynatarajan.oopsconcept

//  Default arguments

fun read(
    b: ByteArray,
    off: Int = 0,
    len: Int = b.size
) {

}


open class A {
    open fun foo(i: Int = 25) {
        println("My Age Is $i")
    }
}

class B : A() {
    override fun foo(i: Int) {
        println(i)
        super.foo(i)
    }

}

fun main(args: Array<String>) {
    var b = B()
    b.foo(55)
}