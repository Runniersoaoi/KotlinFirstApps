package com.runniersoap.androidmaster.sintaxis

fun main(){
    val weekDays= arrayOf("Lunes", "Martes", "Miercoles","Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays[0])
    println(weekDays.size)

    // Bucles para Arrays
    for(position in weekDays.indices){
        println(weekDays[position])
    }

    // CON VALUE PUEDES OBTENER EL VALOR :)
    for ((position,value) in weekDays.withIndex()){
        println("La posicion $position contiene $value")
    }

    // SOLO CON EL VALUE
    for(weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}