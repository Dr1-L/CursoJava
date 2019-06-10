package com.loiane.cursoJava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	// construtor vazio
	Carro() {
		System.out.println("Classe carro foi instanciada.");
	}

	Carro(String marca_, int numPassageiros_) {
		marca = marca_;
		numPassageiros = numPassageiros_;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km.");
	}

	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado");
		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}
}
