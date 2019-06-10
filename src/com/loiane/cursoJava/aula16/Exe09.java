//Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50. 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe09 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Impares:");
    for (int i = 0; i <= 50; i++) {
      if (i % 2 != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
