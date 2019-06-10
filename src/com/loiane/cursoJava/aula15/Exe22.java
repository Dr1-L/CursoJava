/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
                          Até 5 Kg           Acima de 5 Kg
    Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
    Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
    Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
    receberá ainda um desconto de 10% sobre este total. 
    Escreva um algoritmo para ler a quantidade (em Kg) de morangos e 
    a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente. */
package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe22 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double pagMorango = 0;
    double pagMaca = 0;
    double totalAPagar = 0;

    System.out.println("Insira a quantia(KG) de Morango adquiridos:");
    double morangos = scan.nextDouble();

    System.out.println("Insira a quantia(KG) de Maçã adquiridas:");
    double macas = scan.nextDouble();

    double totalFrutas = morangos + macas;

    if (morangos <= 5) {
      pagMorango = morangos * 2.50;
    } else {
      pagMorango = morangos * 2.20;
    }

    if (macas <= 5) {
      pagMaca = macas * 1.80;
    } else {
      pagMaca = macas * 1.50;
    }

    totalAPagar = pagMaca + pagMorango;

    if (totalFrutas > 8 || totalAPagar > 25) {
      totalAPagar = totalAPagar - (totalAPagar * 0.1);
    }
    System.out.println("Total a pagar: R$ " + totalAPagar);
  }
}
