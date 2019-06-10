/*Faça um Programa que leia 2 números e em seguida pergunte ao usuário 
 * qual operação ele deseja realizar. 
 * O resultado da operação deve ser acompanhado de uma frase que diga 
 * se o número é:
    par ou ímpar;
    positivo ou negativo; */

package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe19 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Insira dois valores:");
    double numA = scan.nextDouble();
    double numB = scan.nextDouble();

    System.out.println("Qual operação deseja realizar? 1)Somar 2)Subtrair 3)Multiplicar 4)Dividir");
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
        System.out.println("Opção inválida.");
    }

    if (resultado % 2 == 0) {
      System.out.println("Par.");
    } else {
      System.out.println("Ímpar.");
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
