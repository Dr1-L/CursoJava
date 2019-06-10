/*Escreva  uma  classe  para  representar  uma  lâmpada.  Desenvolva  métodos   para  ligar,  desligar  a  lampada.*/
package com.loiane.cursoJava.aula33;

import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Lampada lampada01 = new Lampada();
		char resp;

		System.out.println("#####################################");
		System.out.println("Deseja testar a lâmpada? s/n");
		resp = scan.next().charAt(0);
		while (resp != 's' && resp != 'n') {
			System.out.println("Opção inválida. Digite novamente.");
			resp = scan.next().charAt(0);
		}
		if (resp == 's') {
			lampada01.setStatus(false);
			//lampada01.desligarLampada();
			if (lampada01.verificarStatus()) {
				System.out.println("Lâmpada acesa!");
			} else {
				System.out.println("Lâmpada desligada.");
			}
			System.out.println("\nAcenda a lâmpada e verifique se esta funcionando. \n 1-Acender \t2-Deixar assim");
			resp = scan.next().charAt(0);
			while (resp != '1' && resp != '2') {
				System.out.println("Opção inválida. Digite novamente.");
				resp = scan.next().charAt(0);
			}
			if (resp == '1') {
				lampada01.setStatus(true);
				//lampada01.ligarLampada();
				if(lampada01.verificarStatus()){
					System.out.println("A lâmpada acendeu!");
				}
			} else {
				System.out.println("Ok.");
			}
		}
	}
}
