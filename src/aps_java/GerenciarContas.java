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

	//metodos:
	
	//adiciona uma conta à lista. 
	public void adicionarConta(Conta c) {
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
					string+= contas.get(i).getNumConta();//refatorar quando o metodo imprimir da classe ContaEspecial estiver pronto Deveria retornar todos os dados e nao so o numero da conta.
			}		
		}
		return string;
	}
	
	public String buscarClientesUsandoLimite() {
		return "Precisa refatorar";		//Atributo limite ainda nao foi implementado na classe ContaCorrente.
	}
	
	public Conta buscarConta(int numeroConta) {
		for(int i=0; i<contas.size();i++) {
			if(contas.get(i).getNumConta() == numeroConta) {			
			return contas.get(i);
			}
		}
		return null;	
	}
	
	public boolean transferirValor(int numeroContaFonte, int numeroContaDestino, double valor) {//é necessario checar o limite. Conta corrente ainda nao foi implementada. 
		Conta tempContaFonte = buscarConta(numeroContaFonte);
		Conta tempContaDestino = buscarConta(numeroContaDestino);
		if(tempContaFonte.getSaldo()>=valor && valor >0) { //nao é uma boa ideia fazer saques iguais a zero, o cliente pode perder dinheiro se houver taxa sobre saques. 
		return tempContaFonte.sacar(valor)&&tempContaDestino.depositar(valor)?true:false; //retorna verdadeiro se tanto o saque quanto o deposito ocorrerem e retornarem true.			
		}		
		return false;//retorna falso se nao houver saldo para saque na conta fonte. 
	}
	
	public boolean sacar(int numeroConta, double valorSacado) {//é necessario checar o limite.
		Conta tempConta = buscarConta(numeroConta);
		return tempConta.sacar(valorSacado);
	}
	public boolean depositar(int numeroConta, double valorDepositado) {
		Conta tempConta = buscarConta(numeroConta);
		return tempConta.depositar(valorDepositado);
	}
	public String listarContas() {
		return "";//refatorar
	}
}
