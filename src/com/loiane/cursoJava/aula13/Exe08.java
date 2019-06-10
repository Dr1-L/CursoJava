package com.loiane.cursoJava.aula13;

import java.util.Scanner;

public class Exe08 {

  public static void main(String[] args) {
    
//    Informe valor da hora trabalhada: R$ 
//    73,91
//    Informe o total de horas trabalhadas no mês: 
//    160
//    Salário: R$ 11825.599999999999
    
    Scanner scan = new Scanner(System.in);
    
    //quando trabalhar com dinheiro, usar bigdecimal
    //metodo mul
    
    System.out.println("Informe valor da hora trabalhada: R$ ");
    double valorHr = scan.nextDouble();
    
    System.out.println("Informe o total de horas trabalhadas no mês: ");
    double totalHrs = scan.nextDouble();
    
    double salario = (valorHr*totalHrs);
    System.out.println("Salário: R$ "+salario);
  }

}
