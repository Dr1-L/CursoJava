/*Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual ao nome do usu�rio, 
 * mostrando uma mensagem de erro e voltando a pedir as informa��es. */
package com.loiane.cursoJava.aula16;

import java.util.Scanner;

public class Exe02 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String nome = null;
    String senha = null;

    System.out.print("Digite seu nome: ");
    nome = scan.nextLine();

    System.out.print("Digite sua senha: ");
    senha = scan.nextLine();

    while (senha.equals(nome)) {
      System.out.println("Senha inv�lida. Digite novamente.");
      System.out.print("Senha:");
      senha = scan.nextLine();

    }
  }
}
