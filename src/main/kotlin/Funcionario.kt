class Funcionario(val nome: String, val idade: Int, val salario: Int)

fun encontrarFuncionarioMaiorSalario(funcionarios: List<Funcionario>): Funcionario? {
    if (funcionarios.isEmpty()) {
        return null
    }

    var funcionarioMaiorSalario = funcionarios[0]
    for (funcionario in funcionarios) {
        if (funcionario.salario > funcionarioMaiorSalario.salario) {
            funcionarioMaiorSalario = funcionario
        }
    }
    return funcionarioMaiorSalario
}

fun main() {
    val funcionarios = listOf(
        Funcionario("Pz", 24, 9000),
        Funcionario("Fasola", 25, 3500),
        Funcionario("Lucato", 40, 2800)
    )

    val funcionarioMaiorSalario = encontrarFuncionarioMaiorSalario(funcionarios)
    if (funcionarioMaiorSalario != null) {
        println("O funcionário com maior salário é: ${funcionarioMaiorSalario.nome}, Salário: ${funcionarioMaiorSalario.salario}")
    } else {
        println("A lista de funcionários está vazia.")
    }
}
