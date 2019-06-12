package com.loiane.cursoJava.aula44.exe01;

public class Cilindro extends Figura3D {

  private double raio;
  private double altura;
  private double pi = Math.PI;

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  @Override
  public double calcularArea() {
    double areaBase = pi * Math.pow(raio, 2);
    double areaLateral = (2 * pi * raio * altura);
    double areaTotal = 2 * areaBase + areaLateral; 
    return areaTotal;
  }

  @Override
  public double calcularVolume() {
    double volume = pi * (Math.pow(raio, 2) * altura); 
    return volume;
  }
}
