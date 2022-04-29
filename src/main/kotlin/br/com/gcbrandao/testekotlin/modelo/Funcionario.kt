package br.com.gcbrandao.testekotlin.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    abstract val bonificacao: Double


}