package Kotlin

fun main(args: Array<String>) {
    val monster = SuperMonster(100, 10)
    val night = SuperNight(130, 8)
    monster.attack(night)
    monster.bite(night)
}

// 상속의 특징
// - 자식 클래스는 부모 클래스의 타입을 이어 받음.

open class Character(var hp: Int, var power: Int) {

    fun attack(character: Character, power: Int = this.power) {
        character.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            println("${javaClass.simpleName}남은 체력은 $hp 입니다")
        } else println("죽었습니다.")
    }

}

// 자식 클래스가 인스턴스화 되기 위해서 부모 클래스가 선행되어서 인스턴스화 되어야 한다.
class SuperNight(hp: Int, power: Int) : Character(hp, power) {
    val defensePower = 2
    override fun defense(damage: Int) {
        super.defense(damage - defensePower)
    }
}


class SuperMonster(hp: Int, power: Int) : Character(hp, power) {
    fun bite(character: Character) {
        super.attack(character, power + 2)
    }
}