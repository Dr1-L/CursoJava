/*17.Ler um vetor A com 10 elementos inteiros correspondentes as idades 
 * de um grupo de pessoas. 
 * Escreva um programa que determine e escreva a quantidade de pessoas 
 * que possuem idade superior a 35 anos. */
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe17 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vet = new int[10];
    int cont = 0;

    for (int i = 0; i < vet.length; i++) {
      System.out.print("Insira a idade: " + i + ": ");
      vet[i] = scan.nextInt();

      if (vet[i] > 35) {
        cont++;
      }
    }
    System.out.print("Total de adultos maiores de 35: " + cont);
  }
}
