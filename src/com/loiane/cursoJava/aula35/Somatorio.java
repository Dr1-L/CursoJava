/*2. Escreva  um  m�todo  recursivo  e  est�tico  que  receba  um  n�mero  inteiro
 * positivo  N  e  calcule  o  somat�rio  dos  n�meros  de  1  a  N*/
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
