//7. Criar dois vetores A e B cada um com 10 elementos inteiros. 
//Construir um vetor C, onde cada elemento de C � a subtra��o 
//dos respectivos elementos em A e B, ou seja: C[i] = A[i] � B[i].
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe07 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[] vetA = new int[10];
    int[] vetB = new int[10];
    int[] vetC = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite um valor inteiro para a posi��o " + i + " do vetor A: ");
      vetA[i] = scan.nextInt();
    }
    /*for (int a : vetA) {
      System.out.print(a + " ");
    }*/
    
    System.out.println("\n");
    for (int i = 0; i < 10; i++) {
      System.out.print("Digite um valor inteiro para a posi��o " + i + " do vetor B: ");
      vetB[i] = scan.nextInt();
    }
    /*for (int b : vetB) {
      System.out.print(b + " ");
    }*/

    for (int i = 0; i < 10; i++) {
      vetC[i] = vetA[i] - vetB[i];
    }
    System.out.println("\nVetor C");
    for (int c : vetC) {
      System.out.print(c + " ");
    }
  }
}
