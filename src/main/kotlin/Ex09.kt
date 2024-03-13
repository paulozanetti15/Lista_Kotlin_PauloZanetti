fun ordenarLista(lista: List<Int>): List<Int> {
    val listaOrdenada = lista.toMutableList()

    for (i in 1 until listaOrdenada.size) {
        val chave = listaOrdenada[i]
        var j = i - 1

        while (j >= 0 && listaOrdenada[j] > chave) {
            listaOrdenada[j + 1] = listaOrdenada[j]
            j--
        }
        listaOrdenada[j + 1] = chave
    }

    return listaOrdenada
}

fun main() {
    val numeros = listOf(5, 2, 8, 1, 6, 3)

    val numerosOrdenados = ordenarLista(numeros)

    println("Lista de números ordenada: $numerosOrdenados")
}
