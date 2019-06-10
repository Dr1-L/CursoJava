package com.loiane.cursoJava.aula13;

import java.util.Scanner;

public class Exe04 {

  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Informe a primeira nota bimestral: ");
   float notab1 = scan.nextFloat();
   
   System.out.println("Informe a segunda nota bimestral: ");
   float notab2 = scan.nextFloat();
   
   System.out.println("Informe a terceira nota bimestral: ");
   float notab3 = scan.nextFloat();
   
   System.out.println("Informe a quarta nota bimestral: ");
   float notab4 = scan.nextFloat();
   
   float media = ((notab1 + notab2 + notab3 + notab4)/4);
   
   System.out.println("Notas informadas: "+ notab1 + " ,"+ notab2 +" ,"+notab3+" ,"+notab4 + "." );
   System.out.println("Média: "+ media);

  }

}
