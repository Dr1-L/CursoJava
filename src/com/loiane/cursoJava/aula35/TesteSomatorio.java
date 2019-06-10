/*2. Escreva  um  método  recursivo  e  estático  que  receba  um  número  inteiro
 * positivo  N  e  calcule  o  somatório  dos  números  de  1  a  N*/
package com.loiane.cursoJava.aula35;

import java.util.Scanner;

public class TesteSomatorio {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Calcular somatório de 1 até ... ");
    int termo = scan.nextInt();
    System.out.println(Somatorio.fazSomatorio(termo));
  }
}
