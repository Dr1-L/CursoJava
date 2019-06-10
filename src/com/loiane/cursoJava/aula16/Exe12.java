/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro
 *entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. 
 *A saída deve ser conforme o exemplo abaixo:
    Tabuada de 5:
    5 X 1 = 5
    5 X 2 = 10
    ...
    5 X 10 = 50*/
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe12 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int numero = 0;
    int i = 0;

    System.out.print("Digite um numero inteiro para ver a tabuada: ");
    numero = scan.nextInt();

    System.out.println("Tabuado do: " + numero);

    for (i = 0; i <= 10; i++) {
      System.out.println(numero + "x" + i + " = " + numero * i);
    }
  }
}
