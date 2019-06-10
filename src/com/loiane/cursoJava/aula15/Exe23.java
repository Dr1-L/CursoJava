/*O Hipermercado Tabajara est� com uma promo��o de carnes que � imperd�vel. Confira:
                          At� 5 Kg           Acima de 5 Kg
    File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
    Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
    Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
    Para atender a todos os clientes, cada cliente poder� levar apenas um dos tipos de carne da promo��o, 
    por�m n�o h� limites para a quantidade de carne por cliente. 
    Se compra for feita no cart�o Tabajara o cliente receber� ainda um desconto de 5% sobre o total da compra. 
    Escreva um programa que pe�a o tipo e a quantidade de carne comprada pelo usu�rio e 
    gere um cupom fiscal, contendo as informa��es da compra: tipo e quantidade de carne, 
    pre�o total, tipo de pagamento, valor do desconto e valor a pagar. */
package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe23 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double totalPagar = 0;
    double desconto = 0;
    String tipoCarne = null;

    System.out.println("Escolha o tipo de carne comprada: \n1)Fil� Duplo  2)Alcatra  3)Picanha");
    int op = scan.nextInt();

    System.out.println("Kg:");
    double kg = scan.nextDouble();

    System.out.println("Pagamento no cart�o Tabajara? s/n");
    char cartao = scan.next().charAt(0);

    switch (op) {
      case 1:
        tipoCarne = "Fil� Duplo";
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
        System.out.println("Op��o inv�lida.");
    }

    if (cartao == 's') {
      desconto = (totalPagar * 0.05);
      totalPagar = totalPagar - desconto;
    }
    System.out.println("::: CUPOM FISCAL :::");
    System.out.println("Tipo de carne: " + tipoCarne);
    System.out.println("Quantidade: kg " + kg);
    System.out.println("Pagamento no cart�o Tabajara? " + cartao);
    System.out.println("Desconto: " + desconto);
    System.out.println("Valor total a pagar: R$" + totalPagar);
  }

}
