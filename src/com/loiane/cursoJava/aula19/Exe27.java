/*27.Criar um vetor A com 10 elementos inteiros. 
 * Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de forma��o: 
 * a) Bi dever� receber 'a' quando Ai for menor que 7; 
 * b) Bi dever� receber 'b' quando Ai for igual a 7; 
 * c) Bi dever� receber 'c' quando Ai for maior que 7 e menor que 10; 
 * d) Bi dever� receber 'd' quando Ai for igual a 10; 
 * e) Bi dever� receber 'e' quando Ai for maior que 10. 
 * Sugest�o: char B[10];*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[10];
		Character[] vetB = new Character[10];

		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = (int) Math.round(Math.random() * 11);

			if (vetA[i] < 7) {
				vetB[i] = 'a';
			} else if (vetA[i] == 7) {
				vetB[i] = 'b';
			} else if (vetA[i] > 7 && vetA[i] < 10) {
				vetB[i] = 'c';
			} else if (vetA[i] == 10) {
				vetB[i] = 'd';
			} else if (vetA[i] > 10) {
				vetB[i] = 'e';
			}
		}

		System.out.println("a) Bi dever� receber 'a' quando Ai for menor que 7;"
				+ "\nb) Bi dever� receber 'b' quando Ai for igual a 7;"
				+ "\nc) Bi dever� receber 'c' quando Ai for maior que 7 e menor que 10;"
				+ "\nd) Bi dever� receber 'd' quando Ai for igual a 10;"
				+ "\ne) Bi dever� receber 'e' quando Ai for maior que 10.");

		System.out.print("\nVetor A: ");
		for (int a : vetA) {
			System.out.print(a + "  ");
		}

		System.out.print("\nVetor B: \"For tradicional\" ");
		for (int j = 0; j < vetB.length; j++) {
			System.out.print(vetB[j] + "  ");
		}

		System.out.print("\nVetor B: \"For bacan�o\" ");
		for (int b : vetB) {
			System.out.print(b + "  ");
		}
	}
}
