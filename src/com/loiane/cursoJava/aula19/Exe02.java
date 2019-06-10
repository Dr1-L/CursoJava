//2. Criar um vetor A com 8 elementos inteiros. 
//Construir um vetor B de mesmo tipo e tamanho e com os elementos do vetor A 
//multiplicados por 2, ou seja: B[i] = A[i] * 2.
package com.loiane.cursoJava.aula19;

public class Exe02 {

  public static void main(String[] args) {

    int[] A = new int[8];
    int[] B = new int[8];

    for (int i = 0; i < A.length; i++) {
      A[i] = i;
      B[i] = A[i] * 2;
    }
    System.out.println("Vetor A");
    for (int a : A) {
      System.out.print(a + " ");
    }
    System.out.println("\nVetor B");
    for (int b : B) {
      System.out.print(b + " ");
    }
  }
}
