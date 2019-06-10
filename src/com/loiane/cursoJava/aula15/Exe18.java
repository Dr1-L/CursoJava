//Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão). 
package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe18 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite um numero inteiro para verificar se é Par ou Impar.");
    int numero = scan.nextInt();
    
    if (numero % 2 == 0) {
      System.out.println("Este número é par.");
    } else {
      System.out.println("Este número é impar.");
    }
  }

}
