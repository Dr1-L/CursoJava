/*2. Escreva  uma  classe  para  representar  um  Curso, que  tem  nome  e  horário.   
 * Cada  curso  tem  um  Professor, que  possui  nome,  departamento  e  email.   
 * Cada  Curso  também  pode  ter  vários  alunos  (tipo  Aluno).  
 * Cada  Aluno  tem   nome,  matricula  e  4  notas.  
 * Escreva  um  programa  teste  que  crie  um  Curso   com  5  alunos,  
 * e  que  peça  para  o  usuário  entrar  com  as  4  notas  de  cada   aluno.  
 * Ao  final,  imprima  a  média  de  cada  aluno,  se  o  mesmo  está  aprovado   
 * (media  maior  ou  igual  a  7),  e  qual  é  a  média  da  turma. */
package com.loiane.cursoJava.aula36.labs;

import java.util.Scanner;

public class TesteCurso {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Curso curso = new Curso();

    System.out.print("Nome do curso: ");
    curso.setNome(scan.next());
    System.out.print("Horário: ");
    curso.setHorario(scan.next());

    Professor prof = new Professor();
    System.out.print("Nome do professor: ");
    prof.setNome(scan.next());
    System.out.print("Departamento: ");
    prof.setDepartamento(scan.next());
    System.out.print("Email: ");
    prof.setEmail(scan.next());

    curso.setProfessores(prof);

    Aluno[] alunos = new Aluno[5];
    for (int i = 0; i < alunos.length; i++) {

      Aluno aluno = new Aluno();

      System.out.print("Insira o nome do aluno: ");
      aluno.setNome(scan.next());
      System.out.print("Matricula: ");
      aluno.setMatricula(scan.next());

      System.out.println("Insira as notas do aluno: ");

      double[] notas = new double[4];
      for (int j = 0; j < notas.length; j++) {
        System.out.print("Nota " + (j+1) + ": ");
        notas[j] = scan.nextDouble();
      }
      aluno.setNotas(notas);
      alunos[i] = aluno;
      curso.setAlunos(alunos);
    }
    System.out.println(curso.obterInfo());
  }
}
