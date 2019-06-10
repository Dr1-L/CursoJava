/*Desenvolva um programa que fa�a a tabuada de um n�mero qualquer inteiro que ser� digitado pelo usu�rio, 
 * mas a tabuada n�o deve necessariamente iniciar em 1 e terminar em 10, 
 * o valor inicial e final devem ser informados tamb�m pelo usu�rio, conforme exemplo abaixo:

    Montar a tabuada de: 5
    Come�ar por: 4
    Terminar em: 7

    Vou montar a tabuada de 5 come�ando em 4 e terminando em 7:
    5 X 4 = 20
    5 X 5 = 25
    5 X 6 = 30
    5 X 7 = 35

    Obs: Voc� deve verificar se o usu�rio n�o digitou o final menor que o inicial. */
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int termina = 0;
		boolean teste = true;
		int i = 0;

		System.out.print("Montar a tabuada de: ");
		int valor = scan.nextInt();

		System.out.print("Come�ar por: ");
		int comeca = scan.nextInt();

		do {
			System.out.print("Terminar em: ");
			termina = scan.nextInt();
			teste = true;

			if (termina <= comeca) {
				System.out.println("Valor inv�lido.");
				teste = false;
			}
		} while (!teste);

		System.out.println(
				"Vou come�ar a tabuada de " + valor + " iniciando em " + comeca + " e terminando em " + termina);
		for (i = comeca; i <= termina; i++) {
			System.out.println(valor + "*" + i + " = " + valor * i);
		}
	}
}
