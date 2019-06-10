/*O Sr. Manoel Joaquim acaba de adquirir uma panificadora e 
 * pretende implantar a metodologia da tabelinha, 
 * que j� � um sucesso na sua loja de 1,99. 
 * Voc� foi contratado para desenvolver o programa que 
 * monta a tabela de pre�os de p�es, de 1 at� 50 p�es, 
 * a partir do pre�o do p�o informado pelo usu�rio, 
 * conforme o exemplo abaixo:

    Pre�o do p�o: R$ 0.18
    Panificadora P�o de Ontem - Tabela de pre�os
    1 - R$ 0.18
    2 - R$ 0.36
    ...
    50 - R$ 9.00*/
package com.loiane.cursoJava.aula16;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(1);
		
		double preco = 0;
		int qtd = 1;

		System.out.print("Insira o valor do p�o: R$ ");
		preco = scan.nextDouble();

		System.out.println("Pre�o do p�o: R$ " + preco);
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");

		while (qtd <= 50) {
			System.out.println(qtd + " - R$ " + df.format(qtd * preco));
			qtd++;
		}
	}
}
