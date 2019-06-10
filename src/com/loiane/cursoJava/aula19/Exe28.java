/*28.Ler um vetor A com 10 elementos e 
 * construir um vetor B de mesmo tipo e tamanho e 
 * com os mesmos elementos de A, 
 * sendo que estes deverão estar invertidos, ou seja, 
 * o primeiro elemento de A passa a ser o último de B, 
 * o segundo elemento de A passa a ser o penúltimo de B e assim por diante.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[10];
		int[] vetB = new int[10];
		int tamVetB = (vetB.length - 1);

		for (int i = 0; i < vetA.length; i++) {
			System.out.print("Insira um valor inteiro [" + i + "]: ");
			vetA[i] = scan.nextInt();

			vetB[tamVetB - i] = vetA[i];
		}

		System.out.print("\nVetor A:->");
		for (int a : vetA) {
			System.out.print(a + " ");
		}
		System.out.print("\nVetor B:<-");
		for (int b : vetB) {
			System.out.print(b + " ");
		}
	}
}
