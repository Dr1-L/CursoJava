package com.loiane.cursoJava.aula41;

public abstract class Pessoa {
  
  private String   nome;
  private String   endereco;
  private String   telefone;
  private String   cpf;

  public Pessoa() {
    super();
    // TODO Auto-generated constructor stub
  }
  public Pessoa(String nome, String endereco, String telefone) {
    super();
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  
  //metodo abstrato n�o precisa ter corpo, pois cada classe filha determina seu comportamento
  public abstract String obterEtiquetaEndereco();
  
  public abstract void imprimirEtiquetaEndereco();

}
