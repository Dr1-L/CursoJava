//A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... 
//Faça um programa capaz de gerar a série até o n−ésimo termo.
package com.loiane.cursoJava.aula16;

public class Exe15 {

	public static void main(String[] args) {

		int numeroA = 1;
		int numeroB = 0;

		System.out.println(numeroB);

		while (numeroA > 0) {
			numeroA = numeroA + numeroB;
			numeroB = numeroA - numeroB;
			System.out.println(numeroB);
		}
	}
}
