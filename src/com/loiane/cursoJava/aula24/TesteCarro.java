package com.loiane.cursoJava.aula24;

public class TesteCarro {

  public static void main(String[] args) {

    Carro van = new Carro();
    van.marca = "Fiat";
    van.modelo = "Ducato";
    van.numPassageiros = 10;
    van.capCombustivel = 100;
    van.consumoCombustivel = 0.2;

    //System.out.println(van); Imprime o endere�o de mem�ria
    System.out.println(van.marca);
    System.out.println(van.modelo);
  }
}
