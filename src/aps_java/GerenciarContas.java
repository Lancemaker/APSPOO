package aps_java;
/**
Classe gerenciarContas – reúne todas as contas criadas

Atributos:

ArrayList de objetos da classe conta;
Métodos:

public void adicionarConta(Conta c);

public boolean removerConta(int numeroConta) – retorna true se conseguir encontrar e
remover a conta, false em caso contrário;

public String buscarContasEspeciais() – busca todas as contas especiais,

guardando os dados dessas contas em uma String e então retornando o resultado da busca;

public String buscarClientesUsandoLimite() – busca todos os clientes de conta corrente que 
estejam utilizando o limite, guardando os dados dessas contas em uma String e então 
retornando o resultado da busca;

public Conta buscarConta(int numeroConta) – busca uma conta pelo seu número, e a 
retorna se encontrar. Caso a conta não exista, deve retornar null;

public boolean transferirValor(int numeroContaFonte, int numeroContaDestino, double valor)

public boolean sacar(int numeroConta, double valorSacado) – deve buscar a conta indicada
pelo número e então sacar o valor especificado, usando o método de sacar da conta.
Se a conta não for encontrada, ou o valor não puder ser sacado, retorna false;

public boolean depositar(int numeroConta, double valorDepositado) – deve buscar a conta 
indicada e realizar o depósito. Caso não encontre o número da conta, ou o depósito falhe,
retornar false;

public String listarContas() – retorna uma String com os dados de todas as contas;
 */

import java.util.ArrayList;

public class GerenciarContas {
private ArrayList<Conta> contas = new ArrayList<Conta>();

	
	public void adicionarConta(Conta c) { //adiciona uma conta à lista. 
		contas.add(c);
	}
	
	public boolean removerConta(int numeroConta) {
		for(int i=0; i<contas.size();i++) {
			if(contas.get(i).getNumConta() == numeroConta) {
			contas.remove(i);
			return true;
			}
		}
		return false;
	}
	
	public String buscarContasEspeciais() {
		String string="";
		for(int i=0; i<contas.size();i++) {
			if(contas.get(i) instanceof ContaEspecial) {					
					string+= contas.get(i).imprimir();
			}		
		}
		return string;
	}
	
	public String buscarClientesUsandoLimite() {
		String s ="";
		for (Conta conta : contas) {
			if((conta instanceof ContaCorrente || conta instanceof ContaEspecial)) {
				ContaCorrente cc = (ContaCorrente)conta; 
				if(cc.usandoLimite()) {
					s+=cc.imprimir();
				}
			}
		}
		return s.equals("")?"nenhuma Conta Encontrada":s;		
	}
	
	public Conta buscarConta(int numeroConta) {
		for(int i=0; i<contas.size();i++) {
			if(contas.get(i).getNumConta() == numeroConta) {			
			return contas.get(i);
			}
		}
		return null;	
	}
	
	public boolean transferirValor(int numeroContaFonte, int numeroContaDestino, double valor) {
		Conta tempContaFonte = buscarConta(numeroContaFonte);
		Conta tempContaDestino = buscarConta(numeroContaDestino);		
		
		if((tempContaFonte instanceof ContaCorrente || tempContaFonte instanceof ContaEspecial)) {// garante que se use o metodo especifico de saque da conta corrente que utiliza saldo.
			ContaCorrente cc = (ContaCorrente)tempContaFonte; 
			if(cc.usandoLimite()) {
				if((cc.getSaldo()>=valor) && valor >0) { 
					return cc.sacar(valor)&&tempContaDestino.depositar(valor)?true:false; //retorna verdadeiro se tanto o saque quanto o deposito ocorrerem e retornarem true, caso contrario retorna falso.			
				}
			}
		}	
		
		else if((tempContaFonte.getSaldo()>=valor) && valor >0) { 
		return tempContaFonte.sacar(valor)&&tempContaDestino.depositar(valor)?true:false; //retorna verdadeiro se tanto o saque quanto o deposito ocorrerem e retornarem true, caso contrario retorna falso.			
		}		
		return false;//retorna falso se nao houver saldo ou limite para saque. 
	}
	
	public boolean sacar(int numeroConta, double valorSacado) {
		Conta tempConta = buscarConta(numeroConta);
		return tempConta.sacar(valorSacado);
	}
	
	public boolean depositar(int numeroConta, double valorDepositado) {
		Conta tempConta = buscarConta(numeroConta);
		return tempConta.depositar(valorDepositado);
	}
	
	public String listarContas() {
		String s="";
		for (Conta conta : contas) {	
			s+= (conta.getClass())+" "+conta.imprimir(); 
		}
		return s;
	}
}
