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

    fun addCompra(valor: String) {
        if (valor.isEmpty())
            println("Valor Inválido.")
    }
}