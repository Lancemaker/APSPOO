package aps_java;
import java.util.Scanner;
public class APS_Java {
    
    
   public static void menu(){
        System.out.println("Informe a opção desejada: ");
        System.out.println("--------------------- Opções ---------------------");
        System.out.println("1 - Adicionar Cliente");
        System.out.println("2 - Remover Cliente");
        System.out.println("3 - Editar Cliente");
        System.out.println("4 - Buscar por Nome");
        System.out.println("5 - Buscar por CPF");
        System.out.println("6 - Sair");
   }
   
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
        
        Scanner entrada = new Scanner(System.in);
        
        String nomeCliente, CPF, gerente;
        int numConta, agencia, opção;
        double saldo, limite, porcentagemRendimento;     
        
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = entrada.nextLine();
        System.out.println("Digite o CPF do cliente: ");
        CPF = entrada.nextLine();
        System.out.println("Digite o nome do gerente: ");
        gerente = entrada.nextLine();
        System.out.println("Digite o numero da conta: ");
        numConta = entrada.nextInt();
        System.out.println("Digite o codigo da agencia: ");
        agencia = entrada.nextInt();
        System.out.println("Digite o saldo: ");
        saldo = entrada.nextDouble();
        System.out.println("Digite o limite do cartao: ");
        limite = entrada.nextDouble();
        System.out.println("Digite a porcentagem de Rendimento: ");
        porcentagemRendimento = entrada.nextDouble();
        
        opção = entrada.nextInt();
        
        switch(opção){
                case 1:
                    System.out.println("Adicionar");                    
                    break;
                case 2:
                    System.out.println("Remover");
                    break;
                case 3:
                    System.out.println("Editar");
                    break;
                case 4:
                    System.out.println("Buscar por Nome");
                    break;
                case 5:
                     System.out.println("Buscar por CPF");
                     break;
        
        }
        
    }
}
