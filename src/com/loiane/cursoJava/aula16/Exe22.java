/*Fa�a um programa que calcule o valor total investido por um colecionador em sua cole��o de CDs 
 * e o valor m�dio gasto em cada um deles. 
 * O usu�rio dever� informar a quantidade de CDs e o valor para cada um. */
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = 1;
		double total = 0;
		double media = 0;

		System.out.println("Diga a quantidade CD's na sua cole��o: ");
		int qtd = scan.nextInt();

		do {
			System.out.print("Insira o valor do " + i + "� CD.");
			double valor = scan.nextDouble();
			i++;
			total = total + valor;

		} while (i <= qtd);

		media = total / qtd;
		media = Math.round(media);
		
		System.out.println("Valor total da cole��o: R$ " + total);
		System.out.println("Valor m�dio de cada CD: R$ " + media);
	}
}
