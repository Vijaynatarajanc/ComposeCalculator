package com.vijaynatarajan.oopsconcept


// Primary Constructor working with properties

class Person1(
    val firstName: String,
    val age: Int
) {


}

fun main(args: Array<String>) {
    var person = Person1("Raja", 27)
    println("First Name = ${person.firstName}")
    println("My age is = ${person.age}")
}


//  Primary Constructor and Initializer Blocks

/*class Person(fName: String, personAge: Int) {
    val firstName: String
    var age: Int

    init {
        firstName = fName.capitalize()
        age = personAge
        println("My name is $firstName")
        println("My age is $age")
    }
}

fun main(args: Array<String>) {
    val person = Person("Saravanan",26)
}*/

/*fun main(args: Array<String>) {

    println("person1 is instantiated")
    val person1 = Person("joe", 25)

    println("person2 is instantiated")
    val person2 = Person("Jack")

    println("person3 is instantiated")
    val person3 = Person()
}

class Person(_firstName: String = "UNKNOWN", _age: Int = 0) {
    val firstName = _firstName.capitalize()
    var age = _age

    // initializer block
    init {
        println("First Name = $firstName")
        println("Age = $age\n")
    }
}*/

// Secondary constructor


