//Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um n�mero primo. 
//Um n�mero primo � aquele que � divis�vel somente por ele mesmo e por 1. 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int numero = scan.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				System.out.println("N�o � primo.");
			} else {
				System.out.println("� primo.");
			}
		}
	}
}
