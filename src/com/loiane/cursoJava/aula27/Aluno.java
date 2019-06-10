/* 3. Escreva  uma  class  para  representar  um  Aluno.  
 * Adicione  atributos   relacionados  às  caracteristicas  de  um  Aluno,  
 * como  nome,  matricula,  curso   que  está  matriculado,  
 * nome  de  3  disciplinas  que  está  cursando  e  as  notas   dessas  3  disciplinas. 
 * Desenvolva  um  método  para  verificar  se  o  aluno  está   aprovado  (nota  maior  ou  igual  a  7)  
 * em  uma  determinada  disciplina.   
 * Escreva  um  programa  para  testar  essa  classe,  que  pede  as  informações  do   
 * aluno  ao  usuário  e  ao  final  informa  o  nome  das  disciplinas,  
 * mostra  as   notas  e  mostra  se  o  aluno  foi  aprovado  ou  não. */
package com.loiane.cursoJava.aula27;

public class Aluno {

  String     nomeAluno;
  String     nroMatricula;
  String     cursoAluno;
  double     media;
  boolean    isAprovado;
  String[]   disciplinasAluno = new String[3];
  double[][] notasAluno       = new double[3][4];

  String getNomeAluno() {
    return nomeAluno;
  }

  String getNroMatricula() {
    return nroMatricula;
  }

  String getCursoAluno() {
    return cursoAluno;
  }

  /*  double calculaMedia(int i) {
    
      for (int j = 0; j < notasAluno[i].length; j++) {
        double soma = +notasAluno[i][j];
        media = soma / 4;
      }
    }
    return media;
  }*/

  boolean isAprovado(double media) {
    if (media >= 7) {
      isAprovado = true;
    } else {
      isAprovado = false;
    }
    return isAprovado;
  }
}
