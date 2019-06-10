//Supondo que a população de um país A seja da ordem de 80000 habitantes 
//com uma taxa anual de crescimento de 3% e que 
//a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
//Faça um programa que calcule e escreva o número de anos necessários para que 
//a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento. 
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
    System.out.println("População A: "+ popA);
    System.out.println("População B: "+popB);
    System.out.println("Anos: "+cont);
    
  }

}
