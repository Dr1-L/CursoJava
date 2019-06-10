package com.loiane.cursoJava.aula33;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.print("Informe o nome do Aluno: ");
		aluno.setNomeAluno(scan.next());
		
		System.out.print("Informe o curso do Aluno: ");
		aluno.setCursoAluno(scan.next());

		System.out.print("Informe a matrícula do Aluno: ");
		aluno.setNroMatricula(scan.next());

		System.out.println("Informe o nome das 3 disciplinas que o aluno esta cursando.");
		for (int i = 0; i < aluno.getDisciplinasAluno().length; i++) {
			System.out.print("\nNome da disciplina: ");
			aluno.setNomeDiscplinaPos(i, scan.next());

			System.out.println("Agora informe as notas: ");
			for (int j = 0; j < aluno.getNotasAluno()[i].length; j++) {
				System.out.print("Informe a nota " + (j + 1) + " ");
				aluno.setNotasAluno(i, j, scan.nextDouble());
			}
		}

		for (int i = 0; i < aluno.getDisciplinasAluno().length; i++) {
			System.out.print("\n" + aluno.getDisciplinasAluno()[i] + ": ");
			double nota = aluno.calculaMedia(i);

			if (aluno.isAprovado(nota)) {
				System.out.println(nota + ". Aprovado.");
			} else {
				System.out.println(nota + ". Reprovado.");
			}
		}

	}

}
