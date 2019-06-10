package com.loiane.cursoJava.aula43;

public class ContaEspecial extends ContaBancaria {

  private double limite;

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  @Override
  public boolean sacar(double valor) {
    
    double saldoComLimite = super.getSaldo() + this.limite;
    if((saldoComLimite-valor) >= 0) {
      super.setSaldo(super.getSaldo() - valor);
      return true;
    }
    return false;
//    if (this.limite > valor) {
//      return false;
//    } else {
//      this.limite -= valor;
//      return true;
//    }
  }
  
  @Override
  public String toString() {
    String toS = "Conta Especial: " + "\nLimite: " + this.limite;
    toS += "\n" + super.toString();
    return toS;
  }
}
