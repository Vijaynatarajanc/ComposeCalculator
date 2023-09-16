package com.vijaynatarajan.oopsconcept

fun main(args: Array<String>) {

    /**
     *  Normal method no run time error
     */
//    var a: String = "abc"
//
//    val result = a.length
//   println(result)

    /**
     * This method is null, so donot find out the length
     * checking null in conditions –
     */

    /*  var b: String? = "abc"
  //    var num = b.length
      b = null

      val number = if (b != null) b.length else -1
     println(number)

      var c: String? = "kotlin"
      if (c != null) {
          println(c.length)
      } else {
          println(" Empty String")
      }

      c = null

      if (c != null) {
          println(" String of length ${c.length}")
      } else {
          println("Empty String")
      }*/

    /**
     * Safe calls
     */

    /*  var d:String = "java"
      var e: String? = null
      println(d.length)
      println(e?.length)*/

//      var a: Int? = null
//
//      a.let { println(it) }
//
//     a = 2
//
//    a?.let { println(it) }

//      var firstName: String? = "vijay"
//      var lastName: String? = null
//      println(firstName?.uppercase())
//      println(firstName?.length)
//      println(lastName?.uppercase())

    var list:List<String?>  = listOf("kotlin", null, "java", "Python")

    var newList = listOf<String?>()

    for (item in list) {
        item?.let { newList = newList.plus(it) }
    }

    for (element in newList) {
       println(element)
    }
}