fun main() {
}
class Empty {}

class Outer {

    val name = "Outer"
    fun show() = "the name: $name"

    class Nested {
        val name = "Nested"
        fun show() = "the name: $name"
    }

}

class Outer2 {

    val name1 = "Outer2"
    fun show() = "the name: $name1"

    inner class Inner {
        val name2 = "Inner"
        fun show() = "Data: $name2 and name1"

    }
}
11:12 AM
Ate
Ate Gelay
package practice_activities

fun main(){
//
//    var samsung = Phone("galaxy", "white", 128, 5,168)
//
//    var model = "fold"
//    samsung.model = model
//    println(samsung.model)

    var nokia = Phone("3310")
    var mobilePrice = Phone ("10999")

}

class Phone(var model:String, var color:String, var memory:Int, var cameraPixel:Int, var weightGrams:Int) { //constructor -> primary constructor
    init{
        println("Object Created!")
        println("Phone model is $model")
        println("Color is $color")
        println("memory is $memory")
        println("camera pixel is $cameraPixel")
        println("weight in grams is $weightGrams")
    }
    //secondary constructor
    constructor(model:String):this(model,"white", 128,5, 168){}


    fun color(){
        println("Phone color is $color")
    }
    fun memory(){
        println("Phone memory is $memory")
    }
    fun cameraPixel(){
        println("Phone camera pixel is $cameraPixel")
    }
    fun weightGrams(){
        println("Phone weight in grams is $weightGrams")
    }
}
