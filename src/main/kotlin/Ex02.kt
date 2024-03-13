//Crie uma função que receba um array de inteiros e retorne o maior número.

fun encontrarMaiorNumero(array: IntArray): Int? {
    if (array.isEmpty()) {
        return null
    }

    var maior = array[0]
    for (numero in array) {
        if (numero > maior) {
            maior = numero
        }
    }
    return maior
}

fun main() {
    val numeros = intArrayOf(5, 8, 2, 9, 3)
    val maiorNumero = encontrarMaiorNumero(numeros)
    if (maiorNumero != null) {
        println("O maior número é: $maiorNumero")
    } else {
        println("O array está vazio.")
    }
}
