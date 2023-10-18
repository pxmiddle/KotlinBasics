package com.example.kotlinbasics

abstract class Mammal(private val name: String, private val origin: String,
                      private val weight: Double){ // Concrete (Non Abstract) Properties

    // Abstract Property (Must be overriden by SubClasses)
    abstract var maxSpeed: Double

    // Abstract Methods (Must be implemented by SubClasses)
    abstract fun run()
    abstract fun breath()

    // Concrete (Non Abstract) Method
    fun displayDetails(){
        println("Name: $name, Origin $origin, Weight: $weight, " +
                "Max Speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double,
            override var maxSpeed: Double): Mammal(name, origin, weight){

    override fun run() {
        // Code to run
        println("Runs on two legs")
    }

    override fun breath() {
        // code to breath
        println("Breath through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double,
               override var maxSpeed: Double): Mammal(name, origin, weight){

    override fun run() {
        // Code to run
        println("Runs on four legs")
    }

    override fun breath() {
        // code to breath
        println("Breath through the trunk")
    }
}

fun main(){
    val human = Human("Pablo", "Brasil", weight = 60.0, 15.0)
    val elephant = Elephant("Bily", "South Africa", weight = 1230.0, 50.0)


    human.run()
    elephant.run()

    human.breath()
    elephant.breath()


}