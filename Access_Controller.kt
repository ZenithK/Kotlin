package Kotlin

// 23. 접근 제어자
// Private 키워드 -> 클래스 외부에서의 접근 제어
fun main(array: Array<String>) {
    val night = Night(20,4)
    val monster = Monster(15,5)

    night.attack(monster)
    monster.attack(night)
}

class Night(private var hp : Int, private var power : Int){
    fun attack(monster: Monster){
        monster.defense(power)
    }

    fun defense(damage : Int){
        hp -= damage
        if(hp > 0) {
            heal()
            println("기사 현재 체력은 $hp 입니다")
        }
        else println("기사가 죽었습니다.")
    }

    private fun heal() {
        hp += 3
    }

}

class Monster(private var hp : Int, private var power : Int){
    fun attack(night : Night){
        night.defense(power)
    }

    fun defense(damage : Int){
        hp -= damage
        if(hp > 0) println("몬스터 현재 체력은 $hp 입니다")
        else println("몬스터가 죽었습니다.")
    }

}


class TestAccess{
    private var name : String

    constructor(name : String) {
        this.name = name
    }

    fun test(){
        println("Test")
    }
}