//Crie uma função que receba um número inteiro e retorne verdadeiro se o número for par e falso caso contrário
fun verificador(numero: Int): Boolean {
    return numero % 2 == 0
}

fun main() {
    val numero = 9 // Você pode substituir 10 pelo número que desejar verificar
    println("O número $numero é par? ${verificador(numero)}")
}
