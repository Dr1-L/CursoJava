/*16.Criar um vetor A com 10 elementos inteiros. 
 * Escrever um programa que calcule e escreva: 
 * a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
 * b) a quantidade de elementos armazenados no vetor que são iguais a 15; 
 * c) a média dos elementos armazenados no vetor que são superiores a 15.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe16 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vet = new int[10];
    int somaMenor15 = 0;
    int qtdIgual15 = 0;
    int mediaMaior15 = 0;
    int j = 0;

    for (int i = 0; i < vet.length; i++) {
      System.out.print("Insira o valor para posição: " + i + ": ");
      vet[i] = scan.nextInt();

      if (vet[i] < 15) {
        somaMenor15 += vet[i];
      } else if (vet[i] == 15) {
        qtdIgual15++;
      } else {
        j++;
        mediaMaior15 += mediaMaior15 / j;
      }
    }
    System.out.print("a) a soma de elementos armazenados neste vetor que são inferiores a 15: " + somaMenor15);
    System.out.print("\nb) a quantidade de elementos armazenados no vetor que são iguais a 15: " + qtdIgual15);
    System.out.print("\nc) a média dos elementos armazenados no vetor que são superiores a 15: " + mediaMaior15);
  }
}
