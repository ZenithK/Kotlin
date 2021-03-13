package Kotlin

fun main(vararg:Array<String>) {
    var numList = mutableListOf<Int>()
    var numListd = mutableListOf<Boolean>()
    for(i in 0..9)
    {
        numList.add(i)
    }
    for(i in 0..9)
    {
        if(numList[i]%2 == 0){
            numListd.add(true)
        }else{
            numListd.add(false)
        }
    }
    println(numList)
    println(numListd)

    println()
    println("No.2 Problem")

    var second = 80
    var degree = when(second){
        in 80..90 -> "A"
        in 70..79 -> "B"
        in 60..69 -> "C"
        else -> "F"
    }

    println(degree)
    println()
    println("No.3 Problem")
    println(sum(52))

    println()
    println("No.4 Problem")
    gugudan()
}

fun sum(number : Int) : Int = number/10 + number%10

fun gugudan(){
    for(i in 1..9){
        for(j in 1..9){
            println(""+i+" * " + j + " = " + i*j);
        }
    }
}