package br.unifor.exercicios.Algoritmos

import jdk.nashorn.internal.objects.NativeString.substring

/*
* Faça um algoritmo para ler a letra inicial do primeiro nome de uma pessoa (char),
* seu último nome (String), sua idade (int), sua altura em metros (double) e se é casado (boolean).
* Após a leitura de todos os dados, o algoritmo deve imprimir estas mesmas informações conforme modelo abaixo:
*
* A. Anderson
* Idade: 34 anos
* Altura: 1.85 metros
* Casado: true
*
*/

fun main(args:Array<String>){

    println("Informe seu nome: ")
    val nome: String = readLine().toString()
    println("Informe sua idade: ")
    val idade: Int = readLine()?.toInt()?:0
    println("Informe sua altura em metros: ")
    val altura: Double = readLine()?.toDouble()?:0.00
    println("Informe se é casado: ")
    val estado: Boolean = readLine()?.toBoolean()?:false

    println(imprimir(nome,idade, altura, estado))

}

fun imprimir(nome: String, idade: Int, altura: Double, estado: Boolean){

    println("${nome.take(1)}. $nome")
    println("Idade: $idade")
    println("Altura: $altura metros")
    println("Casado: $estado")

}