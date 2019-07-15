package Class.Decorations

fun main(args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    println(d2)

    val d3 = Decorations("slate")
    println(d3)

    println( "d1 equals to d2 ?  ${d1.equals(d2)}")
    println( "d2 equals to d3 ?  ${d2.equals(d3)}")

    val d4 = d3.copy()
    println( "d3 equals to d4 ? ${d3.equals(d4)}")


    val d5 = Decorations2("crystal", "wood", "diver")
    println(d5)

    val(crystal, wood, diver) = d5
    println(crystal)
    println(wood)
    println(diver)
}


data class Decorations(val rcoks: String) {}

data class Decorations2(val rcoks: String, val wood: String, val diver: String) {}