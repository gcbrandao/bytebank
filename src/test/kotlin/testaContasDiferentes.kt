import br.com.gcbrandao.testekotlin.modelo.Cliente
import br.com.gcbrandao.testekotlin.modelo.ContaCorrente
import br.com.gcbrandao.testekotlin.modelo.ContaPoupanca
import br.com.gcbrandao.testekotlin.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente("Alex", "21717171771", Endereco(),1234 ),
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular =Cliente("Fran", "21717171771", Endereco(),1234 ),
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}