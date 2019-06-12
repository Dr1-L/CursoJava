package com.loiane.cursoJava.aula45;

public class Teste {
  
  public static void main(String[] args) {
  /*
  Aluno aluno = new Aluno();
  Pessoa pessoaAluno = aluno; //upcasting
  
  Pessoa aluno2 = (Pessoa) new Aluno();
  
  Pessoa aluno3 = new Pessoa();
  Aluno aluno4 = (Aluno) aluno3;//downcasting
  */
    
    Pessoa pessoa = new Pessoa();
    Aluno aluno = new Aluno();
    Professor prof = new Professor();
    //verifica o tipo de classe
    if (pessoa instanceof Pessoa) {
      System.out.println("é do tipo Pessoa");
    }
  }
}
