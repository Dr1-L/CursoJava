//Encontrar números primos é uma tarefa difícil. 
//Faça um programa que gera uma lista dos números primos 
//existentes entre 1 e um número inteiro informado pelo usuário
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um valor limite: ");
		int num = scan.nextInt();
		boolean ehPrimo = true;
		
		for (int i = 1; i <= num; i++) {
			ehPrimo = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					ehPrimo = false;
				}
			}
			if (ehPrimo) {
				System.out.println(i);
			}
		}
	}
}
