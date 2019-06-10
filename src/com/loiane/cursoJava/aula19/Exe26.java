/*26.Criar dois vetores A e B cada um com 10 elementos inteiros. 
 * Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: 
 * a) Ci deverá receber 1 quando Ai for maior que Bi; 
 * b) Ci deverá receber 0 quando Ai for igual a Bi; 
 * c) Ci deverá receber -1 quando Ai for menor que Bi. */
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[10];
		int[] vetB = new int[10];
		int[] vetC = new int[10];

		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = (int) Math.round(Math.random() * 20);
			vetB[i] = (int) Math.round(Math.random() * 20);

			if (vetA[i] > vetB[i]) {
				vetC[i] = 1;
			} else if (vetA[i] == vetB[i]) {
				vetC[i] = 0;
			} else {
				vetC[i] = -1;
			}
		}
		
		System.out.println("a) Ci deverá receber 1 quando Ai for maior que Bi;"
							+ "\nb) Ci deverá receber 0 quando Ai for igual a Bi;"
							+ "\nc) Ci deverá receber -1 quando Ai for menor que Bi.");

		System.out.print("\nVetor A: ");
		for (int a : vetA) {
			System.out.print(a + "  ");
		}
		System.out.print("\nVetor B: ");
		for (int b : vetB) {
			System.out.print(b + "  ");
		}
		System.out.print("\nVetor C: ");
		for (int c : vetC) {
			System.out.print(c + "  ");
		}
	}
}