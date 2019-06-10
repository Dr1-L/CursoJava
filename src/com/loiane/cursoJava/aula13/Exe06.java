package com.loiane.cursoJava.aula13;

import java.util.Scanner;

public class Exe06 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o raio do circulo: ");
    float raio = scan.nextFloat();

    double pi = 3.14;
    double area = pi * Math.pow(raio, 2);

    System.out.println("Area do circulo: " + area);
  }

}
