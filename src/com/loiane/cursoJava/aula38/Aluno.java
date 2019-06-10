package com.loiane.cursoJava.aula38;

public class Aluno extends Pessoa {
//extends =  herança
  private String   curso;
  private double[] notas;
  
  
  
  public Aluno(String nome, String endereco, String telefone, String curso) {
    super(nome, endereco, telefone);
    this.curso = curso;
  }
  public Aluno() {
    super();
    // TODO Auto-generated constructor stub
  }
  public String getCurso() {
    return curso;
  }
  public void setCurso(String curso) {
    this.curso = curso;
  }
  public double[] getNotas() {
    return notas;
  }
  public void setNotas(double[] notas) {
    this.notas = notas;
  }
  
  public double calcularMedia() {
    return 0;
  }
  
  public boolean verificarAprovado() {
    return true;
  }
  
  public void metodoQualquer() {
   // this.setCpf();;
    //ou super.setCpf
  }
}
