package Kotlin

// 16. Iterable

fun main(vararg : Array<String>){
    val a  = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)
    for (item in a){
        println(item)
    }

    // 반복하는 방법 (2)
    for((index, item) in a.withIndex()){
        println("index : " + index + " value " + item)
    }

    // 반복하는 방법 (3)
    a.forEach{
        println(it)
    }

    // 반복하느 방법 (4)
    a.forEach{
        item -> println(item)
    }

    // 반복하는 방법 (5)
    a.forEachIndexed { index, item -> println("index" + index + " value : " + item )  }

    // 반복하는 방법 (6)
    // until은 마지막을 포함하지 않음 0 ~ a.size - 1

    for (i in 0 until a.size){
        println(a.get(i))
    }

    // 반복하는 방법 (7)
    for (i in 0 until a.size step (2)){
        println(a.get(i))
    }
    // 반복하는 방법 (8)
    for (i in a.size -1 downTo (0)){
        println(a.get(i))
    }
    // 반복하는 방법 (9)
    for (i in a.size -1 downTo (0) step (2)){
        println(a.get(i))
    }
    // 반복하는 방법 (10)
    // ..은 마지막을 포함한다.
    for (i in 0..a.size-1){
        println(a.get(i))
    }

    // 반복하는 방법 (11)
    var b : Int = 0
    var c : Int = 4

    while (b<c) {
        b++
        println(b)
    }
}