import br.com.gcbrandao.testekotlin.modelo.Cliente
import br.com.gcbrandao.testekotlin.modelo.Conta
import br.com.gcbrandao.testekotlin.modelo.ContaCorrente
import br.com.gcbrandao.testekotlin.modelo.Endereco

fun testaComportamentosConta() {

    val clienteGil = Cliente("Gilberto", "1231231231", Endereco(), 1234)
    var conta = ContaCorrente(clienteGil, 1000)


    testaCondicoes(conta.saldo)
    testaLacos()
}