package exercicio.poo2;

import java.util.Random;

public class Desempregado extends Pessoa {
	private int mesesDesempregado;
	
	public Desempregado(String nomeCompleto, int idade, Estado estado, int mesesDesempregado) {
		super(nomeCompleto, idade, estado);
		Random r = new Random();
		super.setValorAuxilio(r.nextInt(2300 - 1500) + 1500);
		this.mesesDesempregado = mesesDesempregado;
	}
	
	@Override
	public double getValorAuxilio() {
		return super.getValorAuxilio();
	}
	
	public String definirTempoBeneficio() {
		super.setMesesBeneficio(6);
		return "Usuario receberá o beneficio durante " + super.getMesesBeneficio() + " meses no valor de R$" + this.getValorAuxilio() + " mensais";
	}

	@Override
	public String toString() {
		String s = new String(super.retornaDadosUsuario() + " Categoria: Desempregado; ");
		if (!super.verificarIdade()) {
			return s + super.toString();
		}
		return s + super.toString() + "Usuário é desempregado. " + definirTempoBeneficio();
	}
}
