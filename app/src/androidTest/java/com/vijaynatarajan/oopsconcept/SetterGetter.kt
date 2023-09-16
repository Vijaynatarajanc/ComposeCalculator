package com.vijaynatarajan.oopsconcept

/*class Company {

    var name: String = "Default Value"
    get() = field
    set(value) {
        field = value
    }
}*/

class Person {
    var name: String = "John"
    private set
    fun sum(name: String) {
        this.name = name
    }
}

fun main(args: Array<String>) {

//    var company = Company()
//     company.name = "vijay"
//    println(company.name)

    var person = Person()
    println(person.name)
    person.sum("Raja")
    println(person.name)

}

