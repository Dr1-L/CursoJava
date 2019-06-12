package com.loiane.cursoJava.aula44.exe01;

public class Circulo extends Figura2D {
  //(A = π r²).
  private double pi   = 3.14; //Math.PI
  private double raio = 0;

  public double getPi() {
    return pi;
  }

  public void setPi(double pi) {
    this.pi = pi;
  }

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  @Override
  public double calcularArea() {
    return Math.pow(raio, 2) * Math.PI;
  }
}
