package com.example.kotlinbasics

data class User(val id: Long, var name: String)

fun main(){
    /*
    // type string
    var myName = "Pablo"
    // type int 32 bit
    var myAge = 24

    //Integer TYPES: Byte (8 bits), Short (16 bit),
    // Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.141592265338

    // Booleans he type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterCar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length -1]

    //println("First Character $firstCharInStr and the length of myStr is ${myStr.length}")

    //Arithmetic operators (0+, -, *, /, %)
    var result = 5+3
    result /= 2
    //print(result)

    //Comparison operators ( ==, !=, <, >, <=, >=)
    val isEqual = 5==3

    val isNotEqual = 5!=5
    //println("isNotEqual is $isNotEqual")
    //println("is5greater3 ${-5>3}")
    //println("is5LowerEqual3 ${5 <= 3}")
    //println("is5GreaterEqual3 ${5 >= 3}")
    //println("is5GreaterEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    myNum *= 4
    //println("myNum is $myNum")

    //Increment & Decrement operators (++, --)
    myNum++
    //println("myNum is $myNum")
    //println("myNum is ${myNum++}")
    //println("myNum is ${++myNum}")
    //println("myNum is ${--myNum}")
/*
    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2){
        println("use raw force")
    }
    else if(heightPerson1 == heightPerson2){
        println("use your power technique 1337")
    }
    else{
        println("use technique")
    }

    val age = 17

    if(age >= 31)
        println("you're over 30")

    if(age >=  21){
        print("now you may drink in the US")
    }else if(age >= 18){
        print("you may vote now")
    }else if(age >=16){
        print("you may drive now")
    }else{
        print("you're too young")
    }

    var name = "Pablo"

    if(name == "Pablo"){
        println("Welcome home Pablo")
    }else{
        println("Who are you?")
    }

    var isRainy = true
    if(isRainy)
        println("It's rainy")

*/

     /*
    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month) {
       in 3..5 -> {
           println("Spring")
       }
       in 6..8 -> {
           println("Summer")
       }
       in 9..11 -> {
           println("Fall")
       }
       12, 1, 2 -> {
           println("Winter")
       }
       else -> {
           println("Invalid Season")
       }
    }

    var age = 35
    when(age){
       !in 0..20 -> {
           println("now you may drink in the US")
       }
       in 18..20 -> {
           println("you may vote now")
       }
       16,17 -> {
           println("you may drive now")
       }
        else -> {
            println("you're too young")
        }
    }

    var x : Any = 13.37f
    when(x){
        is Int -> {
            println("$x is an Int")
        }
        is Double -> {
            println("$x is a Double")
        }
        is String -> {
            println("$x is a String")
        }
        else -> {
            println("$x is none of the above")
        }
    } */

    // While loop executes a block of code repeatedly as long as a given condition is true
    /*var x = 1
    while(x <= 10){
        println("$x")
        x++
    }
    println("\nwhile loop is done")
 */
    var y = 100
    while (y >= 0){
        println("$y")
        y -= 2
    }

    // Do while loop
    // The do-while loop is similar to while loop except that it
    // tests the condition at the end of the loop.
    // This means that it will at least execute the body once
    var x =1
    do{
        print("$x")
        x++
    }
    while(x <= 10)
    println("\ndo while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("It's comfy now")
        }
    }

    // For Loop
    // A for-loop is used to iterate through ranges, arrays, collections, or anything
    // that provides an iterator
    for(num in 1..10){ // Same as - for(i in 1.until(10))
        print("$num ")
    }

    for(i in 10 downTo 0 step 2){ // Same as - for(i in10.downTo(1).step(2))
        print("$i ")
    }

    for(num in 1..10000) {
        if(num == 9001)
            println("IT'S OVER 9000!!!")
    }

    var humidityLevel = 80
    var humidity = "humid"
    while (humidity == "humid") {
        humidityLevel -= 5
        println("humidity decreased")
        if (humidityLevel < 60){
            humidity = "comfy"
            print("It's is $humidity now")
        }
    }

    var z = 12
    while(z <= 10){
        print("$z ")
    }

    for (x in 0..9) {
        for (y in 0..9) {
            println("Result = ${x * y}")
        }
    }

    var a = 0
    for (y in 0..9) {
        a += y
    }

    println("$a")


    for (i in 1 until 20) {
        print("$i ")
        if(i/2 == 5){
            break
        }
    }
    print("Done with the loop")



    for(i in 1 until 20){
        // 10/2 = 5
        // 11/2 = 5.5 which is 5 in term of an int
        if(i/2 == 5){
            continue
        }
    }
  */

    /*
    // Method - a Method is a Function within a class
    // argument
    var result =addUP(5,3)
    println("result is $result")

    var resultAvg = avgMeter(7.0, 10.0)
    println("Result is $resultAvg")


    var name :String = "Pablo"
    name = "Jordam"
    // name = null -> Compilation ERROR
    var nullableName :String? = "Pablo"
    //nullableName = null

    var len2 = nullableName?.length
    nullableName?.let{ println(it.length)}

    // ?: Elvis operator
    val name2 =nullableName ?: "Guest"
    println("name is $name2")


    println(nullableName!!.lowercase())
    

    // Creating instances of classes
    var pablo = Person("Pablo", "Maia", age = 23)
    pablo.hobby = "Surf"
    pablo.age = 24
    println("Pablo is ${pablo.age} years old")
    pablo.stateHobby()
    var ze = Person()
    ze.hobby = "Play video games"
    ze.stateHobby()

    //var ze = Person()
    //var zeAlguem = Person(lastName = "Alguem")
*/

   /* var myCar = Car()
    myCar.owner
    myCar.myBrand
    println("brand is ${myCar.myBrand}")
    myCar.maxSpeed = 200
    println("Maxspeed is ${myCar.maxSpeed}")
    println("Model is ${myCar.myModel}")
*/
    /*
    val user1 = User(1, "Pablo")

    val user2 = User(1, "Josh")
    println(user1 == user2)

    println("User details: $user1")

    val updatedUser = user1.copy(name="Pablo Maia")
    println(updatedUser)

    println(updatedUser.component1()) // prints 1
    println(updatedUser.component2()) // prints Pablo Maia

    val(id, name) = updatedUser
    println("id=$id, name=$name")
*/
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}

class MobilePhone(osName: String, brand: String, model: String){

    private var battery = 30

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }

/*
class Person(firstName: String = "Ze", lastName: String = "Ninguem"){
    // Member Variable - Properties
    var age : Int? = null
    var hobby : String = "watch Netflix"
    var name : String? = null


    // Initializer Block
    init{
        this.name = firstName
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName")
    }
    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName){
        this.age = age
        this.name = firstName
        println("Initialized a new Person object with " +
                "firstName = $name and lastName = $lastName and age $age")
    }

    // Member functions - Methods
    fun stateHobby(){
        println("$name hobby is $hobby")
    }
}
*/

class Car(){
    lateinit var owner : String

    val myBrand : String = "BMW"
        //custom getter
        get(){
            return field.lowercase()
        }

    var maxSpeed: Int = 250
        //get() = field
        set(value){
            field = if(value>0) value else throw IllegalArgumentException("Maxspeed cannot be less than 0")
        }
    var myModel : String = "M5"
        private set

    init {
        this.myModel = "M3"
        this.owner = "Frank"
    }
}
}