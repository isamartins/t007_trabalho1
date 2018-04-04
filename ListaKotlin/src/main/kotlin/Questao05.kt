package br.unifor.exercicios.Algoritmos

/*
* Faça um algoritmo para calcular a temperatura em graus Fahrenheit
* a partir da temperatura em graus Celcius. Obs.: Fahrenheit = ((9*Celsius)/5)+32
*/

fun main(args: Array<String>){

    println(temperatura(2.00))

}

fun temperatura(celcius: Double) = ((9*celcius)/5)+32.00