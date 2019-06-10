//Faça um programa que imprima na tela os números de 1 a 20, 
//um abaixo do outro. 
//Depois modifique o programa para que ele mostre os números um ao lado do outro. 
package com.loiane.cursoJava.aula16;

public class Exe06 {

  public static void main(String[] args) {
    
        System.out.println("Imprime na vertical.");
    for(int i = 1; i <=20; i++) {
      System.out.println(i);
    }
    
    System.out.println("Imprime na horizontal.");
    for(int cont = 1;cont <= 20; cont++) {
      System.out.print(cont);
    }
  }

}
