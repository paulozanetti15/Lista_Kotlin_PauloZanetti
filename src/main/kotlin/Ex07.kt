fun encontrarStringMaisLonga(lista: List<String>): String? {
    if (lista.isEmpty()) {
        return null
    }

    var stringMaisLonga = lista[0]
    for (string in lista) {
        if (string.length > stringMaisLonga.length) {
            stringMaisLonga = string
        }
    }
    return stringMaisLonga
}

fun main() {
    val listaStrings = listOf("gato", "cachorro", "elefante", "passarinho")

    val maisLonga = encontrarStringMaisLonga(listaStrings)
    if (maisLonga != null) {
        println("A string mais longa é: $maisLonga")
    } else {
        println("A lista de strings está vazia.")
    }
}
