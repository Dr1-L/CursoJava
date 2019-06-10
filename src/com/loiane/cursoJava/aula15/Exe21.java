/*Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
    �lcool:
    at� 20 litros, desconto de 3% por litro
    acima de 20 litros, desconto de 5% por litro
    
    Gasolina:
    at� 20 litros, desconto de 4% por litro
    acima de 20 litros, desconto de 6% por litro 
    
    Escreva um algoritmo que leia o n�mero de litros vendidos, 
    o tipo de combust�vel (codificado da seguinte forma: A-�lcool, G-gasolina),
    calcule e imprima o valor a ser pago pelo cliente sabendo-se que 
    o pre�o do litro da gasolina � R$ 2,50 
    o pre�o do litro do �lcool � R$ 1,90. */
package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe21 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double desconto = 0;
    double pagamento = 0;

    System.out.println("Escolha o combust�vel: \nA-�lcool    G-gasolina");
    char combustivel = scan.next().charAt(0);
    combustivel = Character.toUpperCase(combustivel);

    System.out.println("Quantos litros?");
    double litros = scan.nextDouble();

    switch (combustivel) {
      case 'A':
        if (litros <= 20) {
          desconto = (litros * 0.03) * 1.90;
          pagamento = (litros * 1.90);
          pagamento = pagamento - desconto;
        } else {
          desconto = desconto + ((litros * 0.05) * 1.90);
          pagamento = (litros * 1.90);
          pagamento = pagamento - desconto;
        }
        break;
      case 'G':
        if (litros <= 20) {
          desconto = (litros * 0.04) * 2.50;
          pagamento = (litros * 2.5);
          pagamento = pagamento - desconto;
        } else {
          desconto = (litros * 0.06) * 2.50;
          pagamento = (litros * 2.50) - desconto;
        }
        break;
    }
    System.out.println("Valor total: R$ " + pagamento);
    System.out.println("Desconto: " + desconto);
  }
}
