//3. Criar um vetor A com 15 elementos inteiros. 
//Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B 
//deverá ser o quadrado do respectivo elemento de A, ou seja: B[i] = A[i] * A[I].
package com.loiane.cursoJava.aula19;

public class Exe03 {

  public static void main(String[] args) {

    int[] vetA = new int[15];
    int[] vetB = new int[15];

    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = i;
      
      vetB[i] = (int) Math.pow(vetA[i], 2);
      //vetB[i] = (int) Math.pow(i, 2);
    }
    System.out.println("Vetor A: ");

    for (int vet : vetA) {
      System.out.print(vet + " ");
    }
    System.out.println("\n\nVetor B: ");
    for (int vet : vetB) {
      System.out.print(vet + " ");
    }
  }

}
