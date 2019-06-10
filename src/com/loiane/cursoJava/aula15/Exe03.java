package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe03 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite seu genêro: F ou M");
    char genero = scan.next().charAt(0);
    //converte para maiusculo
    genero = Character.toUpperCase(genero);

    switch (genero) {
      case 'F':
        System.out.println("F - Feminino");
        break;
      case 'M':
        System.out.println("M - Masculino");
        break;
      default:
        System.out.println("Sexo inválido.");
    }

  }

}