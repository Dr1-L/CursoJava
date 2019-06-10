/*4. Escreva  a  classe  ConversaoDeUnidadesDeArea  com  métodos  estáticos   
 * para  conversão  das  unidades  de  área  segundo  a  lista  abaixo.       
 * • 1  metro  quadrado  =  10.76  pés  quadrados     
 * • 1  pé  quadrado  =  929  centímetros  quadrados   
 * • 1  milha  quadrada  =  640  acres   
 * • 1  acre  =  43.560  pés  quadrados */
package com.loiane.cursoJava.aula34;

public class ConversaoDeUnidadesDeArea {
  
  private static double result;
  
  public static double converteMetrosParaPes(double metro) {
    result = metro*10.76;
    return result;
  }
  
  public static double convertePesParaCms(double pes) {
    result = pes*929;
    return result;
  }
  
  public static double converteMilhaParaAcres(double milha) {
    result = milha*640;
    return result;
  }
  
  public static double converteAcreParaPes(double acre) {
    result = acre*43560;
    return result;
  }

}
