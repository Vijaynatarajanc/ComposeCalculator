package com.vijaynatarajan.oopsconcept

// CLASS
//class Person {
//
//    val name: String = "mitchel Johnson"
//    var age: Int = 27
//}


// PRIMARY CONSTRUCTOR WITH INITIALIZER BLOCK

//class Person(val name: String) {
//    var _name: String
//
//    init {
//        println("This part is first excuted")
//    }
//
//    init {
//        println("This part is second excuted")
//    }
//
//    init {
//        this._name = name
//
//        println("My name is $name")
//    }
//
//
//}

// PRIMARY CONSTRUCTOR WITH DEFAULT VALUE

class Person {

    var name: String
    var age: Int
    val secondProperty = "Second property ".also(::println)

    private constructor(name: String, age: Int) {
        this.name = name
        this.age = age
        println("Myname is $name iam $age years old ")

    }

    constructor(name: String, age: Int, salary: String) : this(name, age) {
        this.name = name
        this.age = age
        println("Myname is $name iam $age years old $salary")

    }


    init {


        println("My name is vijay")
    }

    fun add() = 5

}

// Secondary Constructor

/*class Person {

    constructor(num1: Int,num2: Int) {
        var num3 = num1.plus(num2)
        println(num3)
    }
}*/


fun main(args: Array<String>) {
//   Create object
    var person1 = Person("jhon", 25, "200000")

//    var person2 = Person("Jos Buttler")
//
//    var person3 = Person(age =30)

//    println(person.name)
//    println(person.age)
//    println(person1.add())

    var a = 10
    var b = 5

    a%= b
    println(a)
}


