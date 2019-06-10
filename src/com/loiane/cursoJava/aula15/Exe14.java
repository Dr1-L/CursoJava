//Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, 
//e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
//      Média de Aproveitamento  Conceito
//      Entre 9.0 e 10.0        A
//      Entre 7.5 e 9.0         B
//      Entre 6.0 e 7.5         C
//      Entre 4.0 e 6.0         D
//      Entre 4.0 e zero        E
//
//    O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e 
//	a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E. 

package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira duas notas parciais do aluno:");
		double notaUm = scan.nextDouble();
		double notaDois = scan.nextDouble();

		double media = (notaUm + notaDois) / 2;
		// inicializar variaveis????
		String conceito = null;
		String mensagem = null;

		if (media > 9 && media <= 10) {
			conceito = "A";
			mensagem = "Aprovado!";
		} else if (media > 7.5 && media <= 9.0) {
			conceito = "B";
			mensagem = "Aprovado!";
		} else if (media > 6.0 && media <= 7.5) {
			conceito = "C";
			mensagem = "Aprovado!";
		} else if (media > 4 && media <= 6.0) {
			conceito = "D";
			mensagem = "Reprovado!";
		} else if (media >= 0 && media <= 4) {
			conceito = "E";
			mensagem = "Reprovado!";
		}
		System.out.println("Nota 1: " + notaUm + "   Nota 2: " + notaDois);
		System.out.println("Média: " + media + ".\nConceito: " + conceito + ". \nAluno " + mensagem);
	}
}
