//Fa�a um programa que mostre os n termos da S�rie a seguir: 
//S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 
package com.loiane.cursoJava.aula16;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe33 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    DecimalFormat df = new DecimalFormat();
    df.setMaximumFractionDigits(3);
    df.setMinimumFractionDigits(1);

		int n1 = 1;
		int n2 = 1;
		double soma = 0;
		double div = 0;

		System.out.print("Imprimir at� o termo: ");
		int termo = scan.nextInt();

		while (n1 <= termo) {
			div = (double) n1 / n2;
			System.out.print(n1 + "/" + n2 + " + ");
			soma = (double) soma + div;
			n1++;
			n2 = n2 + 2;
		}
		System.out.println("\nSoma da s�rie = " + df.format(soma));
	}
}
