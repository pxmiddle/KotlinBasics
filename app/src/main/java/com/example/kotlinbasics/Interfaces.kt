package com.example.kotlinbasics

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

open class Carro(override val maxSpeed: Double, val name: String,
               val brand: String): Drivable{
    override fun drive(): String {
        return "driving the interface drive"
    }

    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }

}

class CarroEletrico(maxSpeed: Double, name: String, brand: String, batteryLife: Double): Carro(maxSpeed, name, brand){
    var chargerType = "Type1"
    override  var range = batteryLife * 6

    override fun drive(distance: Double) {
        println("drove for $distance KM on electricity")
    }

    override fun drive(): String{
        return "Drove for $range KM on electricity"
    }

    override fun brake(){
        super.brake()
        println("brake inside of electric car")
    }
}

fun main(){
    var audiA3 = Carro(200.0, "A3", "Audi")
    var teslaS = CarroEletrico(240.0, "S-Model", "Tesla", 85.0)
    teslaS.chargerType = "type2"
    //teslaS.extendRange(200.0)

    //teslaS.drive()
    teslaS.brake()
    audiA3.brake()

    //audiA3.drive(200.0)
    //teslaS.drive(200.0)
}
