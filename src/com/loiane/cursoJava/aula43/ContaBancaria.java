package com.loiane.cursoJava.aula43;

public class ContaBancaria {

  private String  nomeCliente;
  private long    numConta;
  private double  saldo;
  private boolean isPoupanca;
  private boolean isEspecial;

  public ContaBancaria() {
    // TODO Auto-generated constructor stub
  }

  public boolean isPoupanca() {
    return isPoupanca;
  }

  public void setPoupanca(boolean isPoupanca) {
    this.isPoupanca = isPoupanca;
  }

  public boolean isEspecial() {
    return isEspecial;
  }

  public void setEspecial(boolean isEspecial) {
    this.isEspecial = isEspecial;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public long getNumConta() {
    return numConta;
  }

  public void setNumConta(long numConta) {
    this.numConta = numConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    String toS = " ";
    toS = "\nCliente: " + this.getNomeCliente() + "\nNúmero da Conta: " + this.numConta + "\nSaldo: " + this.saldo;

    return toS;
  }

  public boolean sacar(double valor) {
    if (valor > this.saldo) {
      return false;
    } else {
      this.saldo -= valor;
      return true;
    }
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }
}
