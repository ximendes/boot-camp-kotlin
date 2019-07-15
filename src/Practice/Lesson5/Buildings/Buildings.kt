package Practice.Lesson5.Buildings

open class BaseBuildingMaterial{
    open val numberNeeded = 1
}


class Wood : BaseBuildingMaterial(){
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial(){
    override val numberNeeded = 8

}

class Building<out T: BaseBuildingMaterial>(val baseBuildingMaterial: T){

    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseBuildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build(){
        println("$actualMaterialsNeeded ${baseBuildingMaterial::class.simpleName} required.")
    }
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>){
    println(if (building.actualMaterialsNeeded < 500 ) "small building" else "large building")
}

fun main(args: Array<String>) {
    val wood = Building(Wood())
    val brick = Building(Brick())

    wood.build()
    brick.build()

    isSmallBuilding(wood)
    isSmallBuilding(brick)
}