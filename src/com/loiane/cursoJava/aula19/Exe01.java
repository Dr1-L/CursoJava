//Criar um vetor A com 5 elementos inteiros. 
//Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
package com.loiane.cursoJava.aula19;

public class Exe01 {

  public static void main(String[] args) {

    int[] vetorA = new int[5];
    int[] vetorB = new int[5];
    
    for(int i = 0; i < vetorA.length; i++) {
      vetorA[i] = 3*i;
      
      System.out.println("Vetor A recebe na posição ["+i+"] o valor "+vetorA[i]);
    }
    
    for(int i = 0; i < vetorA.length; i++) {
      vetorB[i] = vetorA[i];
    }
    System.out.println("Valor do vetor B");
    for(int vet : vetorB) {
      System.out.print(vet+" ");
    }
  }

}
