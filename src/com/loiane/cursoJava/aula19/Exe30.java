/*30.Ler um vetor A com 20 elementos. 
 * Construir dois vetores B e C, sendo que nos vetor B e C 
 * serão armazenados o valores pares e ímpares de A, respectivamente.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[20];
		int[] vetB = new int[20];
		int[] vetC = new int[20];

		for (int i = 0; i < vetA.length; i++) {
			System.out.print("Digite os valores para o vetor A: ");
			vetA[i] = scan.nextInt();
		}

		int j = 0;
		int k = 0;

		for (int i = 0; i < vetA.length; i++) {

			if (vetA[i] % 2 == 0) {
				vetB[j] = vetA[i];
				j++;
			} else {
				vetC[k] = vetA[i];
				k++;
			}
		}
		System.out.print("\nVetor A: ");
		for (int a : vetA) {
			System.out.print(a + "  ");
		}
		System.out.print("\nVetor B(Pares): ");
		for (int i = 0; i < j; i++) {
			System.out.print(vetB[i] + " ");
		}
		System.out.print("\nVetor C(Ímpares): ");
		for (int i = 0; i < k; i++) {
			System.out.print(vetC[i] + " ");
		}
	}
}
