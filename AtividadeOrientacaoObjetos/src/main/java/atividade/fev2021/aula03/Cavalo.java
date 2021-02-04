package atividade.fev2021.aula03;

public class Cavalo extends Animal {
	private String raca;
	
	public Cavalo(float tamanho, String cor, String raca) {
		super(tamanho, cor);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void fugir() {
		System.out.println("Fugindo");
	}
}
