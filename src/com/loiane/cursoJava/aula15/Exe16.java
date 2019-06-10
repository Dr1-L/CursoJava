/*Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. 
 * O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
    Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
    Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
    Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
    Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário; */

package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor para 'a':");
		int a = scan.nextInt();

		if (a == 0) {
			System.out.println("Esta equação não é de 2º grau.");
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
				System.out.println("Esta equação não possui raizes reais.");
			} else if (delta == 0) {
				System.out.println("Esta equação possui apenas 1 raiz: " + delta);
			} else {
				b = b * -1;
				double xLinha = (b + Math.sqrt(delta)) / (2 * a);
				double xDLinha = (b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Esta equação possui 2 raizes reais: x': " + xLinha + " x\": " + xDLinha);
			}
		}
	}
}
