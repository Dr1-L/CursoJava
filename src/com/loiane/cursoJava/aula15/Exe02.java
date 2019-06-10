package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe02 {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Insira um valor:");
    double numA = scan.nextDouble();
    
    if (numA > 0) {
      System.out.println("Valor positivo!");
    }else if(numA < 0) {
      System.out.println("Valor negativo!");
    }else {
      System.out.println("Numero = 0");
    }
  }

}
