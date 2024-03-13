class Triangulo(val base: Double, val altura: Double) {
    fun area(): Double {
        return (base * altura) / 2
    }
}

fun main() {
    val triangulo = Triangulo(5.0, 3.0)

    val areaTriangulo = triangulo.area()

    println("A área do triângulo é: $areaTriangulo")
}
