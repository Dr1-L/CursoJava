package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe10 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Olá! Qual turno você estuda?\n M-Matutino | V-Vespertino | N-Noturno");
    char turno = scan.next().charAt(0);
    turno = Character.toLowerCase(turno);

    switch (turno) {
      case 'm':
        System.out.println("Bom Dia!");
        break;
      case 'v':
        System.out.println("Boa Tarde!");
        break;
      case 'n':
        System.out.println("Boa Noite!");
        break;
      default:
        System.out.println("Valor inválido!");
    }
  }
}
