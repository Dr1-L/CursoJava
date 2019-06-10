package com.loiane.cursoJava.aula13;

import java.util.Scanner;

public class Exe09 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Eii!! Quantos graus ai???(Farenheit) ");
    double grausFar = scan.nextDouble();

    double grausCelsius = (5 * (grausFar - 32) / 9);
    System.out.println("Temperatura em graus Celsius: " + grausCelsius);
  }

}
