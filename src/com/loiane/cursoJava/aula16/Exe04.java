//Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes 
//com uma taxa anual de crescimento de 3% e que 
//a popula��o de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
//Fa�a um programa que calcule e escreva o n�mero de anos necess�rios para que 
//a popula��o do pa�s A ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento. 
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe04 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    double popA = 80000;
    double popB = 200000;
    double crescimentoA;
    double crescimentoB;
    int cont = 0;
    
    while(!(popA >= popB)) {
      cont ++;
      crescimentoA = popA*0.03;
      popA = popA + crescimentoA;
      
      crescimentoB = popB*0.015;
      popB = popB + crescimentoB;
    }
    System.out.println("Popula��o A: "+ popA);
    System.out.println("Popula��o B: "+popB);
    System.out.println("Anos: "+cont);
    
  }

}
