/*2. Escreva  um  m�todo  recursivo  e  est�tico  que  receba  um  n�mero  inteiro
 * positivo  N  e  calcule  o  somat�rio  dos  n�meros  de  1  a  N*/
package com.loiane.cursoJava.aula35;

import java.util.Scanner;

public class TesteSomatorio {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Calcular somat�rio de 1 at� ... ");
    int termo = scan.nextInt();
    System.out.println(Somatorio.fazSomatorio(termo));
  }
}
