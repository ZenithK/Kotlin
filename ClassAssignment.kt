package Kotlin

    fun main(vararg : Array<String>){
        var op = operation(4,2)
        op.plus()
        op.minus()
        op.multiply()
        op.division()

        var myAccount = account("paul","78-12-17")
        myAccount.verifyValue()
        myAccount.importValue(100000)
        myAccount.exportValue(20000)


    }


class operation(var first : Int, var second : Int){
    fun plus(){
        println(""+ first + " + " + second + " = " + (first + second));
    }

    fun minus(){
        println(""+ first + " - " + second + " = " + (first - second))
    }

    fun multiply(){
        println(""+ first + " * " + second + " = " + (first * second))
    }

    fun division(){
        if(second == 0){
            println("error!")
        }else{
            println(""+ first + " / " + second + " = " + (first / second))
        }
    }
}

class account(){
   var name : String = ""
   var birth : String = ""
   var remainValue : Int = 0
    constructor(name : String, birth : String) : this() {
        this.name = name
        this.birth = birth
        this.remainValue = 0
    }

    fun verifyValue(){
        println(this.remainValue)
    }

    fun exportValue(value : Int){
        if(remainValue < value){
            println("export is impossible")
        }else{
            remainValue -= value
            println(this.remainValue)
        }

    }

    fun importValue(value : Int){
        remainValue += value
        println(this.remainValue)
    }

}

// Chanining method
class Calculator(val initialValue : Int) {

    fun plus(number : Int) : Calculator{
        val result = this.initialValue + number
        return Calculator(result)
    }

    fun minus(number : Int) : Calculator{
        val result = this.initialValue - number
        return Calculator(result)
    }

    fun multiply(number: Int) : Calculator {
        val result  =this.initialValue * number
        return Calculator(result)
    }

    fun divide(number : Int) : Calculator{
        val result = this.initialValue / number
        return Calculator(result)
    }

}

class TV(val channels : List<String>){
    var onOff = false;
    var currentChannelNumber = 0
        set(value){
            field = value
            println(value)
        }
    fun switch() {onOff = !onOff}

    fun checkCurrentChannel() : String{
        return channels[currentChannelNumber]
    }

    fun channelUp(){
        currentChannelNumber = currentChannelNumber + 1
    }

    fun channelDown(){
        currentChannelNumber = currentChannelNumber - 1
    }
}