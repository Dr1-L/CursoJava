/*13.Criar um vetor A com 10 elementos inteiros. 
 * Implementar um programa que determine a soma dos elementos 
 * armazenados neste vetor que são múltiplos de 5.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe13 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int soma = 0;
    int[] vetA = new int[10];

    for (int i = 0; i < vetA.length; i++) {
      System.out.print("Insira um valor inteiro para o vetor A: ");
      vetA[i] = scan.nextInt();
      if (vetA[i] % 5 == 0) {
        soma += vetA[i];
      }
    }
    System.out.println("Soma dos multiplos de cinco: " + soma);
  }
}
