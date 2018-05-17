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

Método main: menu com acesso a todas as opções. No adicionar, lembrar que é possível
criar uma conta de qualquer um dos três tipos – então você deve perguntar ao usuário
qual ele quer;
 */

public class GerenciarContas {

}
