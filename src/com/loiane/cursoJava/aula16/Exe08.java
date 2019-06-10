//Faça um programa que leia 5 números e informe a soma e a média dos números. 
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
    System.out.println("Média: " + media);
  }

}
