package com.loiane.cursoJava.aula13;

import java.util.Scanner;

public class Exe11 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Insira dois números inteiros:");
    int numeroA = scan.nextInt();
    int numeroB = scan.nextInt();

    System.out.println("Insira um numero real:");
    double numeroC = scan.nextDouble();

    System.out.println("Letra a)");
    double letraA = ((2 * numeroA) * (numeroB / 2));
    System.out.println("Produto do dobro do primeiro com metade do segundo: " + letraA);

    System.out.println("Letra b)");
    double letraB = ((3 * numeroA) + numeroC);
    System.out.println("Soma do triplo do primeiro com o terceiro: " + letraB);

    System.out.println("Letra c)");
    double letraC = Math.pow(numeroC, 3);
    System.out.println("O terceiro elevado ao cubo: " + letraC);

  }

}
