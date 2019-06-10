package com.loiane.cursoJava.aula13;

import java.util.Scanner;

public class Exe07 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o lado do quadrado, em metros:");
    double lado = scan.nextDouble();

    double area = lado * lado;
    System.out.println("Area total: " + 2 * area);
  }

}
