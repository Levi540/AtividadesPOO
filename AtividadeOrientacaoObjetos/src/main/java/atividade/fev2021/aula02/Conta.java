package atividade.fev2021.aula02;

public class Conta {
	private String numero;
	private Pessoa titular;
	private Double saldo;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Pessoa getTitular() {
		return titular;
	}
	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public String ConsultarSaldo() {
		return "Saldo: " + this.saldo;
	}
}
