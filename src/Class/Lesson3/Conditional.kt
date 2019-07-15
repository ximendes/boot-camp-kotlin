package Class.Lesson3

fun main(args: Array<String>) {
    conditional()
}

fun conditional() {
    val temperature = 10
    val isHot = temperature > 50
    println(isHot)

    println("You are ${if (temperature > 50) "fried" else "safe"} fish")
    val time = 11

    println("${if (time < 12) "Good morning" else "Good night"}, Kotlin")
}