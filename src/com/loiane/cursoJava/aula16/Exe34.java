//Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, 
//Faça um programa que calcule o valor de H com N termos. 
package com.loiane.cursoJava.aula16;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat();
    df.setMaximumFractionDigits(3);
    df.setMinimumFractionDigits(1);

		int num = 1;
		int n = 0;
		double soma = 0;
		double div = 0;

		System.out.print("Digite um valor para 'n': ");
		n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			div = (double) num / i;
			System.out.println(num + "/" + i + " + ");
			soma = (double) soma + div;
		}
		System.out.println("Soma = " + df.format(soma));
	}
}
