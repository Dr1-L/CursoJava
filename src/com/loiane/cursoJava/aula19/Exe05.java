//5. Criar um vetor A com 10 elementos inteiros. 
//Construir um vetor B de mesmo tipo e tamanho, 
//sendo que cada elemento do vetor B deverá ser o respectivo elemento de A 
//multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i.
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe05 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[] vetA = new int[5];
    int[] vetB = new int[5];

    for (int i = 0; i < vetA.length; i++) {
      System.out.println("Insira um vlaor inteiro para o vetor A");
      vetA[i] = scan.nextInt();
      //vetA[i] = i * 4;
      vetB[i] = vetA[i] * i;
    }

    for (int i = 0; i < vetA.length; i++) {
      System.out.println("B = " + vetA[i] + " * " + i + " = " + vetB[i]);
    }
  }
}
