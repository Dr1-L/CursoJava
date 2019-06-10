package com.loiane.cursoJava.aula13;

import java.util.Scanner;

public class Exe14 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o tamanho do arquivo (em MB): ");
    double tamanho = scan.nextDouble();

    System.out.println("Velocidade (em Mbps): ");
    double velocidade = scan.nextDouble();
//    double tempoEstimado = (tamanho / velocidade) / 60;
//    System.out.println("Tempos estimado de download: " + tempoEstimado + " minutos.");
    
    tamanho = tamanho * 8;
    double tempoEstimado = (tamanho / velocidade) / 60;
    double resto = (tamanho / velocidade) % 60;
    
    int minutos = (int) tempoEstimado;
    int segundos = (int) resto;
    
    System.out.println("Tempos estimado de download: " + minutos + " minutos e " + segundos + " segundos.");
  }
}
