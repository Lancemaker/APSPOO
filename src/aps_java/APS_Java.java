package aps_java;
import java.util.Scanner;
public class APS_Java {   
	
	static String PegaNome(Scanner entrada) {
		System.out.println("Digite o nome do cliente: ");
	    return entrada.nextLine();
	}
	
	static String PegaCPF(Scanner entrada) {
		System.out.println("Digite o CPF do cliente: ");
	    return entrada.nextLine();
	}
	
	static String PegaNomeDoGerente(Scanner entrada) {
		entrada.nextLine();
		System.out.println("Digite o nome do gerente: ");
	    return entrada.nextLine();
	}
	
	static int PegaNumeroDaConta(Scanner entrada) {
		System.out.println("Digite o numero da conta: ");
	    return entrada.nextInt();
	}
	
	static int PegaNumeroDaContaFonte(Scanner entrada) {
		System.out.println("Digite o numero da conta Fonte: ");
	    return entrada.nextInt();
	}
	
	static int PegaNumeroDaContaDestino(Scanner entrada) {
		System.out.println("Digite o numero da conta Destino: ");
	    return entrada.nextInt();
	}
	
	static int PegaAgencia(Scanner entrada) {
		System.out.println("Digite o codigo da agencia: ");
	    return entrada.nextInt();
	}
	
	static double PegaLimite(Scanner entrada) {
		System.out.println("Digite o limite: ");
	    return entrada.nextDouble();
	}
	
	static double PegaValor(Scanner entrada) {
		System.out.println("Digite o valor: ");
		return entrada.nextDouble();
	}
	
	static double PegaRendimento(Scanner entrada){
		System.out.println("Digite a porcentagem de Rendimento: ");
	    return entrada.nextDouble();
	}
    public static void main(String[] args) {
        
        GerenciarContas manager = new GerenciarContas();
        Scanner entrada = new Scanner(System.in);     
      
      
        
        int opcao;
        
        do {
        System.out.println("Informe a opcao desejada: ");
        System.out.println("--------------------- Opcoes ---------------------");
        System.out.println("1 - Adicionar Conta");
        System.out.println("2 - Remover Conta");
        System.out.println("3 - Buscar Contas Especiais");
        System.out.println("4 - Buscar Cliente Usando Limite");
        System.out.println("5 - Buscar conta");
        System.out.println("6 - Transferir Valores entre contas");
        System.out.println("7 - Sacar");
        System.out.println("8 - Depositar");
        System.out.println("9 - Listar contas");
        System.out.println("10 - sair");
        
        opcao = entrada.nextInt();
        entrada.nextLine();
        
        //case com opções do menu
        switch(opcao){
                case 1:
                    
                    System.out.println("Informe a opcao desejada: ");
                    System.out.println("--------------------- Opcoes ---------------------");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Especial");
                    System.out.println("3 - Conta Poupanca");
                    
                    opcao = entrada.nextInt();
                    entrada.nextLine();                    
                    switch(opcao){
                        case 1:
                            manager.adicionarConta((Conta) new ContaCorrente(PegaNome(entrada),PegaCPF(entrada),PegaNumeroDaConta(entrada),PegaAgencia(entrada),PegaLimite(entrada)));
                            entrada.nextLine();
                            break;
                        case 2:
                            manager.adicionarConta((Conta) new ContaEspecial(PegaNome(entrada),PegaCPF(entrada),PegaNumeroDaConta(entrada),PegaAgencia(entrada),PegaLimite(entrada),PegaNomeDoGerente(entrada)));;
                            entrada.nextLine();
                            break;
                        case 3: 
                            manager.adicionarConta((Conta) new ContaPoupanca(PegaNome(entrada),PegaCPF(entrada),PegaNumeroDaConta(entrada),PegaAgencia(entrada)));
                            entrada.nextLine();
                            break;
                    }
                    
                    break;
                case 2:
                    System.out.println("Digite o numero da conta que deseja remover: ");
                       int numeroConta = entrada.nextInt();
                   System.out.println("Você tem certeza que deseja remover esta conta? Aperte 1 para Sim e 2 para N�o");
                   if(entrada.nextInt() == 1){ 
                    System.out.println(manager.removerConta(numeroConta));
                   } else
                        System.out.println("");
                       
                    break;
                case 3:
                    System.out.println(manager.buscarContasEspeciais());
                case 4:
                	System.out.println(manager.buscarClientesUsandoLimite());
                    break;
                case 5:                	 
                     System.out.println(manager.buscarConta(PegaNumeroDaConta(entrada)));
                     entrada.nextLine();
                     break;
                     
                case 6:
                	System.out.println(manager.transferirValor(PegaNumeroDaContaFonte(entrada), PegaNumeroDaContaDestino(entrada), PegaValor(entrada)));                	
                	break;
                case 7:
                	System.out.println(manager.sacar(PegaNumeroDaConta(entrada), PegaValor(entrada)));
                	break;
                case 8:
                	System.out.println(manager.depositar(PegaNumeroDaConta(entrada), PegaValor(entrada)));
                	break;
                case 9:
                	System.out.println(manager.listarContas());
                	break;                     
                case 10:                	
                    System.out.println("Obrigado!");
                    System.exit(1);
                   break;
                default:
                    System.out.println("Opcao incorreta! Tente novamente!");
                    
            }
        }
        while (opcao != 10);
    }
}

