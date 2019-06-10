package com.loiane.cursoJava.aula13;

import java.util.Scanner;

public class Exe13 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Quanto você ganha por hora trabalhada???");
    double valorHora = scan.nextDouble();

    System.out.println("Quantas horas você trabalha por mês??");
    double horasTrab = scan.nextDouble();

    double impostoDeRenda = (11 * (horasTrab * valorHora) / 100);
    double inss = (8 * (horasTrab * valorHora) / 100);
    double sindicato = (5 * (horasTrab * valorHora) / 100);
    
    double salarioLiquido = (horasTrab * valorHora);
    double descontos = impostoDeRenda + inss + sindicato;
    double salBruto = (horasTrab * valorHora) - descontos;

    System.out.println("Salario bruto: R$ " + salarioLiquido);
    System.out.println("Total de desconto INSS: R$ " + inss);
    System.out.println("Salario sindicato: R$ " + sindicato);
    System.out.println("Salario liquido: R$ " + salBruto);    
    System.out.println("Total de desconto: R$ " + sindicato);

  }
}
