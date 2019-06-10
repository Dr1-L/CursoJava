//Fa�a um programa que pe�a para n pessoas a sua idade, 
//ao final o programa devera verificar se a m�dia de idade da turma 
//varia entre 0 e 25,26 e 60 e maior que 60; 
//e ent�o, dizer se a turma � jovem, adulta ou idosa, 
//conforme a m�dia calculada. 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char resp = 's';
		int cont = 0;
		double soma = 0;

		while (resp == 's') {
			cont++;
			System.out.print("Insira a idade: ");
			double idade = scan.nextDouble();
			soma += idade;

			System.out.print("Lan�ar outra idade? ");
			resp = scan.next().charAt(0);
		}
		if (soma > 0 && soma <= 25) {
			System.out.println("Turma jovem.");
		} else if (soma >= 26 && soma <= 60) {
			System.out.println("Turma adulta.");
		} else {
			System.out.println("Turma idosa.");
		}
		System.out.println("M�dia: " + Math.round(soma/cont));
	}
}
