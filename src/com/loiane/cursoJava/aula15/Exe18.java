//Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � par ou impar. Dica: utilize o operador m�dulo (resto da divis�o). 
package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe18 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite um numero inteiro para verificar se � Par ou Impar.");
    int numero = scan.nextInt();
    
    if (numero % 2 == 0) {
      System.out.println("Este n�mero � par.");
    } else {
      System.out.println("Este n�mero � impar.");
    }
  }

}
