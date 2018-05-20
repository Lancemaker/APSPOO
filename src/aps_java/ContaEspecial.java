package aps_java;

/**
Classe conta especial: Herda de conta corrente, e indica uma conta que possui um
gerente associado. Para tanto, adiciona as seguintes modificações:

Atributos:

nome do gerente respons�vel; 

M�todos:
get/set do nome do gerente;
Modifica��es no imprimir, para que o nome do gerente seja retornado;
Construtor: adiciona o nome do gerente aos dois construtores da classe conta corrente 
� ou seja, um construtor recebe os tr�s par�metros necess�rios � classe conta,
mais o nome do gerente, e o outro construtor recebe todos esses par�metros e ainda 
o limite da conta;
 */
public class ContaEspecial extends ContaCorrente{
        String gerente;

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public ContaEspecial(String gerente, String nomeCliente, String CPF, String numConta, String agencia) {
        super(nomeCliente, CPF, numConta, agencia);
        this.gerente = gerente;
    }
    
}
