package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um dia da semana");
		int dia = scan.nextInt();

		switch (dia) {
		case 1:
			System.out.println("1-Domingo!");
			break;
		case 2:
			System.out.println("2-Segunda-feira!");
			break;
		case 3:
			System.out.println("3-Terça-feira!");
			break;
		case 4:
			System.out.println("4-Quarta-feira!");
			break;
		case 5:
			System.out.println("5-Quinta-feira!");
			break;
		case 6:
			System.out.println("6-Sexta-feira!");
			break;
		case 7:
			System.out.println("7-Sábado!");
			break;
		default:
			System.out.println("XX-Opão inválida!");
		}
	}
}
