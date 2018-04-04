package br.unifor.exercicios.Algoritmos

import java.util.Calendar
import java.util.GregorianCalendar


/*
* Faça um algoritmo que recebe o ano de nascimento de uma pessoa e o ano atual,
* calcula e mostra  a idade dessa pessoa ao final do ano atual e ao final do ano de 2020.
*/

fun main(args: Array<String>) {
    println("Informe o ano de nascimento: ")
    val ano: Int = readLine()?.toInt() ?: 0
    println("O ano em que você nasceu é: $ano")

    var cal = GregorianCalendar.getInstance()
    var anoatual = cal.get(Calendar.YEAR)

    var idade = anoatual - ano
    var idade2020 = 2020 - ano

    println("Sua idade atual é $idade")
    println("Sua idade em 2020 será $idade2020")

}



