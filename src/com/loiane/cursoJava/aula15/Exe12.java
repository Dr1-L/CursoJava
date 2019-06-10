package com.loiane.cursoJava.aula15;

import java.util.Scanner;

public class Exe12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o valor da sua hora trabalhada");
		double valorHoraTrab = scan.nextDouble();

		System.out.println("Insira o total de horas trabalhadas no mês:");
		double HrsTrab = scan.nextDouble();

		double salarioBruto = valorHoraTrab * HrsTrab;
		
		double valorImpRenda = 0;
		int percentIR = 0;
		double totalDescontos = 0;
		
		if (salarioBruto <= 900) {
			valorImpRenda = 0;
			percentIR = 0;
		} else if (salarioBruto <= 1500) {
			valorImpRenda = (salarioBruto * 5)/100;
			percentIR = 5;
		} else if (salarioBruto <= 2500) {
			valorImpRenda = (salarioBruto * 10)/100;
			percentIR = 10;
		} else if (salarioBruto > 2500) {
			valorImpRenda = (salarioBruto * 20)/100;
			percentIR = 20;
		}

		double sindicato = (salarioBruto * 3)/100;
		double fgts = (salarioBruto * 11)/100;
		totalDescontos = valorImpRenda + sindicato;
		double salarioLiquido = (salarioBruto - totalDescontos);
		
		System.out.println("Salário Bruto: (" + valorHoraTrab + " * " + HrsTrab + ")   : R$ " + salarioBruto);
		
		System.out.println("(-) IR (" + percentIR + "%)                   : R$ " + valorImpRenda);
		
		System.out.println("(-) INSS/sindicato (3%)       : R$ " + sindicato);
		
		System.out.println("FGTS (11%)                    : R$ " + fgts);
		
		System.out.println("Total de descontos            : R$ " + totalDescontos);
		
		System.out.println("Salário Liquido               : R$ " + salarioLiquido);

	}
}
