package encap

class Cliente (private val nome: String) {
    private var endereco = ""
    private var telefone = ""
    private val listaDeCompras = mutableListOf<String>()

    constructor(nome: String, endereco: String) : this(nome) {
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String) : this(nome, endereco) {
        this.telefone = telefone
    }

    init {
        if (nome.isEmpty()) {
            throw  Exception("Classe Cliente não instanciada corretamente.")
        }
    }

    fun addCompra(valor: String) {
        if (valor.isEmpty()) {
            println("Inválido")
        } else {
            listaDeCompras.add(valor)
            println("Item $valor foi adicionado ao carrinho com sucesso")
        }

        fun removerCompra(valor: String) {
            if (valor.isEmpty()) {
                println("Inválido")
            } else if (listaDeCompras.contains(valor)) {
                listaDeCompras.remove(valor)
                println("Item $valor foi removido com sucesso!")
            } else {
                println("Item $valor não existe na lista")
            }
        }

        fun carrinho() {
            println(" === Carrinho de $nome === \n")
            listaDeCompras.forEach() {
                println(it)
            }
        }
    }
}
