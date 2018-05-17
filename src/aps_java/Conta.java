package aps_java;

/**
 Classe conta: classe abstrata Atributos:

Número da conta;
Nome do cliente;
CPF;
Saldo;
Métodos:

public boolean sacar(valorSacado);
public boolean depositar(valorDepositado);
public String imprimir(); 
Construtor: que receba o número da conta, código da agência,
nome do cliente e CPF; Todos os atributos deverão ter get, porém o saldo,
 o número da conta e CPF não poderão ter sets públicos. 
 */
public class Conta {
    private String nomeCliente, CPF, numConta, agencia;
    private double saldo;

    
    //Getters e Setters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCPF() {
        return CPF;
    }

    private void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNumConta() {
        return numConta;
    }

    private void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //construtor
    public Conta(String nomeCliente, String CPF, String numConta, String agencia) {
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
        this.numConta = numConta;
        this.agencia = agencia;
    }
    
   /* public boolean sacar(Objconta.valorSacado,double saldo){
        if(valorSacado<saldo){
            saldo-= valorSacado;
            return true;
        }
            return false;
    }
    
    public boolean depositar(valorDeposito,double saldo){
        if(valorDeposito>0){
            saldo += valorDeposito;
            return true;
        }
            return false;
    }*/
    //falta o metodo imprimir.
}
