package com.loiane.cursoJava.aula43.exe02;

public class PessoaFisica extends Contribuinte {
  
  private int aliquota;

  @Override
  public double calcularImposto() {

    double rendaB = super.getRendaBruta();

    if (rendaB >= 0 && rendaB <= 1400) {
      return 0;
    }
    if (rendaB > 1400 && rendaB <= 2100) {
      return (super.getRendaBruta() * 0.1) - 100;
    }
    if (rendaB > 2100 && rendaB <= 2800) {
      return (super.getRendaBruta() * 0.15) - 270;
    }
    if (rendaB > 2800 && rendaB <= 3600) {
      return (super.getRendaBruta() * 0.25) - 500;
    }
    return (super.getRendaBruta() * 0.3) - 700;
  }
  
  @Override
  public String toString() {
    //String toS = super.toString();
    String toS = "";
    toS +="\nPessoa Fisica:"+
    "\nImposto a ser pago: "+ calcularImposto();
    return super.toString();
  }
}
