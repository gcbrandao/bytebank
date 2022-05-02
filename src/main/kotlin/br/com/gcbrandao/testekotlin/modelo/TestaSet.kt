package br.com.alura.bytebank.br.com.gcbrandao.testekotlin.modelo

class TestaSet {

    fun testaSet() {
        val cursoAndroid = setOf("joao", "maria", "paulo", "pedro")
        val cursoKotlin = listOf("joao", "maria", "alex", "jonas")
        val ambos = cursoAndroid + cursoKotlin

        // ambos.addAll(cursoKotlin)
        //ambos.addAll(cursoAndroid)

        println("kotlin --- $cursoKotlin")
        println("android --- $cursoAndroid")

        println(ambos)

        println(cursoKotlin intersect cursoAndroid)
    }
}