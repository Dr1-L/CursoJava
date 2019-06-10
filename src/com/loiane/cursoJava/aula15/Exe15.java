/*Faça um Programa que peça os 3 lados de um triângulo. 
 * O programa deverá informar se os valores podem ser um triângulo. 
 * Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
    Dicas:
    Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
    Triângulo Equilátero: três lados iguais;
    Triângulo Isósceles: quaisquer dois lados iguais;
    Triângulo Escaleno: três lados diferentes; */
package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o valor dos lados do Triângulo:");
		double ladoA = scan.nextDouble();
		double ladoB = scan.nextDouble();
		double ladoC = scan.nextDouble();

		if (ladoA > 0 && ladoB > 0 && ladoC > 0) {
			if (ladoA + ladoB >= ladoC || ladoB + ladoC >= ladoA || ladoC + ladoA >= ladoB) {
				if (ladoA == ladoB && ladoB == ladoC) {
					System.out.println("Este é um Triangulo Equilatero.");
				} else if (ladoA == ladoB || ladoB == ladoC) {
					System.out.println("Este é um Triangulo Isósceles.");
				} else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
					System.out.println("Este é um Triangulo Escaleno.");
				}
			} else {
				System.out.println("Este não é um Triângulo.");
			}
		} else {
			System.out.println("Lado não pode ser igual a zero.");
		}
	}
}
