package aps_java;
/**
	 Classe conta: classe abstrata Atributos:
	
	N�mero da conta;
	Nome do cliente;
	CPF;
	Saldo;
	M�todos:
	
	public boolean sacar(valorSacado);
	public boolean depositar(valorDepositado);
	public String imprimir(); 
	Construtor: que receba o n�mero da conta, c�digo da ag�ncia,
	nome do cliente e CPF; Todos os atributos dever�o ter get, por�m o saldo,
	o n�mero da conta e CPF n�o poder�o ter sets p�blicos. 
 */


public abstract class Conta {
    private String nomeCliente, CPF;
    int numConta, agencia;
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

    public int getNumConta() {
        return numConta;
    }

    private void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //construtor
    public Conta(String nomeCliente, String CPF, int numConta, int agencia) {
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
        this.numConta = numConta;
        this.agencia = agencia;
    }
    
   public boolean sacar(double valorSacado){
        if(valorSacado<saldo && valorSacado > 0){
            saldo-= valorSacado;
            return true;
        }
            return false;
    }
    
    public boolean depositar(double valorDepositado){
        if(valorDepositado>0){
            saldo += valorDepositado;
            return true;
        }
            return false;
    }
    
    public String imprimir(){
        return "Número da conta: "+ numConta+
                "\nNome do Cliente: "+nomeCliente+
                "\nCPF: "+CPF+
                "\nSaldo: "+saldo;
    }
}
