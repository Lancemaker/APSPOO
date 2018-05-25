package aps_java;
import java.util.Scanner;
public class APS_Java {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String nomeCliente, CPF, gerente;
        int numConta, agencia;
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
        
        
    }
    
}
