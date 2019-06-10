//Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. 
//Valide a entrada e permita repetir a operação.
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe05 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double popA = 0;
    double popB = 0;
    double crescimentoA;
    double crescimentoB;
    int cont = 0;
    char resp = 0;

    do {
      System.out.print("Informe o valor da população A: ");
      popA = scan.nextDouble();
        if (popA <= 0) {
          System.out.print("Valor inválido. Digite novamente: ");
          popA = scan.nextDouble();
        }

      System.out.print("Informe a taxa de crescimento populacional:");
      crescimentoA = scan.nextDouble();

      System.out.print("Informe o valor da população B: ");
      popB = scan.nextDouble();
        if (popB <= 0) {
          System.out.print("Valor inválido. Digite novamente: ");
          popB = scan.nextDouble();
        }
      System.out.print("Informe a taxa de crescimento populacional:");
      crescimentoB = scan.nextDouble();

      /*while (!(popA >= popB) || !(popB >= popA)) {
        cont++;
        crescimentoA = popA * 0.03;
        popA = popA + crescimentoA;
      
        crescimentoB = popB * 0.015;
        popB = popB + crescimentoB;
      }*/
      while (popA < popB) {
        popA = popA + (popA/100)*crescimentoA;
        popB = popB + (popB/100)*crescimentoB;
        cont++;
      }

      System.out.println("População A: " + popA);
      System.out.println("População B: " + popB);
      System.out.println("Anos: " + cont);

      System.out.println("Calcular novamente: s/n");
      resp = scan.next().charAt(0);
    } while (resp == 's');
    System.out.println("Aplicação encerrada.");
  }
}
