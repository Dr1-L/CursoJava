package com.loiane.cursoJava.aula43;

import java.util.Scanner;

public class Teste {

  public static void main(String[] args) {

    double valor = 0;
    int op;
    Scanner scan = new Scanner(System.in);
    ContaBancaria contaBanc = new ContaBancaria();
    
    do {
      System.out.println("\n1)Criar Conta \t2)Sacar \t3)Depositar \t4)Consultar saldo \t5)Mostrar dados da Conta \t0-Sair");
      System.out.print("Informe a opção desejada:");
      op = scan.nextInt();

      switch (op) {
        case 0:
          System.exit(0);
          break;

        case 1:
          System.out.println("Escolha o tipo de Conta que deseja: 1-Conta Poupança \t2-Conta Especial");
          op = scan.nextInt();
          if (op == 1) {
            contaBanc.setPoupanca(true);
          } else if (op == 2) {
            contaBanc.setEspecial(true);
          }
          System.out.print("Insira o nome do cliente: ");
          contaBanc.setNomeCliente(scan.next());
          contaBanc.setNumConta(Math.round(Math.random() * 1000) + 100);
          break;

        case 2:
          System.out.print("\nDigite o valor para saque: ");
          valor = scan.nextDouble();
          boolean res = contaBanc.sacar(valor);
            if (!res) {
              System.out.println("Saldo insuficiente.");
            } else {
              System.out.println("Retire seu dinheiro.");
            }
          break;

        case 3:
          System.out.print("\nInsira o valor do depósito: ");
          valor = scan.nextDouble();
          contaBanc.depositar(valor);
          break;

        case 4:
          System.out.print("\nSaldo atual: ");
          System.out.println(contaBanc.getSaldo());
          break;

        case 5:
          System.out.print("\nMostrar dados da Conta");
          System.out.println(contaBanc.toString());
          break;

        default:
          break;
      }
    } while (op != 0);
  }
}
