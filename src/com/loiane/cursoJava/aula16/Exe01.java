//Faça um programa que peça uma nota, entre zero e dez. 
//Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe01 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double num = 0;

    do {
      System.out.println("Insira uma nota entre 0 e 10");
      num = scan.nextDouble();

    } while (num < 0 || num > 10);
    System.out.println("Nota: " + num);
  }

}
