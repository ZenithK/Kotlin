package Kotlin

fun plusThree(first:Int, second:Int, third: Int) : Int {
    return first + second + third

}

fun minusThree(first:Int, second: Int, third: Int)  = first - second - third

fun multiplyThree(first : Int = 1, second: Int = 1, third: Int = 1) : Int {
    return first * second * third
}

fun main(array: Array<String>){
    println(plusThree(1,2,3))
    println(minusThree(10,1,2))
    println(multiplyThree(2,2,2))
    println(multiplyThree())
}
