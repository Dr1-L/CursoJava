//Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros. 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe08 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int numEntrada;
    int soma = 0;
    int media = 0;
    int cont = 0;

    do {
      System.out.print("Insira um numero: ");
      numEntrada = scan.nextInt();
      cont++;
      soma = soma + numEntrada;

    } while (cont < 5);
    media = soma / cont;
    System.out.println("Soma: " + soma);
    System.out.println("M�dia: " + media);
  }

}
