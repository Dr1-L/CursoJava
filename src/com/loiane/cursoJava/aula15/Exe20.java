/*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
    "Telefonou para a vítima?"
    "Esteve no local do crime?"
    "Mora perto da vítima?"
    "Devia para a vítima?"
    "Já trabalhou com a vítima?" 
    O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
    Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", 
    entre 3 e 4 como "Cúmplice" e 
    5 como "Assassino". 
    Caso contrário, ele será classificado como "Inocente". */
package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe20 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int classificacao = 0;

    System.out.println("::Investigação Criminal:: \nResponda às perguntas:");
    System.out.print("Telefonou para a vítima? s/n ");
    char ansUm = scan.next().charAt(0);

    if (ansUm == 's') {
      classificacao += 1;
    } else {
      System.out.println("Ok...");
    }

    System.out.print("Esteve no local do crime? s/n ");
    char ansDois = scan.next().charAt(0);
    if (ansDois == 's') {
      classificacao += 1;
    } else {
      System.out.println("Ok...");
    }

    System.out.print("Mora perto da vítima? s/n ");
    char ansTres = scan.next().charAt(0);
    if (ansTres == 's') {
      classificacao += 1;
    } else {
      System.out.println("Ok...");
    }

    System.out.print("Devia para a vítima? s/n ");
    char ansQuatro = scan.next().charAt(0);
    if (ansQuatro == 's') {
      classificacao += 1;
    } else {
      System.out.println("Ok...");
    }

    System.out.print("Já trabalhou com a vítima? s/n ");
    char ansCinco = scan.next().charAt(0);
    if (ansCinco == 's') {
      classificacao += 1;
    } else {
      System.out.println("Ok...");
    }

    if (classificacao == 2) {
      System.out.println("Você é suspeito(a).");
    } else if (classificacao == 3 || classificacao == 4) {
      System.out.println("Você é cúmplice do crime.");
    } else if (classificacao == 5) {
      System.out.println("Você é o(a) assassino(a).");
    } else {
      System.out.println("Você é inocente.");
    }
  }

}
