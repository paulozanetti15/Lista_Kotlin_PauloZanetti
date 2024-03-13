fun filtrarPares(array: IntArray): IntArray {
    return array.filter { it % 2 == 0 }.toIntArray()
}

fun dobrarValores(array: IntArray): IntArray {
    return array.map { it * 2 }.toIntArray()
}

fun somarValores(array: IntArray): Int {
    return array.sum()
}

fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    val pares = filtrarPares(numeros)
    println("Números pares: ${pares.joinToString()}")

    val dobrados = dobrarValores(numeros)
    println("Valores dobrados: ${dobrados.joinToString()}")

    val soma = somarValores(numeros)
    println("Soma dos valores: $soma")
}
