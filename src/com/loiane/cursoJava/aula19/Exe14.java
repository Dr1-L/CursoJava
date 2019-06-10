/*14.Criar um vetor A com 10 elementos inteiros. 
 * Implementar um programa que defina e escreva a média aritmética simples 
 * dos elementos ímpares armazenados neste vetor.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe14 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[] vet = new int[10];
    int soma = 0;

    for (int i = 0; i < vet.length; i++) {
      System.out.print("Insira o valor: ");
      vet[i] = scan.nextInt();

      if (vet[i] % 2 != 0) {
        soma += vet[i];
      }
    }
    System.out.println("Soma dos impares: "+soma);
  }
}
