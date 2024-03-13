fun String.isPalindromo(): Boolean {
    val textoLimpo = this.replace("\\s".toRegex(), "").toLowerCase()
    val tamanho = textoLimpo.length
    for (i in 0 until tamanho / 2) {
        if (textoLimpo[i] != textoLimpo[tamanho - i - 1]) {
            return false
        }
    }
    return true
}

fun main() {

    val palavras = listOf("ovo", "Ana", "radar", "banana", "arara", "casa")

    for (palavra in palavras) {
        if (palavra.isPalindromo()) {
            println("$palavra é um palíndromo.")
        } else {
            println("$palavra não é um palíndromo.")
        }
    }
}
