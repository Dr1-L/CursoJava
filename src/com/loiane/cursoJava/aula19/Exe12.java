/*12.Criar um vetor A com 10 elementos inteiros. 
 * Implementar um programa que defina e escreva a soma de 
 * todos os elementos armazenados neste vetor.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe12 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vetA = new int[10];
    int soma = 0;

    for (int i = 0; i < vetA.length; i++) {
      System.out.print("Insira um valor inteiro: ");
      vetA[i] = scan.nextInt();
    }

    for (int i = 0; i < vetA.length; i++) {
      soma += vetA[i];
    }
    System.out.println("Total: " + soma);
  }
}
