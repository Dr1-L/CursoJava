/*25.Criar um vetor A com 10 elementos inteiros. 
 * Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: 
 * a) Bi deverá receber 1 quando Ai for par; 
 * b) Bi deverá receber 0 quando Ai for ímpar.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[10];
		int[] vetB = new int[10];

		for (int i = 0; i < vetA.length; i++) {
			System.out.print("Insira um valor inteiro [" + i + "]: ");
			vetA[i] = scan.nextInt();

			if (vetA[i] % 2 == 0) {
				vetB[i] = 1;
			} else {
				vetB[i] = 0;
			}
		}

		System.out.print("\nVetor A:");
		for (int a : vetA) {
			System.out.print(a + " ");
		}
		System.out.print("\nVetor B:");
		for (int b : vetB) {
			System.out.print(b + " ");
		}
	}
}
