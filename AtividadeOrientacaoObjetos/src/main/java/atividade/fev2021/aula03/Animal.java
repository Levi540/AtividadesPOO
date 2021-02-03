package atividade.fev2021.aula03;

public class Animal {
	private float tamanho;
	private String cor;
	
	public Animal(float tamanho, String cor) {
		super();
		this.tamanho = tamanho;
		this.cor = cor;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void comer() {
		
	}
}
