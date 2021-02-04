package atividade.fev2021.aula03;

public class Leao extends Animal {
	private boolean juba;
	
	public Leao(float tamanho, String cor, boolean juba) {
		super(tamanho, cor);
		this.setJuba(juba);
	}

	public boolean isJuba() {
		return juba;
	}

	public void setJuba(boolean juba) {
		this.juba = juba;
	}
	
	public void cacar() {
		System.out.println("Caçando");
	}
}
