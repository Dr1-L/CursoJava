/*31.Ler um vetor A com 20 elementos. 
 * Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B. 
 * Sugestão: no início do vetor B armazene os elementos pares de A e 
 * nas posições restantes do vetor B armazene os elementos de A que são ímpares.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[20];
		int[] vetB = new int[20];
		int j = 0;

		System.out.print("Digite os valores para o vetor A: ");
		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = scan.nextInt();

			if (vetA[i] % 2 == 0) {
				vetB[j] = vetA[i];
				j++;
			}
		}

		for (int i = 0; i < vetA.length; i++) {
			if (vetA[i] % 2 != 0) {
				vetB[j] = vetA[i];
				j++;
			}
		}

		System.out.print("\nVetor A: ");
		for (int a : vetA) {
			System.out.print(a + "  ");
		}

		System.out.print("\nVetor B: ");
		for (int b : vetB) {
			System.out.print(b + "  ");
		}
	}
}
