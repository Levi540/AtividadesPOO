package exercicio.poo2;

import java.util.Random;

public class Empregado extends Pessoa {

	private double valorBase;
	private boolean aposentado;
	
	public Empregado(String nomeCompleto, int idade, Estado estado, boolean aposentado) {
		super(nomeCompleto, idade, estado);
		Random r = new Random();
		this.valorBase = r.nextInt(1800 - 1000) + 1000;
		this.aposentado = aposentado;
		this.setValorAuxilio(valorBase);
	}
	
	@Override
	public double getValorAuxilio() {
		return super.getValorAuxilio();
	}

	@Override
	public void setValorAuxilio(double valorAuxilio) {
		if (aposentado) {
			super.setValorAuxilio(valorAuxilio * 1.30);
			if (this.getValorAuxilio() > 1800) {
				super.setValorAuxilio(1800);
			}
		} else {
			super.setValorAuxilio(valorAuxilio);
		}
	}

	public String verificarAposentado() {
		if (aposentado) {
			return "Usuário é aposentado então terá um acréscimo de 30%.";
		} else {
			return "Usuário não aposentado";
		}
	}
	
	public String calcularTempoBeneficio() {
		if (aposentado) {
			super.setMesesBeneficio(6);
		} else {
			super.setMesesBeneficio(3);
		}
		return " Usuario receberá o beneficio durante " + super.getMesesBeneficio() + " meses no valor de R$" + this.getValorAuxilio() + " mensais";
	}

	@Override
	public String toString() {
		String s = new String(super.retornaDadosUsuario() + " Categoria: Empregado; ");
		if (!super.verificarIdade()) {
			return s + super.toString();
		}
		return s + super.toString() + verificarAposentado() + calcularTempoBeneficio();
	}
	
}
