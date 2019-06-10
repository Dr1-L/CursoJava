/*3. Escreva  uma  classe  para  representar  um  Aluno.  
 * Adicione  atributos   relacionados  às  caracteristicas  de  um  Aluno,  
 * como  nome,  matricula,  curso   que  está  matriculado,  nome  de  3  disciplinas  
 * que  está  cursando  e  as  notas   dessas  3  disciplinas.  
 * Desenvolva  um  método  para  verificar  se  o  aluno  está   
 * aprovado  (nota  maior  ou  igual  a  7)  em  uma  determinada  disciplina.   
 * Escreva  um  programa  para  testar  essa  classe,  que  pede  as  informações  do   
 * aluno  ao  usuário  e  ao  final  informa  o  nome  das  disciplinas,  
 * mostra  as   notas  e  mostra  se  o  aluno  foi  aprovado  ou  não. */
package com.loiane.cursoJava.aula33;

public class Aluno {
	
	private String nomeAluno;
	private String nroMatricula;
	private String cursoAluno;
	private double media;
	private boolean isAprovado;
	private String[] disciplinasAluno;
	private double[][] notasAluno;
	
	public Aluno() {
		disciplinasAluno = new String[3];
		notasAluno = new double[3][4];
	}
	
	public Aluno(String nomeAluno, String nroMatric, String curso) {
		this.nomeAluno = nomeAluno;
		this.nroMatricula = nroMatric;
		this.cursoAluno = curso;
		this.disciplinasAluno = new String[3];
		this.notasAluno = new double[3][4];
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public boolean isAprovado() {
		return isAprovado;
	}

	public void setAprovado(boolean isAprovado) {
		this.isAprovado = isAprovado;
	}

	public String[] getDisciplinasAluno() {
		return disciplinasAluno;
	}

	public void setDisciplinasAluno(String[] disciplinasAluno) {
		this.disciplinasAluno = disciplinasAluno;
	}

	public double[][] getNotasAluno() {
		return notasAluno;
	}

	public void setNotasAluno(double[][] notasAluno) {
		this.notasAluno = notasAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public void setNroMatricula(String nroMatricula) {
		this.nroMatricula = nroMatricula;
	}

	public void setCursoAluno(String cursoAluno) {
		this.cursoAluno = cursoAluno;
	}

	public double calculaMedia(int linha) {
		double soma = 0;
		for (int j = 0; j < notasAluno[linha].length; j++) {
			soma += notasAluno[linha][j];
		}
		this.media = soma/4;
		return this.media;
	}

	public boolean isAprovado(double media) {
		if (media >= 7) {
			isAprovado = true;
		} else {
			isAprovado = false;
		}
		return isAprovado;
	}
	
	public void setNomeDiscplinaPos(int pos, String nomeDisciplina) {
		this.disciplinasAluno[pos] = nomeDisciplina;
	}
	
	public void setNotasAluno(int posI, int posJ, double nota) {
		this.notasAluno[posI][posJ] = nota;
	}
}
