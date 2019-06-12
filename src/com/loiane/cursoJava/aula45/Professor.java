package com.loiane.cursoJava.aula45;

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

  public void imprimirEtiquetaEndereco() {
    System.out.println("Endereço do professor");
    System.out.println(this.obterEtiquetaEndereco());
  }

}
