//Crie uma função que receba uma string e retorne verdadeiro se a string for um palíndromo (ou seja, pode ser lida da
// mesma forma de trás para frente).

fun palindromo(str: String): Boolean {
    val reversed = str.reversed()
    return str == reversed
}

fun main() {
    val palavra = "paulo" // Substitua "radar" pela string que deseja verificar
    if (palindromo(palavra)) {
        println("A palavra '$palavra' é um palíndromo.")
    } else {
        println("A palavra '$palavra' não é um palíndromo.")
    }
}
