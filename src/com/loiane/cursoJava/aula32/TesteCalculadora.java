package com.loiane.cursoJava.aula32;

public class TesteCalculadora {

	public static void main(String[] args) {

		MinhaCalculadora calc = new MinhaCalculadora();
		
		calc.soma(1, 2);
		calc.soma(1.2, 5.2);
		//sobrecarga
		//mesmo nome, porem a assinatura é diferente
		//qtd de param, tipo de pram e tipo de retorno
	}
}
