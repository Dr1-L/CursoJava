//A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... 
//Faça um programa que gere a série até que o valor seja maior que 500.
package com.loiane.cursoJava.aula16;

public class Exe16 {

	public static void main(String[] args) {

		int numeroA = 1;
		int numeroB = 0;

		System.out.println(numeroB);

		while (numeroB <= 500) {
			numeroA = numeroA + numeroB;
			numeroB = numeroA - numeroB;
			System.out.println(numeroB);
		}
	}
}
