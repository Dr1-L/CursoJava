//Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre a quantidade de 
//n�meros pares e a quantidade de n�meros impares. 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe14 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero = 0;
    int contPar = 0;
    int contImpar = 0;

    for (int i = 0; i < 10; i++) {
      System.out.print("Insira um numero inteiro: ");
      numero = scan.nextInt();
      //testar apenas com 1
      if (numero % 2 == 0) {
        contPar++;
      } else if (numero % 2 !=0 ){
        contImpar++;
      }
    }
    System.out.println("Total de numeros pares: " + contImpar);
    System.out.println("Total de numeros impares: " + contImpar);
  }
}
