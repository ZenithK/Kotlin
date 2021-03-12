package Kotlin

var a1 : Int = 10
var b1: Int = 5

val max = if(a1 > b1) {
    a1
}else{
    b1
}
fun main(){
    var value: Int = 3

    when(value){
        1 -> println("value is 1")
        2 -> println("value is 2")
        3 -> println("value is 3")
        else -> println("value is else")
    }

    println(max)

    var array2 = arrayOf<Int>(1,2,3,4,5)
    println(array2 is Array)

    var group2 = arrayOf(1,2,3,4,5)
    group2[0] = 100
    println(group2[0])
}
