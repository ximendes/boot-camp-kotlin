package Practice.Spices

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {

    override fun grind() {
        println("grinder")
    }

    override fun prepareSpice() {
        grind()
    }
}


interface Grinder {
    fun grind()
}


interface SpiceColor {
    var color: Color

}

object YellowSpiceColor : SpiceColor {
    override var color = Color.YELLOW
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
}