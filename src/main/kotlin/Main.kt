import encap.Cliente

fun main() {
    print("Bem-vindo, ao cadastro.\n" + "porfavor, digite o seu nome: ")
    val nome = readLine()!!

    print("Agora, digite o seu telefone: ")
    val telefone = readLine()!!

    print("Para finalizar, digite o seu endereço: ")
    val endereco = readLine()!!

    try {
        val cliente = Cliente(nome, endereco, telefone)

        while (true) {
            println("\n === Menu === \n")

            println("\nAções\n" + "1-) Adicionar itens ao carrinho")
            println("2-) Remover itens ao carrinho")
            println("3-) Listar os itens do carrinho")
            println("Para sair, digite outro valor não correspondente.")

            var opc = 0

            while (true) {
                println("\nDigite a opção desejada: ")

                try {
                    opc = readLine()!!.toInt()
                    break
                } catch (e: Exception) {
                    println("inválido")
                }
            }

            when (opc){

                1 -> {
                    println("Digite o item a ser adicionado: ")
                    val item = readLine()!!
                    cliente.addCompra(item)
                }
                2 -> {
                    println("Qual o item a ser removido: ")
                    val item = readLine()!!
                    cliente.removerCompra(item)
                }

                3 -> cliente.carrinho()

                else -> break

            }

        }

    } catch (e: Exception) {
        println(e.message)
    }
}
