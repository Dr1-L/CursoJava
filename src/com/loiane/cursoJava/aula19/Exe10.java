//10.Criar um vetor A com 10 elementos inteiros. 
//Construir um vetor B de mesmo tipo e tamanho, sendo que 
//cada elemento do vetor B deverá ser o resto da divisão 
//do respectivo elemento de A por 2 (dois), ou seja: B[i] := A[i] % 2. 
package com.loiane.cursoJava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe10 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();
    df.setMaximumFractionDigits(3);
    df.setMinimumFractionDigits(1);

    int[] vetA = new int[10];
    int[] vetB = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Valor inteiro para a posição " + i + " do vetor A: ");
      vetA[i] = scan.nextInt();
    }

    System.out.println("\n");
    for (int i = 0; i < vetA.length; i++) {
      vetB[i] = vetA[i] % 2;
    }
    System.out.println("Vetor B:");
    for (int vet : vetB) {
      System.out.println(vet);
    }
  }
}
