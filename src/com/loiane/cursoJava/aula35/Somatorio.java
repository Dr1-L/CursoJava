/*2. Escreva  um  método  recursivo  e  estático  que  receba  um  número  inteiro
 * positivo  N  e  calcule  o  somatório  dos  números  de  1  a  N*/
package com.loiane.cursoJava.aula35;

public class Somatorio {

  public static int fazSomatorio(int n) {
    if (n == 0) {
      return 0;
    }
    int somatorio = +n;
    return fazSomatorio(n - 1) + somatorio;
  }
}
