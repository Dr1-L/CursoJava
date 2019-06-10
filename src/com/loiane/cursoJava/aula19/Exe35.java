/*35.Criar um vetor A com 10 elementos inteiros. 
 * Escreva um programa que imprima cada elemento do vetor A e 
 * a relação de todos os divisores do respectivo elemento.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe35 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int[] vet = new int[10];

    System.out.print("Insira 10 valores inteiros: ");
    for (int i = 0; i < vet.length; i++) {
      vet[i] = scan.nextInt();
    }

    for (int i = 1; i < vet.length; i++) {
      for (int j = 1; j < vet[i]; j++) {
        if (vet[i] % j == 0) {
          System.out.println("Divisores do numero " + vet[i] + " = " + j);
        }
      }
    }
    
  }
}
