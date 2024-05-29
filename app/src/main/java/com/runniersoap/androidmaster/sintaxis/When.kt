package com.runniersoap.androidmaster.sintaxis

fun main(){
    getMonth(3)
    getTrimester(4)
    getSemester(8)
    result(true)
}

fun getMonth(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("No es valido")
    }
}

fun getTrimester(month: Int){
    when(month){
        1,2,3 -> println("Primer trimestre")
        4,5,6 -> println("Segundo trimestre")
        7,8,9 -> println("Tercer trimestre")
        10,11,12 -> println("Cuarto trimestre")
    }
}

fun getSemester(month:Int){
    when(month){
        in 1 .. 6 -> println("Primer Semestre")
        in 7 .. 12 -> println("Segundo Semestre")
        else -> println("Fuera del rango")
    }
}

fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print("Holiwi")
    }
}