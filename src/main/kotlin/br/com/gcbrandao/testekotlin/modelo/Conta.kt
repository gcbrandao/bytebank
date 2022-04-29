package br.com.gcbrandao.testekotlin.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Conta

        if (titular != other.titular) return false
        if (numero != other.numero) return false
        if (saldo != other.saldo) return false

        return true
    }

    override fun hashCode(): Int {
        var result = titular.hashCode()
        result = 31 * result + numero
        result = 31 * result + saldo.hashCode()
        return result
    }


}