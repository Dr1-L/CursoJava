/*2. Escreva  uma  classe  para  representar  um  Curso, que  tem  nome  e  hor�rio.   
 * Cada  curso  tem  um  Professor, que  possui  nome,  departamento  e  email.   
 * Cada  Curso  tamb�m  pode  ter  v�rios  alunos  (tipo  Aluno).  
 * Cada  Aluno  tem   nome,  matricula  e  4  notas.  
 * Escreva  um  programa  teste  que  crie  um  Curso   com  5  alunos,  
 * e  que  pe�a  para  o  usu�rio  entrar  com  as  4  notas  de  cada   aluno.  
 * Ao  final,  imprima  a  m�dia  de  cada  aluno,  se  o  mesmo  est�  aprovado   
 * (media  maior  ou  igual  a  7),  e  qual  �  a  m�dia  da  turma. */
package com.loiane.cursoJava.aula36.labs;

public class Professor {

  private String nome;
  private String departamento;
  private String email;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String obterInfo() {
    return "Professor: " + this.nome+"\n";
  }
}
