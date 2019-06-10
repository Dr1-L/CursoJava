/*19.Ler as duas notas bimestrais para um conjunto de 10 alunos. 
 * Armazenar as notas informadas em dois vetores �Nota1� e �Nota2� do tipo real. 
 * Escreva um programa que calcule a m�dia aritm�tica simples das notas informadas armazenando 
 * o resultado em um vetor �Result� de mesmo tipo e tamanho. Ao mostrar os resultados exibir 
 * a situa��o de cada aluno. 
 * Se a m�dia calculada for superior ou igual a 7 o aluno estar� �aprovado�, caso contr�rio, 
 * a situa��o do aluno ser� �reprovado�.*/
package com.loiane.cursoJava.aula19;

import java.util.Scanner;

public class Exe19 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double[] Nota1 = new double[10];
    double[] Nota2 = new double[10];
    double[] Result = new double[10];
    String[] aluno = new String[10];

    for (int i = 0; i < aluno.length; i++) {
      System.out.print("\n" + i + "-Digite o nome do aluno: ");
      aluno[i] = scan.next();

      System.out.print("Insira nota 1: ");
      Nota1[i] = scan.nextDouble();

      System.out.print("Insira nota 2: ");
      Nota2[i] = scan.nextDouble();

      Result[i] = (Nota1[i] + Nota2[i]) / 2;
    }

    for (int i = 0; i < aluno.length; i++) {
      if (Result[i] >= 7) {
        System.out.print("\nAluno: " + aluno[i] + " aprovado com m�dia: " + Result[i]);
      } else {
        System.out.print("\nAluno: " + aluno[i] + " reprovado com m�dia: " + Result[i]);
      }
    }
  }
}