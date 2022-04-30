package br.com.alura.bytebank.br.com.gcbrandao.testekotlin.modelo

import java.math.BigDecimal
import java.math.RoundingMode

fun testaPontoFlutuante() {

    val salarios = bigDecimalArrayOf("1550.00", "2004.44", "5000.00", "12345.09")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosAumento = salarios.
    map { salario ->
        if(salario < "5000".toBigDecimal()){
            salario + "500".toBigDecimal()
        } else {
            (salario * aumento).setScale(2, RoundingMode.UP) }
    }.toTypedArray()

    println("Salarios com aumento ${salariosAumento.contentToString()}")

    val gastoInicial = salariosAumento.somatoria()
    println(gastoInicial)

    val meses  = 6.toBigDecimal();
    val projecao = salariosAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println("Projeção de gastos : $projecao")


    val salariosOrdenados = salariosAumento.sorted()
    val tresUltimosSalarios = salariosOrdenados.takeLast(3).toTypedArray()
    val mediaUltimosSalarios = tresUltimosSalarios.average()
    println("Media dos tres ultimos salarios - $mediaUltimosSalarios")


    // Encadeando chamadas
    val averageEncadeado = salariosAumento.
    sorted().
    takeLast(3).
    toTypedArray().
    average()

}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.average(): BigDecimal {
    return if (this.isEmpty()){
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}



fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{

    return Array<BigDecimal>(valores.size){ i ->
        valores[i].toBigDecimal()
    }

}


fun testaAgregacao() {
    val idades: IntArray = intArrayOf(10, 12, 17, 54, 67)

    val maxOrNull = idades.maxOrNull()
    println("Valor maximo $maxOrNull")

    val minOrNull = idades.minOrNull()
    println("menor idade é $minOrNull")

    val average = idades.average()
    println("Idadae media é $average")

    val maiores = idades.all { it > 18 }
    println("Todos maiores ? - $maiores")

    val anyMaior = idades.any { it >= 18 }
    println("Existe maior? $anyMaior")

    val filterMaiores = idades.filter { it >= 18 }
    println("Maiores de 18 - $filterMaiores")

    val find = idades.find { it > 17 }
    println("Tem alguem com a idades $find")

}




fun testaRange() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie){
        println("$s")
    }

    val intervalo  = 1500..5000
    val valor =  2300
    if(valor in intervalo){
        println("Valor $valor esta no intervalo")
    } else {
        println("Valor $valor nao esta no intervalo")
    }


}

fun mediaNotas() {
    val notas = intArrayOf(7, 5, 8, 9)

    val average = notas.sorted().takeLast(3).average()
}