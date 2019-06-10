package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe08 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Insira os valores dos produtos:");
    double itemUm = scan.nextDouble();
    double itemDois = scan.nextDouble();
    double itemTres = scan.nextDouble();

    if (itemUm < itemDois && itemUm < itemTres) {
      System.out.println("Compre o item 1. R$ " + itemUm);
    } else if (itemDois < itemUm && itemDois < itemTres) {
      System.out.println("Compre o item 2. R$ " + itemDois);
    } else if (itemTres < itemUm && itemTres < itemDois) {
      System.out.println("Compre o item 3. R$ " + itemTres);
    } else if (itemUm == itemDois || itemUm == itemTres || itemDois == itemTres) {
      System.out.println("Valores iguais.");
    }
  }

}
