package br.com.alura.bytebank

fun main() {
    val idade1 =  25

    //testaArraySimples()
    //testaArrayIntArrayOf()

   // testaSalarios()
    testaRange()
}



fun testaAgregacao() {
    val idades = intArrayOf(10, 12, 17, 54, 67)

    idades.

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

