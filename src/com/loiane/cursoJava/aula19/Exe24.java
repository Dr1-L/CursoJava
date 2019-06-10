/*24.Números palíndromos são aqueles que escritos da direita para a esquerda
 *  têm o mesmo valor quando escritos da esquerda para a direita. 
 *  Exemplo: 545; 789987; 97379; 123454321; etc. 
 *  Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros 
 *  é um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao último, 
 *  se o segundo elemento do vetor é igual ao penúltimo e assim por diante até 
 *  verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		int ultPosicao = vetor.length - 1;
		int cont = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número inteiro: ");
			vetor[i] = scan.nextInt();
		}

		System.out.println("\nVetor digitado:");
		for (int vet : vetor) {
			System.out.print(vet + " ");
		}
		System.out.println("\n");
		/*
		 * for (int i = 0, j = ultPosicao; i < (vetor.length/2) ; i++, j--) { 
		 * //não usar 2 for pois precisa concluir o for de dentro para correr o de fora*
		 * for (int j = ultPosicao; j >= 0; j--) { if (vetor[i] == vetor[j]) {
		 * System.out.println("Valores iguais"); // } } }
		 */
		for (int i = 0; i < (vetor.length / 2); i++) {
			if (vetor[i] == vetor[ultPosicao - i]) {
				cont++;
			}
		}
		if (cont == (vetor.length / 2)) {
			System.out.println("Vetor palíndrico.");
		} else {
			System.out.println("Não é um vetor palíndrico.");
		}
	}
}
