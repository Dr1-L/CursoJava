//Altere o programa anterior para mostrar no final a soma dos números. 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe11 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int numA = 0;
    int numB = 0;
    int soma = 0;

    System.out.println("Digite dois números inteiros:");
    numA = scan.nextInt();
    numB = scan.nextInt();

    if (numA > numB) {
      while (numB != numA) {
        numB++;
        System.out.print(numB + " ");
        soma = soma + numB;
      }

      System.out.println("Soma: " + soma);

    } else if (numB > numA) {
      while (numA < numB) {
        numA++;
        System.out.print(numA + " ");
        soma = soma + numA;
      }
      System.out.println("\nSoma: " + soma);
    }

  }

}
