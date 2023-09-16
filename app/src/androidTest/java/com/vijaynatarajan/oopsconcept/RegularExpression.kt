package com.vijaynatarajan.oopsconcept


fun main() {

    val words =
        listOf(
            "book",
            "bookworm",
            "Bible",
            "bookish",
            "cookbook",
            "bookstore",
            "pocketbook",
            "vijay"
        )
    val pattern = "book".toRegex()

//    println("************")
//    println("containsMatchIn function")

    words.forEach { name ->
        if (pattern.containsMatchIn(name)) {
//            println("$name matches")
        }
    }
//    println("*************")
//    println("matches function")

    words.forEach { name ->
        if (pattern.matches(name)) {
//            println("$name matches")
        }
    }

    val pattern1 = Regex("a")

//    println(pattern1.containsMatchIn("abc"))
//    println(pattern1.containsMatchIn("bac"))

    val text = "I saw a fox in the wood. The fox had red fur. fox is dangerous"

    val pattern3 = "fox".toRegex()

    val match = pattern3.find(text)

    val m = match?.value
    val idx = match?.range

//    println("$m found at $idx")

    val match2 = pattern3.find(text, 12)

    val m1 = match2?.value
    val idx1 = match2?.range

//    println("$m1 found at $idx1")

    val match3 = pattern3.findAll(text)

    match3.forEach { f ->

        val m2 = f.value
        val idx2 = f.range

        println("$m2 found at $idx2")
    }
}

/*fun main() {

    val text = "This island is beautiful"

    val pattern = "\\bis\\b".toRegex()

    val matches = pattern.findAll(text)

    matches.forEach { f ->
        val v = f.value
        val idx = f.range

//        println("$v found at indexes in:$idx")
    }

    val content = """
Foxes are omnivorous mammals belonging to several genera
of the family Canidae. Foxes have a flattened skull, upright triangular ears,
a pointed, slightly upturned snout, and a long bushy tail. Foxes live on every
continent except Antarctica. By far the most common and widespread species of
fox is the red fox."""

    val pattern6 = "\\s".toRegex()

    val words = pattern6.findAll(content)
    val count = words.count()

    println("There are $count words")

    words.forEach { matchResult ->
        println(matchResult.value)
    }
}*/

/*fun main() {
    val content = """
Currency symbols: ฿ Thailand bath, ₹ Indian rupee, ₾ Georgian lari, $ Dollar,
€ Euro, ¥ Yen, £ Pound Sterling"""

    val pattern = "\\p{Sc}".toRegex(RegexOption.IGNORE_CASE)

    val matches = pattern.findAll(content)

    matches.forEach { matchResult ->

        val currency = matchResult.value
        val idx = matchResult.range

//        println("$currency at $idx")
    }

    val text = "I saw a fox in the wood. The fox had red fur."

    val pattern7 = "\\W+".toRegex()
    val words = pattern7.split(text).filter { it.isNotBlank() }

//    println(words)

    val words1 = listOf("seven", "even", "prevent", "revenge", "maven",
        "eleven", "amen", "event","aaevent")

    val pattern10 = "..even".toRegex()

    words1.forEach { word ->

        if (pattern10.containsMatchIn(word)) {

            println("$word matches")
        }
    }


}*/