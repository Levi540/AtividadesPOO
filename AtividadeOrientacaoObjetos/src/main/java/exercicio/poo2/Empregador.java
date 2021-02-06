package exercicio.poo2;

public class Empregador extends Pessoa {

	private double valorBase;
	private int quantidadeFuncionarios;
	
	public Empregador(String nomeCompleto, int idade, Estado estado, int quantidadeFuncionarios) {
		super(nomeCompleto, idade, estado);
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.valorBase = 200 * quantidadeFuncionarios;
		this.setValorAuxilio(valorBase);
	}

	public String verificarQtdeFuncionarios() {
		if (quantidadeFuncionarios <= 10) {
			return "Empregador tem " + quantidadeFuncionarios + " funcionarios, receberá acréscimo de 18% do valor total.";
		}
		return "Empregador tem " + quantidadeFuncionarios + " funcionarios, não receberá acréscimo";
	}
	
	public String calcularTempoBeneficio() {
		if (quantidadeFuncionarios <= 10) {
			super.setMesesBeneficio(10);
		} else {
			super.setMesesBeneficio(7);
		}
		return " Usuario receberá o beneficio durante " + super.getMesesBeneficio() + " meses no valor de R$" + this.getValorAuxilio() + " mensais.";
	}

	@Override
	public String toString() {
		String s = new String(super.retornaDadosUsuario() + " Categoria: Empregador; ");
		if (!super.verificarIdade()) {
			return s + super.toString();
		}
		return s + super.toString() + verificarQtdeFuncionarios() + calcularTempoBeneficio();
	}

	@Override
	public double getValorAuxilio() {
		return super.getValorAuxilio();
	}

	@Override
	public void setValorAuxilio(double valorAuxilio) {
		if (quantidadeFuncionarios <= 10) {
			super.setValorAuxilio(valorAuxilio * 1.18);
		} else {
			super.setValorAuxilio(valorAuxilio);
		}
	}
}
