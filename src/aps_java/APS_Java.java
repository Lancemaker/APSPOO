package aps_java;
import java.util.Scanner;
public class APS_Java {
    
    
  public static void adicionarConta(){
       
   }
   
   public static void remover(){
   }
   
   public static void editar(){
       
   }
   
   public static void buscarPorNome(){
       
   }
   
   public static void buscarPorCPF(){
       
   }
   
    public static void main(String[] args) {
        
        GerenciarContas gerenciador = new GerenciarContas();
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        
        // String nomeCliente, CPF, gerente;
        // int numConta, agencia;
        // double saldo, limite, porcentagemRendimento;     
        
//        System.out.println("Digite o nome do cliente: ");
//        nomeCliente = entrada.nextLine();
//        System.out.println("Digite o CPF do cliente: ");
//        CPF = entrada.nextLine();
//        System.out.println("Digite o nome do gerente: ");
//        gerente = entrada.nextLine();
//        System.out.println("Digite o numero da conta: ");
//        numConta = entrada.nextInt();
//        System.out.println("Digite o codigo da agencia: ");
//        agencia = entrada.nextInt();
//        System.out.println("Digite o saldo: ");
//        saldo = entrada.nextDouble();
//        System.out.println("Digite o limite do cartao: ");
//        limite = entrada.nextDouble();
//        System.out.println("Digite a porcentagem de Rendimento: ");
//        porcentagemRendimento = entrada.nextDouble();
        
        do {
        
        System.out.println("Informe a opcao desejada: ");
        System.out.println("--------------------- Opções ---------------------");
        System.out.println("1 - Adicionar Cliente");
        System.out.println("2 - Remover Cliente");
        System.out.println("3 - Editar Cliente");
        System.out.println("4 - Buscar por Nome");
        System.out.println("5 - Buscar por CPF");
        System.out.println("6 - Sair");
        
        opcao = entrada.nextInt();
        entrada.nextLine();
        
        //case com opções do menu
        switch(opcao){
                case 1:
                    adicionarConta();
                    System.out.println("Informe a opcao desejada: ");
                    System.out.println("--------------------- Opções ---------------------");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Especial");
                    System.out.println("3 - Conta Poupança");
                    
                    opcao = entrada.nextInt();
                    entrada.nextLine();
                    
                    switch(opcao){
                        case 1:
                            System.out.println(ContaCorrente.class);
                            break;
                        case 2:
                            System.out.println(ContaEspecial.class);
                            break;
                        case 3: 
                            System.out.println(ContaPoupanca.class);
                            break;
                    }
                    
                    break;
                case 2:
                    System.out.println("Digite o numero da conta que deseja remover: ");
                       int numeroConta = entrada.nextInt();
                   System.out.println("Você tem certeza que deseja remover esta conta? Aperte 1 para Sim e 2 para Não");
                   if(opcao == 1){ 
                    System.out.println(gerenciador.removerConta(numeroConta));
                   } else
                        System.out.println(""); //retornar ao menu
                       
                    break;
                case 3:
                    editar();
                    break;
                case 4:
                    buscarPorNome();
                    break;
                case 5:
                     buscarPorCPF();
                     break;
                case 6:
                    System.out.println("Obrigado!");
                    System.exit(1);
                   break;
                default:
                    System.out.println("Opção incorreta! Tente novamente!");
                    
            }
        }
        while (opcao != 7);
    }
}

