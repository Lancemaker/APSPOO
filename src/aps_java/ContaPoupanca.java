/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps_java;

/**
Classe conta poupan�a: Herda a classe conta, e n�o adiciona atributos.

M�todos:

public void calculaRendimento(porcentagemRendimento): 
aplica o valor de rendimento recebido por par�metro ao saldo da conta;
 */


//muito facil!
// é isso ? kkkk


public class ContaPoupanca extends Conta {
    
	private double porcentagemRendimento;

    public double getPorcentagemRendimento() {
        return porcentagemRendimento;
    }

    public void setPorcentagemRendimento(double porcentagemRendimento) {
        this.porcentagemRendimento = porcentagemRendimento;
    }
    
    public void calculaRendimento(double porcentagemRendimento){
      if(porcentagemRendimento > 0 ){
          depositar((porcentagemRendimento/100) * getSaldo());          
      }                
    }
    
    public ContaPoupanca(String nomeCliente, String CPF, int numConta, int agencia) {
		super(nomeCliente, CPF, numConta, agencia);		
	}
    
    
    
}
