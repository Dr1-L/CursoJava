/*1. Escreva  um  método  recursivo  e  estático  que  calcule  e  retorne  o  N-­‐ésimo   
 * termo  da  sequência  Fibonacci.  
 * Alguns  números  desta  sequência  são:  0,  1,   1,  2,  3,  5,  8,  13,  21,  34,  55,  89... */
package com.loiane.cursoJava.aula35;

public class FibonacciRecursivo {

  public static int fibonacci(int termo) {
    if (termo < 2) {
      return 1;
    }
    return fibonacci(termo - 1) + fibonacci(termo - 2);
  }
}
