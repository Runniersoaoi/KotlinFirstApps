package com.runniersoap.androidmaster.sintaxis

// VARIABLES Y VALORES (CONSTANTES)
//VARIABLES NUMÉRICAS
//Int -2,147,483,647 a 2,147,483,647
val age:Int = 30
var age2:Int = 30
//Long
val example:Long = 30
//Float
val floatExample:Float = 3.1416f
//Double
val doubleExample:Double = 3.14163024

//VARIABLES ALFANUMERICAS
//Char
val charExample:Char = 'e'
//String
val stringExample:String = "Runniersoap"

//VARIABLES BOOLEANAS
//Boolean
val booleanExample:Boolean = true
val booleanExample2:Boolean = false

// CONCATENACION STRING Y VARIABLES
var concatenacionString:String = "Hola soy yo $stringExample tengo 30 años"

fun main(){
    variableNumerica()
    variableAlfabeticas()
    variableBooleanas()
    showMyName("Runniersoap")
    showMyAge(10)
    add(75,86)
    val mySubstract = substract(100,75)
    println(mySubstract)
}

fun variableNumerica(){
    // CONVERSIONES DE TIPO
    var suma = age + floatExample.toInt()
    println(suma)
    println("Suma:")
    println(age + age2)
    println("Restar:")
    println(age - age2)
    println("Multiplicacion:")
    println(age * age2)
    println("Division:")
    println(age / age2)
    println("Modulo")
    println(age % age2)
}

fun variableAlfabeticas(){
    println(stringExample)
    print(concatenacionString)
}

fun variableBooleanas(){
    println(booleanExample)
    println(booleanExample2)
}

fun showMyName(name:String){
    println("Me llamo $name")
}

fun showMyAge(currentAge:Int = 100){
    println("Soy Runniersoap y tengo $currentAge años")
}

fun add(firstNumber:Int, secondNumber: Int){
    println(firstNumber + secondNumber)
}

// SE INDICA EL TIPO DA VALOR QUE VA DEVOLVER
fun substract(firstNumber: Int, secondNumber: Int):Int{
    return firstNumber - secondNumber
}

// UNA FORMA DE RECORTAR UNA FUNCION QUE DEVUELVE ALGUN VALOR
fun substractCool(firstNumber: Int, secondNumber: Int):Int = firstNumber - secondNumber