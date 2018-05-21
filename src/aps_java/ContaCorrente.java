/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps_java;

/**
 Classe conta corrente: Herda a classe conta, e adiciona as seguintes modifica��es:


Atributos:
Limite;

M�todos:

public boolean usandoLimite() � retorna true se o cliente estiver utilizando o limite
(saldo negativo), e false em caso contr�rio;

Reimplementa��o do sacar, que deve considerar o limite � mesma assinatura do m�todo original,
 apenas com reimplementa��o;
 
Mudan�as no imprimir, que deve retornar tamb�m o limite da conta; 

Construtor: gera dois construtores: um que recebe apenas os par�metros
 necess�rios ao construtor da classe conta,
e outro que recebe os mesmos par�metros mais o limite da conta.
 */
public class ContaCorrente extends Conta{
    
    private double limite;
               
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public boolean usandoLimite(){
        if(getSaldo() < 0)
        {
            return true;
        }
        else{
            return false;
        }  
    }
    
    
    @Override
    public boolean sacar(double valorSacado){
        if(valorSacado < (getSaldo() + getLimite()) && valorSacado > 0){
            return super.sacar(valorSacado);
        }
            return false;
    }
    
    @Override
    public String imprimir() {
		super.imprimir();
		return "Limite: " + limite;
	}

    public ContaCorrente(String nomeCliente, String CPF, int numConta, int agencia, double limite) {
        super(nomeCliente, CPF, numConta, agencia);
        this.limite = limite;
    }    

    public ContaCorrente(String nomeCliente, String CPF, int numConta, int agencia) {
        super(nomeCliente, CPF, numConta, agencia);
    }
    
    
}
