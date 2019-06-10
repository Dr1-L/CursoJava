package com.loiane.cursoJava.aula13;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exe10 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Informe a temperatura em graus Celsius: ");
    BigDecimal celsius = scan.nextBigDecimal();
    
    BigDecimal nove = BigDecimal.valueOf(9);
    BigDecimal cinco = BigDecimal.valueOf(5);
    BigDecimal trintaEDois = BigDecimal.valueOf(32);
    
    BigDecimal fahrenheit = celsius.multiply(nove);
    fahrenheit = fahrenheit.divide(cinco);
    fahrenheit = fahrenheit.add(trintaEDois);
        
    //double celsius = scan.nextDouble();
    //double fahrenheit = ((celsius * 9) / 5) + 32;

    System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

  }

}
