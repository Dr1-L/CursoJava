/*2. Cria  uma  classe  para  representar  uma  conta  corrente  que  possui  
 * um   n�mero,  
 * um  saldo,  
 * um  status  que  informa  se  ela  �  especial  ou  n�o,  
 * um   limite. 
 * Desenvolva  m�todos  para  realizar  saque  (verificando  se  o  cliente   pode  realizar  saques),  
 * despositar  dinheiro,  
 * consultar  saldo  e  
 * verificar  se  o   cliente  est�  usando  cheque  especial  ou  n�o. 
 * Desenvolva  um  programa   para  testar  essa  classe. */
package com.loiane.cursoJava.aula27;

public class ContaCorrente {

	String numero;
	double saldo = 1000;
	boolean statusEspecialOuNao;
	boolean retornoOperacao;
	double limite;
	boolean chequeEspecial = false;
	double valorChequeEspDiponivel = 100.00;
	String msg;

	double consultarSaldo() {
		return saldo;
	}

	double depositarNaConta(double valor) {
		saldo += valor;
		return saldo;
	}

	String realizarSaque(double saque) {
		double saldoAtual = consultarSaldo();

		if (saque > saldoAtual) {
			msg = "Saldo insuficiente.";
		} else {
			saldo = (saldo - saque);
			msg = "Aguarde a contagem de notas...";
		}
		return msg;
	}

	boolean verificaEspecial() {
		return chequeEspecial;
	}

	boolean ativaEspecial(boolean status) {
		chequeEspecial = status;
		return chequeEspecial;
	}

	double consultarCheqEspDisponivel() {
		return valorChequeEspDiponivel;
	}

	String realizarSaqueCqEspecial(double saque) {
		double saldoAtual = consultarCheqEspDisponivel();

		if (saque > saldoAtual) {
			msg = "N�o � poss�vel sacar este valor.";
		} else {
			saldo = (saldo - saque);
			msg = "Aguarde a contagem de notas...";
		}
		return msg;
	}
}
