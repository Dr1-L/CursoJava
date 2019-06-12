package com.loiane.cursoJava.aula43.exe02;

public abstract class Contribuinte {
  
  private String nome;
  private double rendaBruta;

  public double getRendaBruta() {
    return rendaBruta;
  }

  public void setRendaBruta(double rendaBruta) {
    this.rendaBruta = rendaBruta;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
  //m�todo abstrato n�o possui corpo
  //classes filhas da classe abstrata s�o obrigadas a possuir os metodos abstratos
  //com a l�gica especifica para o metodo
  public abstract double calcularImposto();
  
  @Override
  public String toString() {
    String toS = "";
    return toS = "\nNome: "+ this.getNome() +
        "\nRenda: "+ this.getRendaBruta() +
        "\nImposto: "+ calcularImposto();
  }
}
