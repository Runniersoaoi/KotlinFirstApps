package com.runniersoap.androidmaster.sintaxis

fun main(){
    inmutableList()
    mutableList()
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    println(readOnly)
    println(readOnly.size)
    println(readOnly[0])
    println(readOnly.last())

    val example = readOnly.filter { it.contains("a") }
    println(example)

    readOnly.forEach{ weekDay -> println(weekDay)}
}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    // AGREGAR ITEM AL FINAL
    weekDays.add("Runniersoap")
    // AGREGAR ITEM SEGUN INDICE
    weekDays.add(0,"Runniersoap")

    // Verifica que la lista no este vacia
    if(!weekDays.isEmpty()){
        println(weekDays)
    }
    if(weekDays.isNotEmpty()){
        println(weekDays)
    }
}

