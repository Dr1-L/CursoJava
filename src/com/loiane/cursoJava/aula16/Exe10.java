//Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros 
//que est�o no intervalo compreendido por eles. 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe10 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int numA = 0;
    int numB = 0;

    System.out.println("Digite dois n�meros inteiros:");
    numA = scan.nextInt();
    numB = scan.nextInt();

    if (numA > numB) {
      while (numB != numA) {
        numB++;
        System.out.print(numB + " ");
      }
    } else if (numB > numA) {
      while (numA != numB) {
        numA++;
        System.out.print(numA + " ");
      }
    }
  }
}
