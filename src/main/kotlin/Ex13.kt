// Definindo a função de ordem superior
fun operacaoMatematica(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(a, b)
}

// Definindo algumas funções lambda para operações matemáticas
val soma: (Int, Int) -> Int = { a, b -> a + b }
val subtracao: (Int, Int) -> Int = { a, b -> a - b }
val multiplicacao: (Int, Int) -> Int = { a, b -> a * b }
val divisao: (Int, Int) -> Int = { a, b -> a / b }

fun main() {
    // Realizando diferentes operações matemáticas usando a função de ordem superior
    val resultadoSoma = operacaoMatematica(5, 3, soma)
    val resultadoSubtracao = operacaoMatematica(10, 7, subtracao)
    val resultadoMultiplicacao = operacaoMatematica(4, 6, multiplicacao)
    val resultadoDivisao = operacaoMatematica(15, 3, divisao)

    // Imprimindo os resultados
    println("Soma: $resultadoSoma")
    println("Subtração: $resultadoSubtracao")
    println("Multiplicação: $resultadoMultiplicacao")
    println("Divisão: $resultadoDivisao")
}
