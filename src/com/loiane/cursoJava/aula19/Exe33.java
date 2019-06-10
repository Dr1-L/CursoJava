/*33.Criar um vetor A com 10 elementos inteiros. 
 * Escreva um programa que imprima cada elemento do vetor A e 
 * uma mensagem indicando se o respectivo elemento é um número primo ou não.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe33 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int[] vet = new int[10];
    boolean ehPrimo = true;

    System.out.println("Digite 10 valores inteiros: ");
    for (int i = 0; i < vet.length; i++) {
      vet[i] = scan.nextInt();
      //  vet[i] = (int) Math.round(Math.random()*10);
    }

    for (int v : vet) {
      System.out.print(v + "  ");
    }
    System.out.println("\n");

    for (int i = 0; i < vet.length; i++) {
      ehPrimo = true;
      for (int j = 2; j < vet[i]; j++) {
        if (vet[i] % j == 0) {
          ehPrimo = false;
          break;
        }
      }

      if (ehPrimo) {
        System.out.println(vet[i] + " é primo.");
      } else {
        System.out.println(vet[i] + " não é primo.");
      }
    }
  }
}
