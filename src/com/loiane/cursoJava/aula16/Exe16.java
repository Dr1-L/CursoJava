//A s�rie de Fibonacci � formada pela seq��ncia 0,1,1,2,3,5,8,13,21,34,55,... 
//Fa�a um programa que gere a s�rie at� que o valor seja maior que 500.
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
