package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe07 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Insira três valores:");
    double numUm = scan.nextDouble();
    double numDois = scan.nextDouble();
    double numTres = scan.nextDouble();

    double maior = 0;
    double menor = 0;

    if (numUm > numDois && numUm > numTres) {
      maior = numUm;
    } else if (numDois > numUm && numDois > numTres) {
      maior = numDois;
    } else if (numTres > numUm && numTres > numDois) {
      maior = numTres;
    } else if (numUm == numDois || numUm == numTres || numDois == numTres) {
      System.out.println("Valores iguais.");
    }
    System.out.println("Valor maior: " + maior);

    if (numUm < numDois && numUm < numTres) {
      menor = numUm;
    } else if (numDois < numUm && numDois < numTres) {
      menor = numDois;
    } else if (numTres < numUm && numTres < numDois) {
      menor = numTres;
    }
    System.out.println("Valor menor: " + menor);
  }
}
