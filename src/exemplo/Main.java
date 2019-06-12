package exemplo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Pessoa> pessoas = new LinkedList<>();
    
    Pessoa funcionario = new Funcionario("João", 12345);
    Pessoa estagiario = new Estagiario("Maria", LocalDate.now());
    
    Estagiario estagiario2 = new Estagiario("Maria", LocalDate.now());
    
    pessoas.add(funcionario);
    pessoas.add(estagiario);
    pessoas.add(estagiario2);
    
    for (Pessoa pessoa : pessoas) {
      System.out.println(pessoa);
    }
  }
}
