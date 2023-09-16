package com.vijaynatarajan.oopsconcept


fun main(args: Array<String>) {
// Bitwise Operator
    var a = 10
    var b = 2
//  128  64  32  16  8  4  2  1
//   0   0   0   0   1  0  1  0

// shl   push 2 step left
//    128  64  32  16  8  4  2  1
//     0   0   1   0   1  0  0  0 = 40
//    println("a.shl(b): " + a.shl(b))

// shr   128  64  32  16  8  4  2  1
//        0   0   0   0   0  0  1  0 = 2

//    println("a.shr(b): " + a.shr(b))

// AND    128  64  32  16  8  4  2  1

//  a =10  0   0   0   0   1  0  1  0
//  b =2   0   0   0   0   0  0  1  0
//         0   0   0   0   0  0  1  0 =
//    println("a.ushr(b:) " + a.ushr(b))

    // AND    128  64  32  16  8  4  2  1

//  a =10      0   0   0   0   1  0  1  0
//  b =2       0   0   0   0   0  0  1  0
//Total        0   0   0   0   0  0  1  0 = 2

//    println("a.and(b): " + a.and(b))

    // OR     128  64  32  16  8  4  2  1

//  a =10      0   0   0   0   1  0  1  0
//  b =2       0   0   0   0   0  0  1  0
//Total        0   0   0   0   1  0  1  0 = 10

//    println("a.or(b): " + a.or(b))

    // XOR     128  64  32  16  8  4  2  1

//  a =10       0   0   0   0   1  0  1  0
//  b =2        0   0   0   0   0  0  1  0
//Total         0   0   0   0   1  0  0  0 = 8

//    println("a.xor(b): " + a.xor(b))

// INV         128  64  32  16  8  4  2  1

//  a =10       0   0   0   0   1  0  1  0
//              1   1   1   1   0  1  0  1 = decimal(245)
//           - (0   0   0   0   1  0  1  0+ 1) = -(280+1) = -281
//    println("a.inv(): " + b.inv())

//    Unsigned integer type

    var num1: UByte = 2u
    var num2: UByte = 3U

//    println(num1)
//    println(num2)

//    BOOLEAN

    val myTrue: Boolean = true
    val myFalse: Boolean = true
    val boolNull: Boolean? = null

//    println(myTrue || myFalse)
//    println(false && false)
//    println(!myTrue)

// CHAR

//    println("hi\nvijay")
//    println("hi\bvijay")
//    println("hi\rvijay")
//    println("hi\tvijay")
//    println("hi\'vijay")
//    println("hi\"vijay")
//    println("hi\\vijay")
//    println("hi\$vijay")
//    println()

    val name: String = "abed 1234"

    for (c in name) {
//        println(c)
    }

    val text = """
         for(c in "foo")
         print(c)
     """
    val homeController = HomeController()
    homeController.calculate(2, 4) { n1 ->
        println(n1)
    }

    var sum = pCalculate(92, 68, 81, 98, 96)
    println(sum)
}

//fun printResult(result: Int) {
//    println(result)
//}


class HomeController {

    fun calculate(num1: Int, num2: Int, action: (Int) -> Unit) {

        action(num1 + num2)
        action(num1 - num2)
        action(num1 * num2)

    }

}


fun pCalculate(tamil: Int, english: Int, maths: Int, science: Int, sScience: Int): Double {
    val totalMarks = tamil + english + maths + science + sScience
    val percentages:Double = (totalMarks.toDouble() / 500) .toDouble().times(100)
    return percentages

}





