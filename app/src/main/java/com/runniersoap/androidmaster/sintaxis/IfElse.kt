package com.runniersoap.androidmaster.sintaxis

fun main(){
    ifBasico()
    ifAnidado()
    ifBoolean()
    ifInt()
    ifMultiple()
}

fun ifMultiple(){
    var age = 18
    var parentPermission = false

    if(age >=18 && parentPermission){
        println("Cumples todo sal y se feliz")
    }else if(age >=18 || parentPermission){
        println("Te falta un requisito es como tener el pan y no la mermelada")
    }else{
        println("La vida le da sus peores batallas a sus mejores guerreros")
    }
}

fun ifInt() {
    var age: Int = 29
    if(age >= 18){
        println("Puedes beber cerveza")
    } else{
        println("Por el momento solo toma jugo")
    }
}

fun ifBoolean(){
    var soyFeliz:Boolean = true

    if(soyFeliz){
        println("La vida es asi no la he inventado yoooo")
    } else if(!soyFeliz){
        println("Por que si mi alma volare tururu ERAS TU SIEMPRE SERAS TU")
    }
}

fun ifAnidado(){
    val animal:String = "dog"

    if(animal == "dog"){
        println("Es un perrito")
    }else if(animal == "cat"){
        println("Es un gato")
    }else if(animal == "pajaro"){
        println("Es un pajaro")
    }else {
        println("No es ninguno de los animales esperados")
    }
}

fun ifBasico(){
    val name:String = "Runniersoap"

    if(name == "Pepe"){
        println("Oye, la variable name es Pepe")
    } else {
        println("No encaja en ninguna de las condiciones")
    }
}