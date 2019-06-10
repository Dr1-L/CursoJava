package com.loiane.cursoJava.aula40;

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
  
  public String obterEtiquetaEndereco() {
    String s = "Endreço do professor: ";
    s += super.getEndereco();
    return s;
  }

}
