package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe04 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite uma letra: ");
    char letra = scan.next().charAt(0);
    letra = Character.toUpperCase(letra);
//        if(letra == 'A' || letra == 'E') {
//          
//        }
    switch (letra) {
      case 'A':
        System.out.println("� vogal.");
        break;
      case 'E':
        System.out.println("� vogal.");
        break;
      case 'I':
        System.out.println("� vogal.");
        break;
      case 'O':
        System.out.println("� vogal.");
        break;
      case 'U':
        System.out.println("� vogal.");
        break;
      default:
        System.out.println("� consoante.");
    }
  }

}
