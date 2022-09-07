package exercises

fun main(){
    var sum: Int = 0
    var input: String

    do {
        println("Enter Number:")
        input = readLine()!!
        sum += input.toInt()

    }while (input != "0")

    println("sum = $sum")
    
}