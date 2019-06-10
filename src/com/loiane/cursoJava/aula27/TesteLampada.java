/*1. Escreva  uma  classe  para  representar  uma  l�mpada.  
 * Desenvolva  m�todos   para  ligar,  desligar  a  lampada. */
package com.loiane.cursoJava.aula27;

import java.util.Scanner;

public class TesteLampada {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Lampada lampada01 = new Lampada();
    char resp;

    System.out.println("#####################################");
    System.out.println("Deseja testar a l�mpada? s/n");
    resp = scan.next().charAt(0);

    while (resp != 's' && resp != 'n') {
      System.out.println("Op��o inv�lida. Digite novamente.");
      resp = scan.next().charAt(0);
    }

    if (resp == 's') {
      boolean status = lampada01.desligarLampada();
      String teste = lampada01.verificarStatus();

      System.out.println(teste);
      System.out.println("\nAcenda a l�mpada e verifique se esta funcionando. \n 1-Acender \t2-Deixar assim");
      resp = scan.next().charAt(0);

      while (resp != '1' && resp != '2') {
        System.out.println("Op��o inv�lida. Digite novamente.");
        resp = scan.next().charAt(0);
      }

      if (resp == '1') {
        boolean ligar = lampada01.ligarLampada();
        // System.err.println(" "+ lampada01.verificarStatus(ligar));
        System.out.println(lampada01.verificarStatus());
      } else {
        System.out.println(lampada01.verificarStatus());
      }
    } else {
      System.out.println("Ok.");
    }
  }
}
