package com.loiane.cursoJava.aula38;

public class Professor extends Pessoa{
  
  private double   salario;
  private String   nomeCurso;
  
  public double getSalario() {
    return salario;
  }
  public void setSalario(double salario) {
    this.salario = salario;
  }
  public double calcularSalarioLiquido() {
    return 0;
  }

}
