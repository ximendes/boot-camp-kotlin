package Class.Lesson3

fun main(args: Array<String>) {
    runTimes()
}

fun runTimes() {
    repeat(10) {
        val fortuneCookie = getFortuneCookie()
        println(fortuneCookie)
        if (fortuneCookie.contains("Take it easy")) return

    }
}

fun getFortuneCookie(): String {
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")

    print("Enter your birthday:")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.div(fortunes.size)]
}