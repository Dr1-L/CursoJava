/*1. Escreva  uma  classe  Agenda,  que  cont�m  v�rios  contatos  do  tipo  Contato.   
 * Cada  contato  possui  nome,  telefone  e  email.  
 * A  Agenda  tamb�m  possui  um   nome.  
 * Crie  um  programa  teste  que  pe�a  para  o  usu�rio  entrar  com  o   nome  da  Agenda  
 * e  em  seguida  3  contatos.  
 * Crie  m�todos  que  retornem   uma  String  com  a  informa��o  de  cada  
 * contato  e  tamb�m  de  todos  os   contatos  da  agenda.*/
package com.loiane.cursoJava.aula36.labs;

public class Contato {

  private String nome;
  private String telefone;
  private String email;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  public String exibeInfos() {
    return "Nome: "+this.nome + "Telefone: "+ this.telefone + "Email: "+ this.email;
  }
}
