package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe09 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite três números:");
      double valor1 = scan.nextDouble();
      double valor2 = scan.nextDouble();
      double valor3 = scan.nextDouble();
      double maior = 0;
      double menor = 0;

    if (valor1 > valor2 && valor1 > valor3) {
      maior = valor1;
    } else if (valor2 > valor1 && valor2 > valor3) {
      maior = valor2;
    } else if (valor3 > valor1 && valor3 > valor2) {
      maior = valor3;
    }
      System.out.println("Valor maior: " + maior);
    
    if (valor1 < valor2 && valor1 < valor3) {
      menor = valor1;
    } else if (valor2 < valor1 && valor2 < valor3) {
      menor = valor2;
    } else if (valor3 < valor1 && valor3 < valor2) {
      menor = valor3;
    }
      System.out.println("Valor menor:" + menor);
  }
}
