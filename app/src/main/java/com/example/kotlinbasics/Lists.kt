package com.example.kotlinbasics

fun main(){

    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3,true,false,"Hello")
    //print(anyTypes.size)
    //print(months[1])

    /*for(month in months){
        println(month)
    }
*/
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    val newMonths2 = arrayOf("July", "August", "September","October","November","December")
    additionalMonths.addAll(newMonths2)
    //print(additionalMonths)

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    days[2] = "Sunday"
    days.removeAt(1)
    val removeList = mutableListOf<String>("Mon", "Wed")
    //days.removeAll(removeList)
    days.removeAll(days)
    print(days)
}