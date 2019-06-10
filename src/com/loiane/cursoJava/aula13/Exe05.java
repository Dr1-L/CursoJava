package com.loiane.cursoJava.aula13;

import java.util.Scanner;

public class Exe05 {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Informe o valor a ser convertido para cm: ");
    float metros = scan.nextFloat();
    
    float centimetros = metros*100;
    System.out.println("Cm: " + centimetros);
  }

}
