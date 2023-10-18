package com.example.kotlinbasics

fun main(){

    //val numbers:IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    //val numbers = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val numbersD:DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0)

    //println("initial values ${numbersD.contentToString()}")
    numbersD[0] = 11.0
    numbersD[1] = 60.0
    numbersD[4] = 22.0
    numbersD[5] = 1.0
    //println("changed values ${numbersD.contentToString()}")



    val fruit = arrayOf(Fruit("Apple", 2.5),Fruit("Grape", 3.5))
    for(fruit in fruit){
        print(" ${fruit.name}")
    }

    for(index in fruit.indices){
        print("\n${fruit[index].name} is in index $index")
    }

    val mix = arrayOf("Sun", "Mon", "Tues", 1,2,3,Fruit("Apple", 2.5))
    print(mix.contentToString())
}

data class Fruit(val name: String, val price: Double)