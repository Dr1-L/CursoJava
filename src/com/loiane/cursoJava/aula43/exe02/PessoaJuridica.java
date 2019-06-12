package com.loiane.cursoJava.aula43.exe02;

public class PessoaJuridica extends Contribuinte {

  private int txImposto = 10;
  
  public int getTxImposto() {
    return txImposto;
  }
  public void setTxImposto(int txImposto) {
    this.txImposto = txImposto;
  }
 
  @Override
  public double calcularImposto() {
    return super.getRendaBruta()* 0.1;
  }
  
  @Override
  public String toString() {
//    String toS = "";
//    toS += "Pessoa Juridica" +
//    "Imposto a ser pago: "+ calcularImposto();
    return super.toString();
  }
}
