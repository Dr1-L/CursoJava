/*O cardápio de uma lanchonete é o seguinte:
    Especificação   Código  Preço
    Cachorro Quente 100     R$ 1,20
    Bauru Simples   101     R$ 1,30
    Bauru com ovo   102     R$ 1,50
    Hambúrguer      103     R$ 1,20
    Cheeseburguer   104     R$ 1,30
    Refrigerante    105     R$ 1,00

    Faça um programa que leia o código dos itens pedidos e
    as quantidades desejadas. 
    Calcule e mostre o valor a ser pago por item (preço * quantidade) 
    e o total geral do pedido. 
    Considere que o cliente deve informar quando o pedido deve ser 
    encerrado.*/
package com.loiane.cursoJava.aula16;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		
		int cod = 1;
		int qtd = 0;
		double totalItem = 0;
		double totalCompra = 0;

		while (cod != 0) {

			System.out.print("Insira o código do item: ");
			cod = scan.nextInt();

			System.out.print("Quantidade: ");
			qtd = scan.nextInt();

			if (cod == 100) {
				totalItem = qtd * 1.20;
				totalCompra += totalItem;
				System.out.println("Valor do item: " + df.format(totalItem));
			} else if (cod == 101) {
				totalItem = qtd * 1.30;
				totalCompra += totalItem;
				System.out.println("Valor do item: " + df.format(totalItem));
			} else if (cod == 102) {
				totalItem = qtd * 1.50;
				totalCompra += totalItem;
				System.out.println("Valor do item: " + df.format(totalItem));
			} else if (cod == 103) {
				totalItem = qtd * 1.20;
				totalCompra += totalItem;
				System.out.println("Valor do item: " + df.format(totalItem));
			} else if (cod == 104) {
				totalItem = qtd * 1.30;
				totalCompra += totalItem;
				System.out.println("Valor do item: " + df.format(totalItem));
			} else if (cod == 105) {
				totalItem = qtd * 1.00;
				totalCompra += totalItem;
				System.out.println("Valor do item: " + df.format(totalItem));
			}
		}
		System.out.print("Valor total do pedido: " + df.format(totalCompra));
		totalCompra = 0;
		totalItem = 0;
	}
}
