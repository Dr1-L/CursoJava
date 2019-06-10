//O Departamento Estadual de Meteorologia lhe contratou para desenvolver 
//um programa que leia as um conjunto indeterminado de temperaturas, 
//e informe ao final a menor e a maior temperaturas informadas, 
//bem como a média das temperaturas. 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double temperatura = 0;
		double menor = 0;
		double maior = 0;
		double soma = 0;
		int i = 0;
		char resp;
		double media = 0;

		do {
			System.out.print("Insira a temperatura: ");
			temperatura = scan.nextDouble();
			soma += temperatura;

			if (i == 0) {
				maior = temperatura;
				menor = temperatura;
			}

			i++;

			if (temperatura > maior) {
				maior = temperatura;
			} else if (temperatura < menor) {
				menor = temperatura;
			}

			System.out.print("Lançar nova temperatura? s/n ");
			resp = scan.next().charAt(0);
		} while (resp == 's');

		media = soma / i;
		media = Math.round(media);

		System.out.println("Temperatura maior: " + maior);
		System.out.println("Temperatura menor: " + menor);
		System.out.println("Temperatura media: " + media);
	}
}
