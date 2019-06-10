package com.loiane.cursoJava.aula13;

import java.util.Scanner;

public class Exe03 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int num1;
    int num2;
    int resultado;

    System.out.println("Informe dois numeros para realizar a soma:");
    num1 = scan.nextInt();
    num2 = scan.nextInt();

    resultado = num1 + num2;

    System.out.println("A soma dos numeros é = " + resultado);
  }

}
