package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu salário atual: ");
		double salarioAtual = scan.nextDouble();

		double salarioAumento = 0;
		double percentual = 0;
		double valorPercent = 0;

		if (salarioAtual <= 280.00) {
			salarioAumento = salarioAtual + (salarioAtual * 0.20);
			percentual = 20;
			valorPercent = (salarioAtual * 0.20);
		} else if (salarioAtual > 280 && salarioAtual < 700) {
			salarioAumento = salarioAtual + (salarioAtual * 0.15);
			percentual = 15;
			valorPercent = (salarioAtual * 0.15);
		} else if (salarioAtual > 700 && salarioAtual < 1500) {
			salarioAumento = salarioAtual + (salarioAtual * 0.10);
			percentual = 10;
			valorPercent = (salarioAtual * 0.1);
		} else if (salarioAtual > 1500) {
			salarioAumento = salarioAtual + (salarioAtual * 0.5);
			percentual = 5;
			valorPercent = (salarioAtual * 0.5);
		}
		System.out.println("Salário antes do reajuste: R$" + salarioAtual + " ." + "\nPercentual de aumento: " + percentual + " %."
						+ "\nValor de aumento: R$ " + valorPercent + "\nNovo salário: R$ " + salarioAumento);
	}
}
