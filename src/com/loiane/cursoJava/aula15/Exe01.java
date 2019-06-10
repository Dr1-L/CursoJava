package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe01 {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Insira dois numeros inteiros:");
    int numA = scan.nextInt();
    int numB = scan.nextInt();
    
    if(numA > numB) {
      System.out.println("Valor maior: "+numA);
    } else if(numB > numA) {
      System.out.println("Valor maior: "+numB);
    }else {
      System.out.println("Valores iguais!");
    }
  }

}
