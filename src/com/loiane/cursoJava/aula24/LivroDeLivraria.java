package com.loiane.cursoJava.aula24;

public class LivroDeLivraria {

  public static void main(String[] args) {

    Livro livro = new Livro();
    
    livro.titulo = "Java básico";
    livro.autor = "Loiane";
    livro.editora = "bookman";
    livro.qtdPaginas = 350;
    livro.preco = 10.00;
    livro.disponivel = true;
    
    System.out.println("- "+ livro.titulo);
    System.out.println("- "+ livro.autor);
    System.out.println("- "+ livro.editora);
    System.out.println("- "+ livro.qtdPaginas);
    System.out.println("- "+ livro.preco);
    System.out.println("- "+ livro.disponivel);
    

    Livro Dojo = new Livro();

    Dojo.titulo = "Apm";
    Dojo.autor = "Guilherme";
    Dojo.editora = "procergs";
    Dojo.qtdPaginas = 35;
    Dojo.preco = 3.50;
    Dojo.disponivel = false;
    System.out.println();
    System.out.println("Titulo:- "+ Dojo.titulo);
    System.out.println("Autor:- "+ Dojo.autor);
    System.out.println("Editora:- "+ Dojo.editora);
    System.out.println("Quantidade de pg:- "+ Dojo.qtdPaginas);
    System.out.println("Valor:- "+ Dojo.preco);
    System.out.println("Disponível- "+ Dojo.disponivel);
    
  }
}
