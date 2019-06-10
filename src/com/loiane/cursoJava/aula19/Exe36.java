/*36.Criar um vetor A com 11 elementos, 
 * indexados de 0 até 10. Sendo que cada elemento do vetor A 
 * é formado pela potência de base 2 elevado ao expoente igual a posição 
 * do respectivo elemento, ou seja: A[i] = 2i . 
 * Sugestão int A[11];*/
package com.loiane.cursoJava.aula19;

public class Exe36 {

  public static void main(String[] args) {

    int[] vet = new int[11];

    for (int i = 0; i < vet.length; i++) {
      vet[i] = (int) Math.pow(2, i);
    }

    System.out.println("Vetor");
    for (int v : vet) {
      System.out.print(v + " ");
    }
  }
}
