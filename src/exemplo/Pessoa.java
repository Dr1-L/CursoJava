package exemplo;

import java.math.BigDecimal;

public abstract class Pessoa {

  protected String nome;
  protected int tipo;
  
  public Pessoa(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }
  
  abstract int getNumeroHorasDiaria();
  
  abstract BigDecimal getSalario();
}  
