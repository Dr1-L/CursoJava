/*Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
    "Telefonou para a v�tima?"
    "Esteve no local do crime?"
    "Mora perto da v�tima?"
    "Devia para a v�tima?"
    "J� trabalhou com a v�tima?" 
    O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime. 
    Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita", 
    entre 3 e 4 como "C�mplice" e 
    5 como "Assassino". 
    Caso contr�rio, ele ser� classificado como "Inocente". */
package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe20 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int classificacao = 0;

    System.out.println("::Investiga��o Criminal:: \nResponda �s perguntas:");
    System.out.print("Telefonou para a v�tima? s/n ");
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

    System.out.print("Mora perto da v�tima? s/n ");
    char ansTres = scan.next().charAt(0);
    if (ansTres == 's') {
      classificacao += 1;
    } else {
      System.out.println("Ok...");
    }

    System.out.print("Devia para a v�tima? s/n ");
    char ansQuatro = scan.next().charAt(0);
    if (ansQuatro == 's') {
      classificacao += 1;
    } else {
      System.out.println("Ok...");
    }

    System.out.print("J� trabalhou com a v�tima? s/n ");
    char ansCinco = scan.next().charAt(0);
    if (ansCinco == 's') {
      classificacao += 1;
    } else {
      System.out.println("Ok...");
    }

    if (classificacao == 2) {
      System.out.println("Voc� � suspeito(a).");
    } else if (classificacao == 3 || classificacao == 4) {
      System.out.println("Voc� � c�mplice do crime.");
    } else if (classificacao == 5) {
      System.out.println("Voc� � o(a) assassino(a).");
    } else {
      System.out.println("Voc� � inocente.");
    }
  }

}
