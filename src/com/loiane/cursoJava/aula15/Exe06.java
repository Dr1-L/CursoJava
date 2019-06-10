package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe06 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Insira três valores:");
    double numUm = scan.nextDouble();
    double numDois = scan.nextDouble();
    double numTres = scan.nextDouble();

    if (numUm > numDois && numUm > numTres) {
      System.out.println("Numero maior: " + numUm);
    } else if (numDois > numUm && numDois > numTres) {
      System.out.println("Numero maior: " + numDois);
    } else if (numTres > numUm && numTres > numDois) {
      System.out.println("Numero maior: " + numTres);
    } else {
      System.out.println("Valores iguais.");
    }
  }
}
