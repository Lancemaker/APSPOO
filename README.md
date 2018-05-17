# APSPOO
Atividade Prática Supervisionada : POO
Tema 1 – Conta de Banco – do ponto de vista do banco

Modelagem das classes:

Classe conta: classe abstrata
Atributos:

* Número da conta;
* Nome do cliente;
* CPF;
* Saldo;

Métodos:
* public boolean sacar(valorSacado);
* public boolean depositar(valorDepositado);
* public String imprimir();
Construtor: que receba o número da conta, código da agência, nome do cliente e CPF;
Todos os atributos deverão ter get, porém o saldo, o número da conta e CPF não poderão ter
sets públicos.

Classe conta corrente: Herda a classe conta, e adiciona as seguintes modificações:
Atributos:
* Limite;

Métodos:
* public boolean usandoLimite() – retorna true se o cliente estiver utilizando o limite
(saldo negativo), e false em caso contrário;
* Reimplementação do sacar, que deve considerar o limite – mesma assinatura do
método original, apenas com reimplementação;
* Mudanças no imprimir, que deve retornar também o limite da conta;
Construtor: gera dois construtores: um que recebe apenas os parâmetros necessários ao
construtor da classe conta, e outro que recebe os mesmos parâmetros mais o limite da conta.

Classe conta poupança: Herda a classe conta, e não adiciona atributos.

Métodos:

* public void calculaRendimento(porcentagemRendimento): aplica o valor de rendimento
recebido por parâmetro ao saldo da conta;

Classe conta especial: Herda de conta corrente, e indica uma conta que possui um gerente
associado. Para tanto, adiciona as seguintes modificações:

Atributos:
* nome do gerente responsável;
Métodos:
* get/set do nome do gerente;
* Modificações no imprimir, para que o nome do gerente seja retornado;

Construtor: adiciona o nome do gerente aos dois construtores da classe conta corrente – ou
seja, um construtor recebe os três parâmetros necessários à classe conta, mais o nome do
gerente, e o outro construtor recebe todos esses parâmetros e ainda o limite da conta;

Classe gerenciarContas – reúne todas as contas criadas

Atributos:

* ArrayList de objetos da classe conta;

Métodos:

* public void adicionarConta(Conta c);
* public boolean removerConta(int numeroConta) – retorna true se conseguir encontrar
e remover a conta, false em caso contrário;
* public String buscarContasEspeciais() – busca todas as contas especiais, guardando os
dados dessas contas em uma String e então retornando o resultado da busca;
* public String buscarClientesUsandoLimite() – busca todos os clientes de conta corrente
que estejam utilizando o limite, guardando os dados dessas contas em uma String e
então retornando o resultado da busca;
* public Conta buscarConta(int numeroConta) – busca uma conta pelo seu número, e a
retorna se encontrar. Caso a conta não exista, deve retornar null;
* public boolean transferirValor(int numeroContaFonte, int numeroContaDestino, double
valor)
* public boolean sacar(int numeroConta, double valorSacado) – deve buscar a conta
indicada pelo número e então sacar o valor especificado, usando o método de sacar da
conta. Se a conta não for encontrada, ou o valor não puder ser sacado, retorna false;
* public boolean depositar(int numeroConta, double valorDepositado) – deve buscar a
conta indicada e realizar o depósito. Caso não encontre o número da conta, ou o
depósito falhe, retornar false;
* public String listarContas() – retorna uma String com os dados de todas as contas;

Método main: menu com acesso a todas as opções. No adicionar, lembrar que é possível criar
uma conta de qualquer um dos três tipos – então você deve perguntar ao usuário qual ele quer;

