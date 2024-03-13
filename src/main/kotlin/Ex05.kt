//Implemente uma função lambda que retorne o maior valor entre dois números.

val maiorValor = { a: Int, b: Int -> if (a > b) a else b }

fun main() {
    val numero1 = 10
    val numero2 = 20

    val resultado = maiorValor(numero1, numero2)

    println("O maior número entre $numero1 e $numero2 é: $resultado")
}
