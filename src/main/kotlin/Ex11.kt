fun stringsComecamComA(lista: List<String>): List<String> {
    return lista.filter { it.startsWith("A", ignoreCase = true) }
        .sorted()
}

fun main() {
    val listaStrings = listOf("Maçã", "Banana", "Abacaxi", "Laranja", "Amora", "Uva", "Alface")

    val listaA = stringsComecamComA(listaStrings)

    println("Strings que começam com a letra 'A' em ordem alfabética: $listaA")
}
