/*32.Criar um vetor A com 5 elementos inteiros. 
 * Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[5];

		for (int i = 0; i < vetA.length; i++) {
			System.out.print("Insira um valor inteiro [" + i + "]: ");
			vetA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetA.length; i++) {
			System.out.println("\nTabuado do: " + vetA[i]);
			for (int tab = 0; tab <= 10; tab++) {
				System.out.println(vetA[i] + " * " + tab + " = " + vetA[i] * tab);
			}
		}
	}
}