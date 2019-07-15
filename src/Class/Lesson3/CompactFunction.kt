package Class.Lesson3

fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
    println(shouldChangeWater("friday"))
}

fun whatShouldIDoToday(weather: String = "Sunny", temperature: Int = 24): String {
    print("What is the mood:")
    val mood = readLine()

    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        else -> "Stay home and read."
    }
}

fun shouldChangeWater(day: String, temperature: Int = 31, dirty: Int = 20): Boolean {

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSuday(day) -> true
        else -> false
    }
}


fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSuday(day: String) = day == "Sunday"

















