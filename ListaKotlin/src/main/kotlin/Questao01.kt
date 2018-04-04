package br.unifor.exercicios.Algoritmos

/*
* Determine o resultado das expressões abaixo, considerando os valores atribuídos
* às seguintes variáveis inteiras a = 1, b = 3 , c = 4 e d = 8, e real e = 2.0.
*
* 1) a + b + c + d / 4		    6) 2 * b - d / 2
* 2) b / e						7) d % b == 0
* 3) ! (c > d)					8) a > b || b < c && (b > c || c < d)
* 4) d / b						9) b > c || ! (2 * c != d)
* 5) a > b || b < c			   10) ''a + b + c'' + d
*/

fun main(args: Array<String>){

    println("Escolha uma questão entre 1 e 10: ")
    val esc: Int = readLine()?.toInt() ?: 0
    println(escolha(esc))
}

fun escolha(esc: Int){

    val a = 1
    val b = 3
    val c = 4
    val d = 8
    val e = 2.0

    when(esc){

         1 -> println(a + b + c + d / 4)
         2 -> println(b / e)
         3 -> println(!(c > d))
         4 -> println(d / b)
         5 -> println(a > b || b < c)
         6 -> println(2 * b - d / 2)
         7 -> println(d % b == 0)
         8 -> println(a > b || b < c && (b > c || c < d))
         9 -> println(b > c || ! (2 * c != d))
        10 -> println("a + b + c + " + d)
    }
}
