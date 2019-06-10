/*2. Escreva  uma  classe  para  representar  um  Curso, que  tem  nome  e  hor�rio.   
 * Cada  curso  tem  um  Professor, que  possui  nome,  departamento  e  email.   
 * Cada  Curso  tamb�m  pode  ter  v�rios  alunos  (tipo  Aluno).  
 * Cada  Aluno  tem   nome,  matricula  e  4  notas.  
 * Escreva  um  programa  teste  que  crie  um  Curso   com  5  alunos,  
 * e  que  pe�a  para  o  usu�rio  entrar  com  as  4  notas  de  cada   aluno.  
 * Ao  final,  imprima  a  m�dia  de  cada  aluno,  se  o  mesmo  est�  aprovado   
 * (media  maior  ou  igual  a  7),  e  qual  �  a  m�dia  da  turma. */
package com.loiane.cursoJava.aula36.labs;

public class Aluno {

  private String   nome;
  private String   matricula;
  private double[] notas;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public double[] getNotas() {
    return notas;
  }

  public void setNotas(double[] notas) {
    this.notas = notas;
  }

  public String obterInfo() {
    String info = "\nNome aluno: " + this.nome;
    info += " Matricula: " + this.matricula;
    info += " Notas: "+" ";
    double soma = 0;
    for (double nota : notas) {
      soma += nota;
      info += nota + " ";
    }
    double media = soma / 4;
    info += "M�dia: " + media + "-";
    if (media >= 7) {
      info += " Aprovado!";
    } else {
      info += " Reprovado!";
    }
    return info;
  }
  
  public double obterMedia() {
    double soma = 0;
    for (double d : notas) {
      soma += d;
    }
    return soma / 4;
  }
}

