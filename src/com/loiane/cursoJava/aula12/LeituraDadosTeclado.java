package com.loiane.cursoJava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    //ler linha inteira
    System.out.println("Digite seu nome completo: ");
    String nomeCompleto = scan.nextLine();
    
    System.out.println("Seu nome é: "+nomeCompleto);
    
    //ler um tipo dado especifico
    System.out.println("\nDigite seu primerio nome:");
    //le o primeiro item digitado
    String primeiroNome = scan.next();
    System.out.println("Seu primeiro nome é: "+ primeiroNome);
    
    //ler um int
    System.out.println("\nDigite sua idade: ");
    int idade = scan.nextInt();
    System.out.println("Sua idade é: "+idade);
    
    //ler um double
    System.out.println("\nDigite sua altura");
    double altura = scan.nextDouble();
    System.out.println("Sua altura é: "+altura);

  }

}
