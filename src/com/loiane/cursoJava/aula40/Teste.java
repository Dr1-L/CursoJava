package com.loiane.cursoJava.aula40;

public class Teste {

  public static void main(String[] args) {

    Pessoa pessoa = new Pessoa();
    Pessoa aluno = new Aluno();
    Pessoa professor = new Professor();
    
    pessoa.setEndereco("Rua 1, num 1");
    aluno.setEndereco("Rua 2, num2");
    professor.setEndereco("Rua 2, num2");
    
    System.out.println(pessoa.obterEtiquetaEndereco());
    System.out.println(aluno.obterEtiquetaEndereco());
    System.out.println(professor.obterEtiquetaEndereco());
  }
}
