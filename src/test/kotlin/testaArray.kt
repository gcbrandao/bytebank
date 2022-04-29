
fun testaSalarios() {

    val salarios: DoubleArray = doubleArrayOf(1500.00, 2500.30, 1200.00, 8000.0)
    println("Salarios Origem = ${salarios.contentToString()}")
    val aumento = 1.1

    // iterando pelo elemento
    var indice = 0
    for (salario in salarios){
        salarios[indice] = salario * aumento
        indice++
    }
    println("Salarios aumento = ${salarios.contentToString()}")

    //iterando pelo indice
    indice = 0
    for (indice in salarios.indices){
        salarios[indice] = salarios[indice] * aumento
    }
    println("Salarios aumento = ${salarios.contentToString()}")

    // Iteramndo forEachj no index
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumento
    }
    println("Salarios aumento = ${salarios.contentToString()}")


}


fun testaArrayIntArrayOf() {
    val idades: IntArray = intArrayOf(25,19, 20, 55, 40)

    var maiorIdade = 0

    for (idade in idades){
        if(maiorIdade < idade){
            maiorIdade = idade
        }
    }
    println("Maior Idade $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (menorIdade > idade){
            menorIdade = idade
        }
    }
    println("Menor Idade $menorIdade")
}


fun testaArraySimples() {
    val idades = IntArray(4)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println(maiorIdade)
}
