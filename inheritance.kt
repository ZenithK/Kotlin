package Kotlin

// 중복된 메서드가 2번까지는 OK
// 2번이 넘으면 리팩토링 하자.
// --> 상속 사용

fun main(args : Array<String>){

}

// private가 default 값임
open class Car2(){
   open fun drive(){
        println("달린다")
    }

    fun stop(){

    }

}

class SuperCar1() : Car2() {
    override fun drive() {
        println("빨리 달린다")
//        super.drive()
    }
}

class Truck1(){

}

class Bus1() : Car2() {
}