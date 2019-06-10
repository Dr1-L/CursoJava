/* 3. Escreva  uma  class  para  representar  um  Aluno.  
 * Adicione  atributos   relacionados  �s  caracteristicas  de  um  Aluno,  
 * como  nome,  matricula,  curso   que  est�  matriculado,  
 * nome  de  3  disciplinas  que  est�  cursando  e  as  notas   dessas  3  disciplinas. 
 * Desenvolva  um  m�todo  para  verificar  se  o  aluno  est�   aprovado  (nota  maior  ou  igual  a  7)  
 * em  uma  determinada  disciplina.   
 * Escreva  um  programa  para  testar  essa  classe,  que  pede  as  informa��es  do   
 * aluno  ao  usu�rio  e  ao  final  informa  o  nome  das  disciplinas,  
 * mostra  as   notas  e  mostra  se  o  aluno  foi  aprovado  ou  n�o. */
package com.loiane.cursoJava.aula27;

import java.util.Scanner;

public class TesteAluno {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Aluno aluno = new Aluno();

    System.out.print("Informe o nome do Aluno: ");
    aluno.nomeAluno = scan.nextLine();

    System.out.print("Informe a matr�cula do Aluno: ");
    aluno.nroMatricula = scan.nextLine();

    System.out.println("Informe o nome das 3 disciplinas que o aluno esta cursando.");
    for (int i = 0; i < aluno.disciplinasAluno.length; i++) {
      System.out.print("\nNome da disciplina: ");
      aluno.disciplinasAluno[i] = scan.next();

      System.out.println("Agora informe as notas: ");
      for (int j = 0; j < aluno.notasAluno[i].length; j++) {
        System.out.print("Informe a nota " + (j+1) + " ");
        aluno.notasAluno[i][j] = scan.nextDouble();
      }
    }
    
    for (int i = 0; i < aluno.disciplinasAluno.length; i++) {
      System.out.print("\n"+aluno.disciplinasAluno[i]+": ");
      for(int j = 0; j < aluno.notasAluno[i].length; j++) {
        
        double soma =+ aluno.notasAluno[i][j];
        double media = aluno.media = soma;
        
        if(aluno.isAprovado(media)) {
          System.out.println("Aprovado.");
        } else {
          System.out.println("");
        }
      }
    }
        
    
    
  }
}