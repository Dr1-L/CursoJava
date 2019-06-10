/*29.Ler dois vetores A e B com 10 elementos cada. 
 * Construir um vetor C, sendo este a junção dos dois outros vetores. 
 * Os primeiros 10 elementos de C deverão receber os elementos de A e 
 * os últimos elementos C deverão receber os elementos de B. 
 * Desta forma, C deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

import sun.security.util.Length;

public class Exe29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[10];
		int[] vetB = new int[10];
		int[] vetC = new int[20];
		int indiceB = vetB.length-1;

		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = (int) Math.round(Math.random() * 10);
			vetB[i] = (int) Math.round(Math.random() * 30);
		}
		
		for(int i = 0; i < 10; i++) {
			vetC[i] = vetA[i];
		}
		
		for(int i = 0; i < vetB.length; i++) {
			vetC[i+10] = vetB[i];
		}
		
		System.out.print("\nVetor A: ");
		for (int a : vetA) {
			System.out.print(a + "  ");
		}
		System.out.print("\n\t\t\t\tVetor B: ");
		for (int b : vetB) {
			System.out.print(b + "  ");
		}
		System.out.print("\n\nVetor C: ");
		for (int c : vetC) {
			System.out.print(c + "  ");
		}
	}
}
