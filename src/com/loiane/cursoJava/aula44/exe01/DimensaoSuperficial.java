/* 2. Escreva  a  interface  DimensaoSuperficial  que  contém  o  método   calcularArea.  
 * Escreva  a  interface  DimensaoVolumetrica  que  contém  o   método  calcularVolume.  
 * Aplique  a  interface  DimensaoSuperficial  em   todas  as  subclasses  de  Figura2D  
 * e  Figura3D  e  aplique  a  interface   DimensaoVolumetrica  nas  subclasses  de  Figura3D,  
 * implementando  seus   métodos  de  acordo  com  as  regras  de  cada  figura  
 * geométrica  (crie  os   atributos  necessários). */
package com.loiane.cursoJava.aula44.exe01;

public interface DimensaoSuperficial {
  //  por padrão, os metodos de uma interface são públicos e abstratos (public abstract)
  //  interface não deve ter atributos, pois é uma 'classe abstrata'
  double calcularArea();
}
