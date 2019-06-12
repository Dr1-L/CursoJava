package exemplo;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {

  private int matricula;
  
  public Funcionario(String nome, int matricula) {
    super(nome);
    this.matricula = matricula;
    super.tipo = 1;
  }

  @Override
  public int getNumeroHorasDiaria() {
    return 8;
  }

  @Override
  public BigDecimal getSalario() {
    BigDecimal valorHora = new BigDecimal("100.00");
    return valorHora.multiply(new BigDecimal(getNumeroHorasDiaria()));
  }
  
  public int getMatricula() {
    return matricula;
  }
}
