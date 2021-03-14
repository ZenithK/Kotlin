package Kotlin

// 변수의 접근 범위
// 1. 전역 변수
// 2. 지역 변수

var number100 : Int = 10

fun main(vararg :Array<String>){
    println(number100)
}

class Test(var name : String) {

    fun testFun(){
        name = "홍길동"
        number100 = 100
    }
}