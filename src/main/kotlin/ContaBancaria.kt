class ContaBancaria(var saldo: Double, val limite: Double) {
    fun saque(valor: Double) {
        if (valor > saldo + limite) {
            throw Exception("Saldo insuficiente")
        } else {
            saldo -= valor
            println("Saque de $valor realizado com sucesso. Novo saldo: $saldo")
        }
    }
}

fun main() {
    val conta = ContaBancaria(1000.0, 200.0)

    try {
        conta.saque(1300.0)
    } catch (e: Exception) {
        println(e.message)
    }
}
