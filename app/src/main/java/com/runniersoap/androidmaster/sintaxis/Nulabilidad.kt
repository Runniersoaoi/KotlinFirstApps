package com.runniersoap.androidmaster.sintaxis

fun main(){
    var name:String? = "runniersoap"
    // Con los dos !! puedo forzar la ejecución
    println(name!![0])
    // un operador ternario de toda la vida
    println(name?.get(3) ?: "Es nulo wey")

}