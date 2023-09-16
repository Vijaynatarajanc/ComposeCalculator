package com.vijaynatarajan.oopsconcept

//enum class Days(day: String) {
//    Sunday("Sunday"),
//    Monday("Monday"),
//    Tuesday("Tuesday"),
//    Wednesday("Wednesday"),
//    Thursday("Thursday"),
//    Friday("Friday"),
//    Saturday("Saturday")
//
//}

enum class CreditCardType(val colour: String, val limit: Int = 100000) : ICardCashBack {
    Silver("gray") {
        override fun getCashbackValue(): Float = 0.02f
    },
    Gold("Blue") {
        override fun getCashbackValue(): Float = 0.02f
    },
    Platinum("Red") {
        override fun getCashbackValue(): Float = 0.02f
    }
}

interface ICardCashBack {
    fun getCashbackValue(): Float
}

fun main(args: Array<String>) {
    var creditCardType = CreditCardType.Platinum.colour
    println(creditCardType)
    println(CreditCardType.Platinum.getCashbackValue())
//    println(CreditCardType.Platinum.ordinal)
//    println(CreditCardType.Platinum.name)
//
//    var constanValues: Array<CreditCardType> = CreditCardType.values()
//    constanValues.forEach { println(it) }
    println()
//    when (creditCardType) {
//        CreditCardType.Silver -> println("Silver is Credit card Type")
//        CreditCardType.Gold -> println("Gold is Credit card Type")
//        CreditCardType.Platinum -> println("Platinum is Credit card Type")
//    }
}