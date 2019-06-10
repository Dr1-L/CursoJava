import java.math.BigDecimal;

public class teste {

  public static void main(String[] args) {
//    double d1 = 0.1;
//    double d2 = 0.2;
//    System.out.println(d1+d2);
    
    /*    System.out.println("Subtrai");
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));
    
    System.out.println("");
    System.out.println("Soma");
    System.out.println(new BigDecimal("2.00").add(new BigDecimal("1.2")));
    
    System.out.println("");
    System.out.println("Compara");
    System.out.println(new BigDecimal("2.00").compareTo(new BigDecimal("1.3")));
    
    System.out.println("");
    System.out.println("Divide");
    System.out.println(new BigDecimal("2.00").divide(new BigDecimal("2.00")));
    
    System.out.println("");
    System.out.println("Máximo");
    System.out.println(new BigDecimal("2.00").max(new BigDecimal("1.5")));
    
    System.out.println("");
    System.out.println("Mínimo");
    System.out.println(new BigDecimal("2.00").min(new BigDecimal("1.6")));
    
    System.out.println("");
    System.out.println("Potência");
    System.out.println(new BigDecimal("2.00").pow(2));
    
    System.out.println("");
    System.out.println("Multiplica");
    System.out.println(new BigDecimal("2.00").multiply(new BigDecimal("1.8")));
    
    Perceba que no código acima optamos por arredondar o valor para cima e deixar três casas decimais após a virgula.
    System.out.println("Divide");
    System.out.println(new BigDecimal("1.00").divide
    (new BigDecimal("1.3"),3,RoundingMode.UP));
    
    }*/
    
    BigDecimal d1 = new BigDecimal("0.1");
    BigDecimal d2 = new BigDecimal("0.2");
    BigDecimal bigResult = d1.add(d2);
    System.out.println(bigResult);
    
  }

}
