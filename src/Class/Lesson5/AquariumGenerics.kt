package Class.Lesson5

fun main(args: Array<String>) {
    genericExample()
}

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true){

    fun addChemicalCleanners(){
        needsProcessed = false
    }
}


class FishWater: WaterSupply(false)

class LakeWater: WaterSupply(true){
    fun filter(){
        needsProcessed  = false
    }
}

class Aquarium <out T: WaterSupply>(val waterSupply: T){

    fun addWater(cleaner: Cleaner<T>){
        check(!waterSupply.needsProcessed) {
            cleaner.clean(waterSupply)
        }
        println("adding water from $waterSupply")
    }
}

interface Cleaner<in T: WaterSupply>{
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater>{
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleanners()
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>){
    println("aquarium water is clean: ${aquarium.waterSupply.needsProcessed}")

}

inline fun<reified R: WaterSupply>  Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

inline fun<reified  T: WaterSupply> WaterSupply.isOfType() = this is T

fun genericExample() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    isWaterClean(aquarium)

    aquarium.waterSupply.addChemicalCleanners()
    aquarium.addWater(cleaner)

    val aquarium4  = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()

    addItemTo(aquarium)

    println(aquarium.hasWaterSupplyOfType<TapWater>())
    println(aquarium.waterSupply.isOfType<LakeWater>())
}




