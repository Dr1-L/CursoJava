package exemplo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Estagiario extends Pessoa {

  private LocalDate prazoContrato;
  
  public Estagiario(String nome, LocalDate prazoContrato) {
    super(nome);
    this.prazoContrato = prazoContrato;
    super.tipo = 2;
  }
  
  @Override
  public int getNumeroHorasDiaria() {
    return 6;
  }

  @Override
  public BigDecimal getSalario() {
    BigDecimal valorHora = new BigDecimal("50.00");
    return valorHora.multiply(new BigDecimal(getNumeroHorasDiaria()));
  }
  
  public LocalDate getPrazoContrato() {
    return prazoContrato;
  }
}
