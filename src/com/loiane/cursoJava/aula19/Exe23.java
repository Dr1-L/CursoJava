/*23.Criar um vetor A com 10 elementos inteiros. 
 * Desenvolver um programa que verifique se "todos" os elementos do vetor A são pares. 
 * Se pelo menos um elemento do vetor não for par o processo de repetição para 
 * percorrer os elementos do vetor deve ser encerrado, como sugestão: 
 * utilize uma variável do tipo flag para atingir este propósito.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe23 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[] vetorA = new int[10];
    boolean flag = true;

    for (int i = 0; i < vetorA.length; i++) {
      System.out.print(i + "- Insira o valor: ");
      vetorA[i] = scan.nextInt();
      //validando a entrada
      /*if (vetorA[i] % 2 != 0) {
        flag = false;
        break;
      }*/
    }
    System.out.println("Percorrendo o vetor...");
    do {
      for (int i = 0; i < vetorA.length; i++) {
        if (vetorA[i] % 2 != 0) {
          flag = false;
          System.out.println("\nVocê digitou um numero impar na posição " + i);
          break;
        }
        System.out.print(vetorA[i] + "... ");
      }
    } while (flag);
  }
}
