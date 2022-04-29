fun testaCondicoes(saldo: Double) {


    when {
        saldo > 0.0 -> println("Saldo Positivo")
        saldo == 0.0 -> println("Saldo neutro")
        else -> println("Saldo Negativo")
    }

}