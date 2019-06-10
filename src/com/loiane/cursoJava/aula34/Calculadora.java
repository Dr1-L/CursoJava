/*. Escreva  uma  classe  Calculadora  que  tenha  os  seguintes  métodos:  
 * somar,   subtrair,  multiplicar,  dividir  (dois  números),  
 * elevar  à  potência  n.   Desenvolva  um  programa  para  testar  essa  classe.*/
package com.loiane.cursoJava.aula34;

public class Calculadora {

  // private static int numA;
  // private static int numB;
  private static double result;

  public static double somar(double a, double b) {
    result = a + b;
    return result;
  }

  public static double subtrair(double a, double b) {
    result = a - b;
    return result;
  }

  public static double multiplicar(double a, double b) {
    result = a * b;
    return result;
  }

  public static double dividir(double a, double b) {
    result = a / b;
    return result;
  }

  public static double potencia(double a, int pot) {
    return Math.pow(a, pot);
  }

  public static int calcFatorial(double num) {
    if(num == 0) {
      return 1;
    }
    
    int fat = 1;
    int numInt = (int) num;
    for (int i = numInt; i > 0; i--) {
      fat *= i;
    }
    return fat;
  }
}
