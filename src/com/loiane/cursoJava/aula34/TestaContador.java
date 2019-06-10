/*1. Escreva  uma  classe  chamada  Contador, 
 * que  tem  um  atributo  estático  que   é  incrementado  sempre  
 * que  a  classe  for  instanciada.  
 * Crie  métodos  para   zerar,  incrementar  e  retornar  o  
 * valor  do  contador.  Desenvolva  um   programa  para  testar  essa  classe. */
package com.loiane.cursoJava.aula34;

public class TestaContador {

	static void imprimirValor() {
		System.out.println(Contador.getCont());
	}

	public static void main(String[] args) {

		imprimirValor();
		System.out.println("Incrementando...");
		Contador.incrementarCont();

		imprimirValor();
		System.out.println("Incrementando...");
		Contador.incrementarCont();

		imprimirValor();
		System.out.println("Zerando...");
		Contador.zerarCont();
		imprimirValor();
		
		Contador.incrementarCont();
		
		//atributo estatico compartilha o valor com todas
		//as suas instancia, mesmo criando um novo obj
		//mantem o valor do incremento
		Contador contad = new Contador();
		//n
		imprimirValor();
	}
}
