/*1. Escreva  uma  classe  Agenda,  que  contém  vários  contatos  do  tipo  Contato.   
 * Cada  contato  possui  nome,  telefone  e  email.  
 * A  Agenda  também  possui  um   nome.  
 * Crie  um  programa  teste  que  peça  para  o  usuário  entrar  com  o   nome  da  Agenda  
 * e  em  seguida  3  contatos.  
 * Crie  métodos  que  retornem   uma  String  com  a  informação  de  cada  
 * contato  e  também  de  todos  os   contatos  da  agenda.*/
package com.loiane.cursoJava.aula36.labs;

import java.util.Scanner;

public class Agenda {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    //relacionamento: tem muitos
    Contato[] contatos = new Contato[3];
    
    for(int i = 0; i < contatos.length; i++) {
      
      Contato contato = new Contato();
      
      System.out.print("Informe o nome do contato: ");
      contato.setNome(scan.next());
      
      System.out.print("Informe o telefone: ");
      contato.setTelefone(scan.next());
      
      System.out.print("Informe o email: ");
      contato.setEmail(scan.next());
      //add o objeto criado "contato" no array
      contatos[i] = contato;
    }
    for (Contato c : contatos) {
      System.out.print("\nNome: "+c.getNome());
      System.out.print("\nTelefone: "+c.getTelefone());
      System.out.print("\nE-mail: "+c.getEmail());
    }
  }
}
