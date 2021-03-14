package Kotlin

// 사용 목적 : 다양한 타입의 객체들을 다루는 메서드나 컬렉션
//             클래스에서 컴파일 시에 타입을 체크

fun main(args : Array<String>) {

    // 제너릭을 사용하지 않은 경우

    val list1 = listOf(1,2,3,"가") // --> Any 타입으로 설정됨. : Int, Float, String의 부모 타입
    val b : String = list1[2].toString()

    // 제너릭을 사용하는 경우
    val list2 = listOf<String>("a", "b", "c")
    val c : String = list2[2] // String이라는 것을 보장받게 됨

    // 강한 타입을 체크할 수 있다.
}