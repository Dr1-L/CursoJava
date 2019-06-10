//6. Criar dois vetores A e B cada um com 10 elementos inteiros. 
//Construir um vetor C, onde cada elemento de C é a soma dos respectivos elementos em A e B, 
//ou seja: C[i] = A[i] + B[i].
package com.loiane.cursoJava.aula19;

public class Exe06 {

  public static void main(String[] args) {

    int[] vetA = new int[10];
    int[] vetB = new int[10];
    int[] vetC = new int[10];

    for (int i = 0; i < 10; i++) {
      vetA[i] = i;
      vetB[i] = i * 10;

      vetC[i] = vetA[i] + vetB[i];
    }
    /* for(int i = 0; i<10; i++) {
    System.out.print("\nVetor B: "+ vetB[i]);
    System.out.print("\nVetos C: "+vetC[i]);
    }*/

    System.out.print("\tVetor A: \n");
    for (int a : vetA) {
      System.out.print(a + " ");
    }
    System.out.print("\n\tVetor B: \n");
    for (int b : vetB) {
      System.out.print(b + " ");
    }
    System.out.print("\n\tVetor C: \n");
    for (int c : vetC) {
      System.out.print(c + " ");
    }
  }

}
