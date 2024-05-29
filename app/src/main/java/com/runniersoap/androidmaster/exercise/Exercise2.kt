package com.runniersoap.androidmaster.exercise

fun main(){
    var ticketPrice =  ticketPriceCalculate(16, false)
    println(ticketPrice)
}

fun ticketPriceCalculate(age:Int, isMonday:Boolean):Int{
    return when(age){
        in 1 .. 12 -> 15
        in 13 .. 60 -> {
            if(isMonday) 25
            else 30
        }
        in 61 .. 100 -> 20
        else -> -1
    }
}