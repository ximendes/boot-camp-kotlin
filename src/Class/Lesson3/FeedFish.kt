package Class.Lesson3

import java.util.*

fun main(args: Array<String>) {
    feedTheFish()
}

fun feedTheFish() {
    val day = radomDays()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "grnules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "plankton"
        else -> "fasting"
    }
}


fun radomDays(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}