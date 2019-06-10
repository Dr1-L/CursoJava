/*Fa�a um programa que calcule o fatorial de um n�mero inteiro 
 * fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120. 
 * A sa�da deve ser conforme o exemplo abaixo:
    Fatorial de: 5 
    5! =  5 . 4 . 3 . 2 . 1 = 120*/
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int fat = 1;
		
		System.out.print("Fatorial de: ");
		int num = scan.nextInt();
		
		System.out.print(num+"! = ");

		for(int i = num; i>0 ; i--) {
			fat = fat*i;
			System.out.print(i + " * ");
		}
		System.out.print(": "+fat);
	}

}
