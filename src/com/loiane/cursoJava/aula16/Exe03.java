/*Faça um programa que leia e valide as seguintes informações:
    Nome: maior que 3 caracteres;
    Idade: entre 0 e 150;
    Salário: maior que zero;
    Sexo: 'f' ou 'm';
    Estado Civil: 's', 'c', 'v', 'd'; */
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe03 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String nome = null;
    int idade = 0;
    double salario = 0;
    char sexo;
    char estCivil;

    System.out.print("Digite seu nome: ");
    nome = scan.next();

    while (nome.length() < 3) {
      System.out.println("Nome inválido. Digite novamente.");
      System.out.print("Nome: ");
      nome = scan.next();
    }

    System.out.print("Idade:");
    idade = scan.nextInt();

    while (idade <= 0 || idade > 150) {
      System.out.println("Valor inválido. Digite novamente.");
      System.out.print("Idade: ");
      idade = scan.nextInt();
    }

    System.out.print("Salário: R$ ");
    salario = scan.nextDouble();

    while (salario <= 0) {
      System.out.println("Valor inválido. Digite novamente.");
      System.out.print("Salário: ");
      salario = scan.nextDouble();
    }
    
    System.out.print("Sexo: ");
    sexo = scan.next().charAt(0);
    sexo = Character.toUpperCase(sexo);

    while (sexo != 'F' && sexo != 'M') {
      System.out.println("Valor inválido. Digite novamente.");
      System.out.print("Sexo: ");
      sexo = scan.next().charAt(0);
      sexo = Character.toUpperCase(sexo);
    }

    System.out.print("Estado civil: ");
    estCivil = scan.next().charAt(0);
    estCivil = Character.toUpperCase(estCivil);

    while (estCivil != 'S' && estCivil != 'C' && estCivil != 'D' && estCivil != 'V') {
      System.out.println("Valor inválido. Digite novamente.");
      System.out.print("Estado civil: ");
      estCivil = scan.next().charAt(0);
      estCivil = Character.toUpperCase(estCivil);
    }
  }
}
