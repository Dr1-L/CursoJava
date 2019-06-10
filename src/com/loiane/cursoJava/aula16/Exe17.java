//Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Insira um n�mero inteiro para calcular seu fatorial: ");
		int numero = scan.nextInt();

		int cont = numero;
		int fatorial = 1;

		while (cont > 0) {
			fatorial = fatorial * cont;
			cont--;
		}

		System.out.println("Fatorial de " + numero + " = " + fatorial);
	}

}
