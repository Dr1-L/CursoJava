package com.loiane.cursoJava.aula13;

public class OperadoresAritmeticos {

  public static void main(String[] args) {
    int resultado = 1 + 2;
    System.out.println(resultado);

    resultado = resultado - 1;
    System.out.println(resultado);

    resultado = resultado * 2;
    System.out.println(resultado);
    
    resultado = resultado / 2;
    System.out.println(resultado);

    resultado = resultado + 8;
    System.out.println(resultado);

    resultado = resultado %7;
    System.out.println(resultado);
    
    //primeiro imprime a variavel e depois incrementa
    System.out.println(resultado++); //imprime 3
    
    //primeira incrementa e depois imprime
    System.out.println(++resultado); //imprime 5
    //ou resultado += 1
    
    //Operadores relacionais
    int valor1 = 1;
    int valor2 = 2;
    System.out.println("Valores "+ valor1 + " "+ valor2);
    System.out.println("valor1 == valor2: "+ (valor1 == valor2));
    System.out.println("valor1 != valor2: "+ (valor1 != valor2));
    System.out.println("valor1 > valor2: "+ (valor1 > valor2));
    System.out.println("valor1 >= valor2: "+ (valor1 >= valor2));
    System.out.println("valor1 < valor2: "+ (valor1 < valor2));
    System.out.println("valor1 <= valor2: "+ (valor1 <= valor2));
    
    //Operadores lógicos
    int valor3 = 1;
    int valor4 = 2;
    
    boolean resultado1 = (valor3 == 1) && (valor4 == 2);
    System.out.println("valor3 é 1 AND valor2 é 2: "+ resultado1);
    
    boolean resultado2 = (valor3 == 1) || (valor4 == 2);
    System.out.println("valor3 é 1 OR valor2 é 2: "+ resultado2);
    
    boolean resultado3 = (valor3 == 1) && (valor4 == 2);
    System.out.println("valor3 é 1 AND valor2 é 2: "+ resultado3);
  }
}
