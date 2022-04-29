package br.com.gcbrandao.testekotlin.modelo

import br.com.gcbrandao.testekotlin.modelo.Funcionario

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }

}