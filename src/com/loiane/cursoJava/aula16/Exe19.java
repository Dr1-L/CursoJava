//Faça um programa que calcule o mostre a média aritmética de N notas. 
package com.loiane.cursoJava.aula16;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(1);
		
		char resp = 's';
		int cont = 0;
		double soma = 0;
		double media = 0;
		
		while (resp == 's') {
			cont++;

			System.out.print("Insira uma nota: ");
			double numero = scan.nextDouble();
			soma += numero;

			System.out.print("Deseja lançar outra nota? ");
			resp = scan.next().charAt(0);
		}
		media = soma /cont;
		System.out.println("Média: " + df.format(media));
	}
}
