//Faça um programa que calcule o número médio de alunos por turma. 
//Para isto, peça a quantidade de turmas e 
//a quantidade de alunos para cada turma. 
//As turmas não podem ter mais de 40 alunos. 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = 0;
		int total = 0;
		int media = 0;

		System.out.print("Digite a quantidade de turmas: ");
		int turmas = scan.nextInt();

		for (i = 1; i <= turmas; i++) {
			System.out.print("Quantidade de alunos da turma " + i + ": ");
			int alunos = scan.nextInt();
			total = total + alunos;

			if (alunos > 40) {
				System.out.println("Valor inválido. Digite novamente.");
				i--;
				total = total - alunos;
			}
		}
		media = total / turmas;
		System.out.println("Média de alunos por turma: " + media);
	}
}
