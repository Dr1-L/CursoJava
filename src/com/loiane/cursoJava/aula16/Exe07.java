//Fa�a um programa que leia 5 n�meros e informe o maior n�mero.
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe07 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int maior = 0;
    int cont = 1;

    do {
      System.out.println("Digite um n�mero:");
      int numA = scan.nextInt();
      cont++;

      if (numA > maior) {
        maior = numA;
      }
    } while (cont <= 5);

    System.out.println("Maior valor digitado: " + maior);
  }
}
