/*1. Escreva  uma  classe  chamada  Contador,  
 * que  tem  um  atributo  estático  que   é  
 * incrementado  sempre  que  a  classe  for  instanciada.  
 * Crie  métodos  para   zerar,  incrementar  e  
 * retornar  o  valor  do  contador.  
 * Desenvolva  um   programa  para  testar  essa  classe. */
package com.loiane.cursoJava.aula34;

public class Contador {

	private static int cont;

	public static int getCont() {
		return cont;
	}

	public static void setCont(int num) {
		cont = num;
	}

	public static void zerarCont() {
		cont = 0;
	}

	public static void incrementarCont() {
		cont++;
	}
}
