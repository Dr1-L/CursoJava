/*1. Escreva  um  método  recursivo  e  estático  que  calcule  e  retorne  o  N-­‐ésimo   
 * termo  da  sequência  Fibonacci.  
 * Alguns  números  desta  sequência  são:  0,  1,   1,  2,  3,  5,  8,  13,  21,  34,  55,  89... */
package com.loiane.cursoJava.aula35;

import java.util.Scanner;

public class TesteFibonacciRecursivo {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Imprimir a sequencia até o termo: ");
    int termo = scan.nextInt();
    for (int i = 0; i < termo; i++) {
      System.out.println(FibonacciRecursivo.fibonacci(i));
    }
  }
}
