package com.loiane.cursoJava.aula11;

public class VariaveisInteiras {

  public static void main(String[] args) {

    byte idade01 = 20;
    short idade02 = 21;
    int idade03 = 22;
    long idade04 = 23; //23l

    System.out.println("Valor varável idade01=" + idade01);
    System.out.println("Valor varável idade02=" + idade02);
    System.out.println("Valor varável idade03=" + idade03);
    System.out.println("Valor varável idade04=" + idade04);

    //ponto flutuante
    double valorPassagem = 2.90;
    float valorTomate = 3.95f;

    System.out.println("\nValor da passagem = " + valorPassagem);
    System.out.println("Valor do tomate = " + valorTomate);

    //caracter
    char o = 'o';
    char i = 'i';
    //System.out.println(o+i); Imprime 216
    //converter para char utilizando " " antes do o/i
    System.out.println("\n" + o + i);

    //boolean
    boolean verdadeiro = true;
    boolean falso = false;

    System.out.println("\nO valor de verdadeiro é " + verdadeiro);
    System.out.println("O valor de falso é " + falso);

    //literais
    int Oct31 = 031; //numero octal
    int Dec25 = 25; //numero decimal
    System.out.println("\n");
    System.out.println(Oct31 == Dec25);
  }
}