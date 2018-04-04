package br.unifor.exercicios.Algoritmos

/* Faça um algoritmo que recebe como entrada o salário-base de um funcionário,
 * calcula e mostra a gratificação, o imposto e o salário a receber, sabendo-se
 * que esse funcionário tem gratificação de 5% sobre o salário-base e paga imposto de 7%
 * também sobre o salário-base. Utilize a saída formatada.
*/

fun main(args: Array<String>){

    println("Digite o salário base: ")
    val e : Double = readLine()?.toDouble() ?: 0.00

    println(salario(e))
}

fun salario(sb: Double){

    val g: Double = (sb * 5)/100
    val imp: Double = (sb * 7)/100
    val sr: Double = sb + g + imp

    println("O Salário a receber é: $sr,\nImposto: $imp\nGratificação: $g")
}