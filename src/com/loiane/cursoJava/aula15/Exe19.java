/*Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao usu�rio 
 * qual opera��o ele deseja realizar. 
 * O resultado da opera��o deve ser acompanhado de uma frase que diga 
 * se o n�mero �:
    par ou �mpar;
    positivo ou negativo; */

package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe19 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Insira dois valores:");
    double numA = scan.nextDouble();
    double numB = scan.nextDouble();

    System.out.println("Qual opera��o deseja realizar? 1)Somar 2)Subtrair 3)Multiplicar 4)Dividir");
    int opcao = scan.nextInt();

    double resultado = 0;

    switch (opcao) {
      case 1:
        resultado = (numA + numB);
        System.out.println("Somar: " + numA + " + " + numB + " = " + resultado);
        break;
      case 2:
        resultado = (numA - numB);
        System.out.println("Subtrair: " + numA + "-" + numB + " = " + resultado);
        break;
      case 3:
        resultado = (numA * numB);
        System.out.println("Multiplicar: " + numA + " * " + numB + " = " + resultado);
        break;
      case 4:
        resultado = (numA / numB);
        System.out.println("Dividir: " + numA + " \\ " + numB + " = " + resultado);
        break;
      default:
        System.out.println("Op��o inv�lida.");
    }

    if (resultado % 2 == 0) {
      System.out.println("Par.");
    } else {
      System.out.println("�mpar.");
    }

    if (resultado > 0) {
      System.out.println("Positivo.");
    } else if (resultado < 0) {
      System.out.println("Negativo.");
    } else {
      System.out.println("Resultado neutro.");
    }

  }

}
