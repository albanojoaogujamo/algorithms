horaAtual = 8

while horaAtual < 15:
    nomeCliente = input("Introduza o nome do cliente: ")
    temPrioridade = input("Cliente tem prioridade? s/n: ")

    if temPrioridade == "s":
        print("Cliente Prioritário - passa à frente da fila")
    else:
        print("Cliente normal - entra no fim da fila")
        
    operacao = input("Depósito, levantamento ou Atendimento? ")
    print("A processar:", operacao, "para", nomeCliente)

    horaAtual = horaAtual + 1

print("Banco encerrado.")

        
    