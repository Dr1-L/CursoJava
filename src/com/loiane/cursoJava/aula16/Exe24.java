/*O Sr. Manoel Joaquim acaba de adquirir uma panificadora e 
 * pretende implantar a metodologia da tabelinha, 
 * que já é um sucesso na sua loja de 1,99. 
 * Você foi contratado para desenvolver o programa que 
 * monta a tabela de preços de pães, de 1 até 50 pães, 
 * a partir do preço do pão informado pelo usuário, 
 * conforme o exemplo abaixo:

    Preço do pão: R$ 0.18
    Panificadora Pão de Ontem - Tabela de preços
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

		System.out.print("Insira o valor do pão: R$ ");
		preco = scan.nextDouble();

		System.out.println("Preço do pão: R$ " + preco);
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");

		while (qtd <= 50) {
			System.out.println(qtd + " - R$ " + df.format(qtd * preco));
			qtd++;
		}
	}
}
