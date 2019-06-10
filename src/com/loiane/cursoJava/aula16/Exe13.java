//Faça um programa que peça dois números, base e expoente, 
//calcule e mostre o primeiro número elevado ao segundo número. 
//Não utilize a função de potência da linguagem. 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe13 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    float base = 0;
    float expoente = 0;
    float resultado = 0;
    int i = 1;

    System.out.print("Digite o valor da base:");
    base = scan.nextFloat();
    System.out.print("Digite um valor para o expoente:");
    expoente = scan.nextFloat();

    resultado = base;

    while (i < expoente) {
      resultado = resultado * base;
      i++;
    }
    System.out.println("Resultado: " + resultado);
  }
}
