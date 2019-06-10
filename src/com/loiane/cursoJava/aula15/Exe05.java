package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe05 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    /*System.out.println("Insira duas notas parciais:");
    BigDecimal notaUm = scan.nextBigDecimal();
    BigDecimal notaDois = scan.nextBigDecimal();
    
    BigDecimal notaSoma = notaUm.add(notaDois);
    BigDecimal media = notaSoma.divide(new BigDecimal(2));
    
    //divide por 2 -> 2 casas decimais -> arredonda para cima
    System.out.println("Média do aluno: "+, 2, RoundingMode.CEILING));
    */
    //if(media.compareTo(7)) {

    System.out.println("Insira duas notas parciais:");
    double notaUm = scan.nextDouble();
    double notaDois = scan.nextDouble();
    
    double media = (notaUm + notaDois) / 2;
    
    if (media >= 7 && media <= 10) {
      System.out.println("Média: " + media + "\nAprovado.");
    } else if (media < 7) {
      System.out.println("Média: " + media + "\nReprovado.");
    } else if (media == 10) {
      System.out.println("Média: " + media + "Aprovado com Distinção.");
    } else {
      System.out.println("Média muito loka.");
    }
  }

}
