/*Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, na forma ax2 + bx + c. 
 * O programa dever� pedir os valores de a, b e c e fazer as consist�ncias, informando ao usu�rio nas seguintes situa��es:
    Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do segundo grau e o programa n�o deve fazer pedir os demais valores, sendo encerrado;
    Se o delta calculado for negativo, a equa��o n�o possui raizes reais. Informe ao usu�rio e encerre o programa;
    Se o delta calculado for igual a zero a equa��o possui apenas uma raiz real; informe-a ao usu�rio;
    Se o delta for positivo, a equa��o possui duas raiz reais; informe-as ao usu�rio; */

package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor para 'a':");
		int a = scan.nextInt();

		if (a == 0) {
			System.out.println("Esta equa��o n�o � de 2� grau.");
		} else {
			System.out.println("Informe valor para 'b':");
				int b = scan.nextInt();
			System.out.println("Informe um valor para 'c':");
				int c = scan.nextInt();
			// erro: double
			// int delta = (int) Math.sqrt(Math.pow(b, 2) - (4 * a *c));
			int delta = (int) (Math.pow(b, 2) - (4 * a * c));
			// delta = (int) Math.sqrt(delta);
			if (delta < 0) {
				System.out.println("Esta equa��o n�o possui raizes reais.");
			} else if (delta == 0) {
				System.out.println("Esta equa��o possui apenas 1 raiz: " + delta);
			} else {
				b = b * -1;
				double xLinha = (b + Math.sqrt(delta)) / (2 * a);
				double xDLinha = (b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Esta equa��o possui 2 raizes reais: x': " + xLinha + " x\": " + xDLinha);
			}
		}
	}
}
