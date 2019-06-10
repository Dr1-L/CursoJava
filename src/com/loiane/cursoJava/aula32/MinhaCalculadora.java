package com.loiane.cursoJava.aula32;

public class MinhaCalculadora {
	//sobrecarga de metodos
	//precisa trocar o tipo de pelo menos 1 param
	public int soma(int num1, int num2) {
		return num1+num2;
	}
	
	public double soma(double num1, double num2) {
		return num1+num2;
	}
	
	public int soma(int[] vetorInteiros) {
		int total =0;
		for(int i=0; i<vetorInteiros.length; i++) {
			total += vetorInteiros[i];
		}
		return total;
	}
}
