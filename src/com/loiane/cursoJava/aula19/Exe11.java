//11.Criar um vetor A com 10 elementos inteiros. 
//Implementar um programa que defina e escreva a quantidade de 
//elementos armazenados neste vetor que são pares.
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe11 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[] vetA = new int[10];

    for (int i = 0; i < vetA.length; i++) {
      System.out.print("Insira um valor inteiro:");
      vetA[i] = scan.nextInt();
    }

    for (int i = 0; i < vetA.length; i++) {
      if (vetA[i] % 2 == 0) {
        System.out.println("Número par (" + vetA[i] + ") na posição: " + i);
      }
    }
  }
}
