//9.Criar dois vetores A e B cada um com 10 elementos inteiros. 
//Construir um vetor C, onde cada elemento de C é a divisão 
//dos respectivos elementos em A e B, ou seja: C[i] = A[i] / float(B[i]).
package com.loiane.cursoJava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe09 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();
    df.setMaximumFractionDigits(3);
    df.setMinimumFractionDigits(1);

    int[] vetA = new int[10];
    int[] vetB = new int[10];
    float[] vetC = new float[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Valor inteiro para a posição " + i + " do vetor A: ");
      vetA[i] = scan.nextInt();
    }

    System.out.println("\n");
    for (int i = 0; i < 10; i++) {
      System.out.print("Valor inteiro para a posição " + i + " do vetor B: ");
      vetB[i] = scan.nextInt();
    }

    for (int i = 0; i < 10; i++) {
      vetC[i] = vetA[i] / (float) vetB[i];
    }

    System.out.println("\nVetor C");
    for (double c : vetC) {
      System.out.print("[" + df.format(c) + "] ");
    }
  }
}
