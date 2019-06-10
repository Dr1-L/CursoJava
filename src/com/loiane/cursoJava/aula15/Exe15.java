/*Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. 
 * O programa dever� informar se os valores podem ser um tri�ngulo. 
 * Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
    Dicas:
    Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
    Tri�ngulo Equil�tero: tr�s lados iguais;
    Tri�ngulo Is�sceles: quaisquer dois lados iguais;
    Tri�ngulo Escaleno: tr�s lados diferentes; */
package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o valor dos lados do Tri�ngulo:");
		double ladoA = scan.nextDouble();
		double ladoB = scan.nextDouble();
		double ladoC = scan.nextDouble();

		if (ladoA > 0 && ladoB > 0 && ladoC > 0) {
			if (ladoA + ladoB >= ladoC || ladoB + ladoC >= ladoA || ladoC + ladoA >= ladoB) {
				if (ladoA == ladoB && ladoB == ladoC) {
					System.out.println("Este � um Triangulo Equilatero.");
				} else if (ladoA == ladoB || ladoB == ladoC) {
					System.out.println("Este � um Triangulo Is�sceles.");
				} else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
					System.out.println("Este � um Triangulo Escaleno.");
				}
			} else {
				System.out.println("Este n�o � um Tri�ngulo.");
			}
		} else {
			System.out.println("Lado n�o pode ser igual a zero.");
		}
	}
}
