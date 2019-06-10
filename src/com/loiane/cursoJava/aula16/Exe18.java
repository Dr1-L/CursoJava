//Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. 
//Um número primo é aquele que é divisível somente por ele mesmo e por 1. 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int numero = scan.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				System.out.println("Não é primo.");
			} else {
				System.out.println("É primo.");
			}
		}
	}
}
