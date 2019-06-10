//Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto. 
package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe17 {

  public static void main(String[] args) {

    /*  Como Calcular o Ano Bissexto?
    Para saber se um ano é bissexto existe uma regra básica: 
    Os anos bissextos são aqueles múltiplos de 4, ou seja, a cada quatro anos temos um ano bissexto.
    
    Por outro lado, esses anos não são múltiplos de 100 (por exemplo,1800, 1900, 2100), 
    exceto os múltiplos de 400 (por exemplo 1600, 2000, 2400).*/

    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o ano para verificar se é Bissexto:");
    int ano = scan.nextInt();

    /*if(ano % 4 == 0 && ano % 100 != 0 && ano % 400 == 0){
      if(ano % 100 != 0 && ano % 400 == 0) {
        System.out.println("Ano Bissexto.");
      }
    }else {
      System.out.println("Não é ano Bissexto.");
    }*/
//    if (ano % 4 == 0) {
//      if (ano % 100 != 0 && ano % 400 == 0) {
//        System.out.println("É bissexto");
//      } else {
//        System.out.println("Não é bissexto");
//      }
//    } else if (ano % 4 != 0) {
//      System.out.println("Não é divisivel por 4.");
//    }

    if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 4 == 0) && (ano % 100 == 0) && (ano % 400 == 0)) {
      System.out.println("É bissexto");
    } else {
      System.out.println("Não é bissexto");
    }

    //os seguintes anos são bissextos: 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 2052
  }
}
