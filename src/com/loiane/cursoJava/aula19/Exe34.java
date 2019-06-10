/*33.Criar um vetor A com 10 elementos inteiros. 
 * Escreva um programa que imprima cada elemento do vetor A e 
 * uma mensagem indicando se o respectivo elemento é um número primo ou não.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe34 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int[] vet = new int[5];
    boolean ehPrimo;

    for (int i = 0; i < vet.length; i++) {
      System.out.println("Digite um valor inteiro para a posição: " + i);
      vet[i] = scan.nextInt();
    }

    for (int i = 0; i < vet.length; i++) {
      ehPrimo = true;
      for (int j = 2; j < vet[i]; j++) {
        if (vet[i] % j == 0) {
          ehPrimo = false;
          break;
        }
      }
      //	    if(ehPrimo && vet[i] == 1) {
      //        System.out.println(vet[i]+"não é primo.");
      //      }
      if (ehPrimo) {
        System.out.println(vet[i] + " é primo.");
      } else {
        System.out.println(vet[i] + " nãe é primo.");
      }
    }
  }
}
