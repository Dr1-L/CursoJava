/*18.Ler um vetor A com 10 elementos inteiros correspondentes as idades de 
 * um grupo de pessoas. Escreva um programa que determine e escreva a menor 
 * e a maior idades e suas respectivas posições.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe18 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vet = new int[4];
    int maior = 0;
    int menor = 0;

    for (int i = 0; i < vet.length; i++) {
      System.out.print("Insira a idade: " + i + ": ");
      vet[i] = scan.nextInt();

      if (i == 0) {
        maior = vet[i];
        menor = vet[i];
      }
    }
    for (int j = 0; j < vet.length; j++) {
      if (vet[j] <= menor) {
        menor = vet[j];

      } else if (vet[j] >= maior) {
        maior = vet[j];
      }
    }
    System.out.print("\nMaior idade lançada: " + maior);
    System.out.println("\nMenor idade lançada: " + menor);
  }
}
