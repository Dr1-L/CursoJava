/*Um funcion�rio de uma empresa recebe aumento salarial anualmente: 
 * Sabe-se que:
    Esse funcion�rio foi contratado em 1995, com sal�rio inicial de R$ 1.000,00;
    Em 1996 recebeu aumento de 1,5% sobre seu sal�rio inicial;
    A partir de 1997 (inclusive), os aumentos salariais sempre correspondem
    ao dobro do percentual do ano anterior. 
    Fa�a um programa que determine o sal�rio atual desse funcion�rio. 
    Ap�s concluir isto, altere o programa permitindo que o usu�rio digite 
    o sal�rio inicial do funcion�rio. */
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double salario = 1000;
		double percentual = 1.5;

		// salario += (salario * percentual)/100;
		salario += (salario / 100) * percentual;

		for (int i = 1997; i <= 2019; i++) {
			percentual = percentual + (percentual * 2);
			salario += (salario / 100) * percentual;
			// salario = salario + ((salario*percentual)/100);
			System.out.println("Sal�rio em " + i + ": R$ " + salario);
		}
	}
}
