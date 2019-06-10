/*. Escreva  uma  classe  Calculadora  que  tenha  os  seguintes  m�todos:  
 * somar,   subtrair,  multiplicar,  dividir  (dois  n�meros),  
 * elevar  �  pot�ncia  n.   Desenvolva  um  programa  para  testar  essa  classe.*/
/*3. Escreva  um  m�todo  para  calcular  factorial  de  um  n�mero  na  classe   Calculadora  do  exerc�cio  anterior.*/

package com.loiane.cursoJava.aula34;

import java.util.Scanner;

public class TestaCalculadora {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("1-Somar \t2-Subtrair \t3-Multiplicar \t4-Dividir \t5-Pot�ncia \t6-Fatorial");
    System.out.println("Escolha a opera��o");
    int op = scan.nextInt();

    System.out.print("Digite 2 numeros");
    double numA = scan.nextDouble();
    double numB = scan.nextDouble();

    switch (op) {
      case 1:
        System.out.print("1-Somar");
        System.out.println("\n"+numA + " + " + numB + " = " + Calculadora.somar(numA, numB));
        break;

      case 2:
        System.out.print("2-Subtrair");
        System.out.println("\n"+numA + " - " + numB + " = " + Calculadora.subtrair(numA, numB));
        break;

      case 3:
        System.out.print("3-Multiplicar");
        System.out.println("\n"+numA + " * " + numB + " = " + Calculadora.multiplicar(numA, numB));
        break;

      case 4:
        System.out.print("4-Dividir");
        System.out.println("\n"+numA + " / " + numB + " = " + Calculadora.dividir(numA, numB));
        break;

      case 5:
        System.out.print("5-Pot�ncia");
        System.out.print("\nElevar a pot�ncia: ");
        int pot = scan.nextInt();
        System.out.println("\n"+numA + "^" + pot + " = " + Calculadora.potencia(numA, pot));
        System.out.println("\n"+numB + "^ " + pot + " = " + Calculadora.potencia(numB, pot));
        break;

      case 6:
        System.out.print("6-Fatorial");
        System.out.println("\n" + numA + " = " + Calculadora.calcFatorial(numA));
        System.out.println("\n" + numB + " = " + Calculadora.calcFatorial(numB));
        break;
      default:
        System.out.println("Op��o inv�lida.");
        break;
    }

  }
}
