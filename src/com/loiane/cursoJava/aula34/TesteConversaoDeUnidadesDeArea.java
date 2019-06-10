/*4. Escreva  a  classe  ConversaoDeUnidadesDeArea  com  métodos  estáticos   
 * para  conversão  das  unidades  de  área  segundo  a  lista  abaixo.       
 * • 1  metro  quadrado  =  10.76  pés  quadrados     
 * • 1  pé  quadrado  =  929  centímetros  quadrados   
 * • 1  milha  quadrada  =  640  acres   
 * • 1  acre  =  43.560  pés  quadrados */
package com.loiane.cursoJava.aula34;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TesteConversaoDeUnidadesDeArea {

  public static void main(String[] args) {

    Scanner scan= new Scanner(System.in);
    DecimalFormat dc = new DecimalFormat();
    dc.setMaximumFractionDigits(3);
    
    
    System.out.println("Digite um numero:");
    double num = scan.nextDouble();
    
    System.out.println("Acre -> Pes");
    System.out.println(dc.format(ConversaoDeUnidadesDeArea.converteAcreParaPes(num)));
    
    System.out.println("Metros -> Pes");
    System.out.println(ConversaoDeUnidadesDeArea.converteMetrosParaPes(num));
    
    System.out.println("Milhas -> Acres");
    System.out.println(ConversaoDeUnidadesDeArea.converteMilhaParaAcres(num));
    
    System.out.println("Pes -> Centimetros");
    System.out.println(ConversaoDeUnidadesDeArea.convertePesParaCms(num));
    
  }

}
