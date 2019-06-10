package com.loiane.cursoJava.aula35;

public class Calculadora {

  public static int calcFatorial(double num) {
    if(num == 0) {
      return 1;
    }
    int fat = 1;
    int numInt = (int) num;
    for (int i = numInt; i > 0; i--) {
      fat *= i;
    }
    return fat;
  }
  
  //metodo recursivo
  public static int fatorial(int num){
    if(num == 0) {
      return 1;
    }
    return num*fatorial(num-1);
  }
}
