package com.loiane.cursoJava.aula43.exe01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

  private double diaRendimento;

  public double getDiaRendimento() {
    return diaRendimento;
  }

  public void setDiaRendimento(double diaRendimento) {
    this.diaRendimento = diaRendimento;
  }

  public boolean calcularNovoSaldo(double txRendimento) {
    Calendar hoje = Calendar.getInstance();

    if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
      super.setSaldo(super.getSaldo() + (super.getSaldo() * txRendimento));
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    String toS = " ";
    toS = "\nConta Poupança: " + "\nDia rendimento: " + this.getDiaRendimento();
    toS += "\n" + super.toString();
    return toS;
  }
}
