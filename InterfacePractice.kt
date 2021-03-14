package Kotlin

fun main(args : Array<String>){

}

// Interface는 일종의 약속
// 생성자가 없음 -> 인스턴스화 불가
// 협업 시, 사용하기에 용이함.
// 인터페이스에서 구현한 메서드는 클래스에서 구현할 필요 없음.
interface Person_ {
    fun eat() {

    }
    fun sleep()
    // 반드시 구현해야 함 -> Abstract
    abstract  fun study()
}

class Student_ : Person_{

    override fun sleep() {
        TODO("Not yet implemented")
    }

    override fun study() {}

}

open class Person(){
    open fun eat() {}
    fun sleep() {}
}

class Student() : Person() {
    override fun eat() {
        super.eat()
    }
}

class Teacher() : Person() {}