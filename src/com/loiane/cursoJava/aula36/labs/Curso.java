/*2. Escreva  uma  classe  para  representar  um  Curso, que  tem  nome  e  hor�rio.   
 * Cada  curso  tem  um  Professor, que  possui  nome,  departamento  e  email.   
 * Cada  Curso  tamb�m  pode  ter  v�rios  alunos  (tipo  Aluno).  
 * Cada  Aluno  tem   nome,  matricula  e  4  notas.  
 * Escreva  um  programa  teste  que  crie  um  Curso   com  5  alunos,  
 * e  que  pe�a  para  o  usu�rio  entrar  com  as  4  notas  de  cada   aluno.  
 * Ao  final,  imprima  a  m�dia  de  cada  aluno,  se  o  mesmo  est�  aprovado   
 * (media  maior  ou  igual  a  7),  e  qual  �  a  m�dia  da  turma. */
package com.loiane.cursoJava.aula36.labs;

public class Curso {

  private String    nome;
  private String    horario;
  private Professor professor;
  private Aluno[]   alunos;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }

  public Professor getProfessores() {
    return professor;
  }

  public void setProfessores(Professor professor) {
    this.professor = professor;
  }

  public Aluno[] getAlunos() {
    return alunos;
  }

  public void setAlunos(Aluno[] alunos) {
    this.alunos = alunos;
  }

  public String obterInfo() {
    String info = "Nome do curso: " + this.nome + "\n";

    if (professor != null) {
      info += professor.obterInfo();
    }
    if (alunos != null) {
      System.out.println();
      for (Aluno aluno : alunos) {
        info += aluno.obterInfo();
      }
    }
    info += "\n"+obterMediaTurma();
    return info;
  }

  public double obterMediaTurma() {
    double soma = 0;
    for (Aluno al : alunos) {
      soma += al.obterMedia();
    }
    return soma / alunos.length;
  }
}
