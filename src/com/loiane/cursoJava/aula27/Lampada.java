/*1. Escreva  uma  classe  para  representar  uma  l�mpada.  
 * Desenvolva  m�todos   para  ligar,  desligar  a  lampada. */
package com.loiane.cursoJava.aula27;

public class Lampada {
  
  String marca;
  String cor;
  int potencia;
  boolean status = false;

  String verificarStatus() {
//  String verificarStatus(boolean status) {
    String msg = null;
    if(status) {
      msg = "L�mpada ligada.";
    } else {
      msg = "L�mpada desligada.";
    }
    return msg;
  }
  
  boolean ligarLampada () {
    this.status = true;
    return status;
  }
  
  boolean desligarLampada() {
    this.status = false;
    return status;
  }
  
}
