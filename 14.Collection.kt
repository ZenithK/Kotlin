package Kotilin

// 14. Collection
// -> list, set, map

fun main(vararg : Array<String>){
    // Immutable Collections (변경 불가능)
    // List
    val numberList = listOf<Int>(1,2,3)
    println(numberList)

    // Set -> 중복을 허용하지 않음
    // -> 순서가 없음 (Index가 없음)
    val numberSet = setOf<Int>(1,2,3,3,3)
    println(numberSet)
    numberSet.forEach{
        println(it)
    }

    // Map -> Key, value 방식으로 관리한다.
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap.get("one"))

    // Mutable Collection (변경 가능)
    var mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println()
    println(mNumberList)


}