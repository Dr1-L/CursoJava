/*22.Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, 
 * sugestão: A[i] = (int)Math.round(Math.random() * 1); 
 * Pede-se para implementar um programa que determine 
 * o percentual de números 0's e 1's existentes no vetor A.*/
package com.loiane.cursoJava.aula19;

public class Exe22 {

  public static void main(String[] args) {

    int[] vetA = new int[10];
    int contaZero = 0;
    int contaUm = 0;
    double percent = 0;

    for (int i = 0; i < vetA.length; i++) {
      vetA[i] = (int) Math.round(Math.random() * 1);

      if (vetA[i] == 0) {
        contaZero++;
      } else if (vetA[i] == 1) {
        contaUm++;
      }
    }

    for (int a : vetA) {
      System.out.println(a);
    }
    percent = (contaUm * 100) / vetA.length;
    System.out.println(percent + "% dos valores são iguais a 1");

    percent = (contaZero * 100) / vetA.length;
    System.out.println(percent + "% dos valores são iguais a 0");
  }
}
