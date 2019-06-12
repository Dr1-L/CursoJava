/* 2. Escreva  a  interface  DimensaoSuperficial  que  cont�m  o  m�todo   calcularArea.  
 * Escreva  a  interface  DimensaoVolumetrica  que  cont�m  o   m�todo  calcularVolume.  
 * Aplique  a  interface  DimensaoSuperficial  em   todas  as  subclasses  de  Figura2D  
 * e  Figura3D  e  aplique  a  interface   DimensaoVolumetrica  nas  subclasses  de  Figura3D,  
 * implementando  seus   m�todos  de  acordo  com  as  regras  de  cada  figura  
 * geom�trica  (crie  os   atributos  necess�rios). */
package com.loiane.cursoJava.aula44.exe01;

public interface DimensaoSuperficial {
  //  por padr�o, os metodos de uma interface s�o p�blicos e abstratos (public abstract)
  //  interface n�o deve ter atributos, pois � uma 'classe abstrata'
  double calcularArea();
}
