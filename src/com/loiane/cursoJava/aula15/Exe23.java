/*O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
                          Até 5 Kg           Acima de 5 Kg
    File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
    Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
    Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
    Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, 
    porém não há limites para a quantidade de carne por cliente. 
    Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. 
    Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e 
    gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, 
    preço total, tipo de pagamento, valor do desconto e valor a pagar. */
package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe23 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double totalPagar = 0;
    double desconto = 0;
    String tipoCarne = null;

    System.out.println("Escolha o tipo de carne comprada: \n1)Filé Duplo  2)Alcatra  3)Picanha");
    int op = scan.nextInt();

    System.out.println("Kg:");
    double kg = scan.nextDouble();

    System.out.println("Pagamento no cartão Tabajara? s/n");
    char cartao = scan.next().charAt(0);

    switch (op) {
      case 1:
        tipoCarne = "Filé Duplo";
        if (kg <= 5) {
          totalPagar = (kg * 4.90);
        } else {
          totalPagar = (kg * 5.80);
        }
        break;
      case 2:
        tipoCarne = "Alcatra";
        if (kg <= 5) {
          totalPagar = (kg * 5.90);
        } else {
          totalPagar = (kg * 6.80);
        }
        break;
      case 3:
        tipoCarne = "Picanha";
        if (kg <= 5) {
          totalPagar = (kg * 6.90);
        } else {
          totalPagar = (kg * 7.80);
        }
        break;
      default:
        System.out.println("Opção inválida.");
    }

    if (cartao == 's') {
      desconto = (totalPagar * 0.05);
      totalPagar = totalPagar - desconto;
    }
    System.out.println("::: CUPOM FISCAL :::");
    System.out.println("Tipo de carne: " + tipoCarne);
    System.out.println("Quantidade: kg " + kg);
    System.out.println("Pagamento no cartão Tabajara? " + cartao);
    System.out.println("Desconto: " + desconto);
    System.out.println("Valor total a pagar: R$" + totalPagar);
  }

}
