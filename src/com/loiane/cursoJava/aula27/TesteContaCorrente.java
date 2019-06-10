/*2. Cria  uma  classe  para  representar  uma  conta  corrente  que  possui  um   número,  
 * um  saldo,  um  status  que  informa  se  ela  é  especial  ou  não,  um   limite. 
 * Desenvolva  métodos  para  realizar  saque  (verificando  se  o  cliente   pode  realizar  saques),  
 * despositar  dinheiro,  consultar  saldo  e  verificar  se  o   cliente  está  usando  cheque  especial  ou  não.
 * Desenvolva  um  programa   para  testar  essa  classe. */
package com.loiane.cursoJava.aula27;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		Scanner scan = new Scanner(System.in);

		char resp;
		double valorTransacao;

		do {
			System.out.print("\n 1 - Verificar saldo" 
					+ "\n 2 - Realizar saque" 
					+ "\n 3 - Realizar depósito"
					+ "\n 4 - Verificar Cheque Especial" 
					+ "\n 5 - Sair" 
					+ "\nDigite a opção desejada: ");
			resp = scan.next().charAt(0);

			while (resp != '1' && resp != '2' && resp != '3' && resp != '4' && resp != '5') {
				System.out.println("Opção inválida. Digite novamente.");
				resp = scan.next().charAt(0);
			}

			switch (resp) {
			case '1':
				System.out.println("\nSaldo atual: R$" + cc.consultarSaldo());
				break;

			case '2':
				System.out.println("\nInsira o valor que deseja sacar: ");
				valorTransacao = scan.nextDouble();

				double testarSaldo = cc.consultarSaldo();

				if (testarSaldo <= 0) {
					System.out.println("\nSaldo insuficiente.");
				} else {
					System.out.println(cc.realizarSaque(valorTransacao));
				}
				break;

			case '3':
				System.out.println("\nValor do depósito R$: ");
				valorTransacao = scan.nextDouble();
				double saldoAtual = cc.depositarNaConta(valorTransacao);
				System.out.println("Saldo atual: R$ " + saldoAtual);
				break;

			case '4':
				if (!cc.chequeEspecial) {
					System.out.print("\nVocê não utiliza cheque especial. Deseja contratar? s/n");
					resp = scan.next().charAt(0);
					if (resp == 's') {
						boolean status = true;
  						if(cc.ativaEspecial(status)) {
  						  System.out.println("Cheque especial ativado.");
  						}else {
  						  System.out.println("Ocorreu um problema, verifique com seu gerente.");
  						}
					} else {
						System.exit(0);
					}
				} else {
					System.out.println("\nVocê já esta utilizando seu cheque especial.");
				}
				System.out.println("Valor disponivel para saque: R$ " + cc.consultarCheqEspDisponivel());
				break;

			case '5':
				System.exit(0);
				break;
			}
		} while (resp != 5);
	}
}
