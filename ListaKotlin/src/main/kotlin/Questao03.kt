package br.unifor.exercicios.Algoritmos

/*
* Faça um algoritmo que lê dois números inteiros num1 e num2, efetua a troca dos valores
* de forma que a variável num1 passe a possuir o valor da variável num2 e a variável num2
* passe a possuir o valor da variável num1, e mostra os valores destas variáveis ao final da troca.
*
*/

fun main(args: Array<String>){
    println("Informe o primeiro número: ")
    var numero1 = readLine()?.toInt()?:0
    println("Informe o segundo número: ")
    var numero2 = readLine()?.toInt()?:0

    var troc = numero1
    numero1 = numero2
    numero2 = troc

    println("Número 1 agora é: $numero1 e o Número 2 é: $numero2")
}