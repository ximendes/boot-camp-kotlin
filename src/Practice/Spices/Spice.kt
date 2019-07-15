package Practice.Spices

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color{

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                 "extremely spicy" -> 10
                else -> 0
            }
        }

    abstract fun prepareSpice()

}