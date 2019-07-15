package Practice.Decorations

import Practice.Spices.Curry
import Practice.Spices.Spice

fun main(args: Array<String>) {
    makeDecorations()
}


fun makeDecorations() {


    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
            SpiceContainer(Curry("Red Curry", "medium")),
            SpiceContainer(Curry("Green Curry", "spicy")))

    for (element in spiceCabinet) println(element.spice)

}


data class SpiceContainer(var spice: Spice) {
    val label = spice.name
    val color = spice.color
}