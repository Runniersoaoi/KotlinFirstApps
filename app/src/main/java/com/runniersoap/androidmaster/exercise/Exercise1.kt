package com.runniersoap.androidmaster.exercise

// EJERCICIO DE MOSTRAR EL NUMERO DE NOTIFICACIONES

fun main(){
    exercise1(100)
}

fun exercise1(notificationsAmount:Int){
    if(notificationsAmount >= 1 && notificationsAmount <=99){
        println("You have $notificationsAmount notifications")
    } else {
        println("You have +99 notifications")
    }
}