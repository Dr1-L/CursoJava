/*Escreva  uma  classe  para  representar  uma  lâmpada.  Desenvolva  métodos   para  ligar,  desligar  a  lampada.*/
package com.loiane.cursoJava.aula33;

public class Lampada {

	private String marca;
	private String cor;
	private int potencia;
	private boolean status = false;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPotencia() {
		return this.potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean isStatus() {
		return status;
	}

	public boolean verificarStatus() {
		return this.status;
	}

//	public boolean ligarLampada() {
//		this.status = true;
//		return this.status;
//	}
//
//	public boolean desligarLampada() {
//		this.status = false;
//		return this.status;
//	}
}
