/*37.Criar um vetor A com 15 elementos inteiros. 
 * Construir um vetor B de mesmo tamanho, sendo que 
 * cada elemento do vetor B seja o fatorial do elemento correspondente em A.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe37 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    int[] vetA = new int[4];
    int[] vetB = new int[4];
    int fat = 1;
    int soma = 0;
    
    for (int i = 0; i < vetA.length; i++) {
      System.out.println("Digite um valor inteiro: ");
      vetA[i] = scan.nextInt();
   //   vetA[i] = (int) Math.round(Math.random()*15);
    }
    
    for (int i = 0; i < vetA.length; i++) {
      fat = vetA[i];
      soma = 0;
      for (int j = 0; j < vetB.length; j++) {
        while(fat > 0) {
          soma += soma*fat;
          fat--;
        }
        vetB[j] = soma;
        
      }
    }
    
    for (int a : vetA) {
      System.out.print(a+" ");
    }
    
    for (int b : vetB) {
      System.out.print(b+" ");
    }
  }
}
