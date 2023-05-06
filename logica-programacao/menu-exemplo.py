import os


def sairDoSistema():
    exit()

def funcaoExemplo():
    print("Bem vindo ao modulo de locacao de veiculos\n")
    menu()
    
def menu():
    print("1 - Cadastro do usuario\n")
    print("2 - Cadastro do veiculo\n")
    print("3 - Locar um veiculo\n")
    print("4 - Exemplo de uso da funcao no sistema\n")
    print("5 - Sair\n")
    opcao = int(input("Digite o numero da opcao desejada\n=> "))
    os.system('cls' if os.name == 'nt' else 'clear')

    match opcao:
        case 4:
            funcaoExemplo() 
        case 5:
            sairDoSistema()

menu()
   




    
    
