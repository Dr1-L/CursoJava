//4. Criar um vetor A com 15 elementos inteiros. 
//Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B deverá 
//ser a raiz quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
package com.loiane.cursoJava.aula19;

import java.text.DecimalFormat;

public class Exe04 {

  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat();
    df.setMaximumFractionDigits(3);

    int[] vecA = new int[15];
    double[] vecB = new double[15];
    
    
    for(int i = 0; i < vecA.length; i++) {
      vecA[i] = i;
      
      vecB[i] = Math.sqrt(vecA[i]);
    }

    System.out.println("Vetor A");
    for(int vec : vecA) {
      System.out.print(vec+"\t ");
    }
    
    System.out.println("\nVetor B");
    for(double vec : vecB) {
      System.out.print(df.format(vec)+"\t ");
    }
  }
}
