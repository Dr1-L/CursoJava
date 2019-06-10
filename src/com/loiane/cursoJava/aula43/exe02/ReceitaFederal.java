package com.loiane.cursoJava.aula43.exe02;

import java.util.Scanner;

public class ReceitaFederal {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    PessoaFisica[] pf = new PessoaFisica[1];
    PessoaJuridica[] pj = new PessoaJuridica[1];
    
    double valor = 0;
    
    PessoaJuridica pessoaJur = new PessoaJuridica();

    System.out.println("** Cadastro de PJ **");
    for(int i = 0; i < pf.length; i++) {
      System.out.print("Digite o nome do contribuinte PJ "+(i+1)+": ");
      pessoaJur.setNome(scan.next());
      
      System.out.print("Renda Bruta: " + ": ");
      pessoaJur.setRendaBruta(scan.nextDouble());
      pj[i] = pessoaJur;
    }
    
    PessoaFisica pessoaFis = new PessoaFisica();
    
    System.out.println("** Cadastro de PF **");
    for(int i = 0; i < pf.length; i++) {
      System.out.print("Digite o nome do contribuinte PF "+(i+1)+": ");
      pessoaFis.setNome(scan.next());
      
      System.out.print("Renda Bruta: " + ": ");
      pessoaFis.setRendaBruta(scan.nextDouble());
     
      pf[i] = pessoaFis;
    }
    
    for (PessoaJuridica psj : pj) {
      System.out.println(psj.toString());
//      System.out.println(psj.getNome());
//      System.out.println(psj.getRendaBruta());
//      System.out.println(psj.calcularImposto());
    }
    }
  }
