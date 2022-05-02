package br.com.alura.bytebank.br.com.gcbrandao.testekotlin.modelo

fun main() {

    val livro1 = Livro(
        titulo = "Java 11",
        autor = "zJames Gosling",
        anoPublicacao = 1998,
        editora = "A"

    )

    val livro2 = Livro(
        titulo = "Kotling todo",
        autor = "panacao",
        anoPublicacao = 2019,
        editora = "A"

    )

    val livro3 = Livro(
        titulo = "AWS clouf",
        autor = "Ze nuvem",
        anoPublicacao = 2000

    )

    val livro4 = Livro(
        titulo = "GCP nma pratica",
        autor = "panacao",
        anoPublicacao = 2012

    )


    val listaDeLivros = mutableListOf<Livro>(livro1, livro2, livro3, livro4)

    println("Lista de Livros ${listaDeLivros.imprimeComMarcadores()}")

    val listaOrdenada = listaDeLivros.sorted()
    listaOrdenada.imprimeComMarcadores()

    val ordenadaPorAutor = listaDeLivros.sortedBy { it.autor }
    ordenadaPorAutor.imprimeComMarcadores()


    //fitrando lista
    listaDeLivros.filter { it.autor.startsWith("pana") }
        .map { it.titulo }



    val listaDeLivrosNull = mutableListOf<Livro?>(livro1, livro2, livro3, livro4, null, null, null)
    listaDeLivrosNull.imprimeComMarcadores()


    // agrupando
    println("####################    AGRUPANDO   #####################")
    listaDeLivros.groupBy { it.editora ?: "Editora desconhecida" }
        .forEach{ (editora, livros) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }

    // testa plateleiras
    println("###############      PRATELEIRAS    ##########################")
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)
    prateleira.organizarPorAnoPublicacao().imprimeComMarcadores()

    prateleira.organizarPorAutor().imprimeComMarcadores()


}

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        "${it.titulo} de ${it.autor}"
    }
    println("#### Lista de LIvros #### \n $textoFormatado")
}

fun listasUnicas() {
    val cursoAndroid = listOf("joao", "maria", "paulo", "pedro")
    val cursoKotlin = listOf("joao", "maria", "alex", "jonas")
    val ambos = cursoKotlin + cursoAndroid

    // ambos.addAll(cursoKotlin)
    //ambos.addAll(cursoAndroid)

    println(ambos.distinct())
}





