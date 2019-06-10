/*15.Criar um vetor A com 10 elementos inteiros. 
 * Desenvolver um programa que defina o percentual de elementos pares e ímpares, respectivamente, 
 * armazenados neste vetor.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe15 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vet = new int[10];
    int pares = 0;
    int impares = 0;
    double percent = 0;

    for (int i = 0; i < vet.length; i++) {
      System.out.print("Insira o valor para posição: " + i + ": ");
      vet[i] = scan.nextInt();

      if (vet[i] % 2 != 0) {
        impares ++;
      } else if (vet[i] % 2 == 0) {
        pares ++;
      }
    }
    
    percent = (impares*100)/vet.length;
    System.out.println(percent + "% de valores impares.");
    
    percent = (pares*100)/vet.length;
    System.out.println(percent + "% de valores são par.");
  }
}
