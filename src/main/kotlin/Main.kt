
import builders.CarBuilder
import builders.CarManualBuilder
import director.Director

fun main(args: Array<String>) {
    val director = Director()
    val builder = CarBuilder()
    director.constructSUV(builder)
    val (carType) = builder.getResult()
    println("Car built: $carType")
    val manualBuilder = CarManualBuilder()
    director.constructSUV(manualBuilder)
    println("Car manual built: \n${manualBuilder.print()}")
}