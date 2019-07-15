package Class.Lesson3

import java.util.*

fun main(args: Array<String>) {
    println(rollDice(12))
    println(rollDice0(0))
    println(rollDice2(90))
    gameplay(rollDice2(12))
}


val rollDice = { sides: Int -> Random().nextInt(sides) + 1 }

val rollDice0 = { sides: Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}


fun gameplay(diceRoll :Int){
    println(diceRoll)
}