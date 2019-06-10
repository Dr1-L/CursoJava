/*20.Implementar um programa que obtenha a cota��o do d�lar (U$) em rela��o ao real (R$) 
 * e a seguir armazene em vetor A com 20 elementos as seguintes convers�es: 
 * 
 * 21.A[i] = cota��o do dolar * i, para todo i variando de 1 at� 20.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe20 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double cotacao = 0;
    double[] vetorA = new double[20];

    System.out.print("Insira a cota��o do D�lar: U$ ");
    cotacao = scan.nextDouble();

    for (int i = 1; i < vetorA.length; i++) {
      vetorA[i] = cotacao * i;
    }

    System.out.println("");
    for (double v : vetorA) {
      System.out.println(v);
    }
  }
}
