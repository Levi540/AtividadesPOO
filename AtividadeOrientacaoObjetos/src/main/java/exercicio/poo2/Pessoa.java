package exercicio.poo2;

public abstract class Pessoa {
	private String nomeCompleto;
	private int idade;
	private Estado estado;
	private int mesesBeneficio;
	private double valorAuxilio;
	
	public Pessoa(String nomeCompleto, int idade, Estado estado) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
		this.estado = estado;
	}

	public double getValorAuxilio() {
		return valorAuxilio;
	}

	public void setValorAuxilio(double valorAuxilio) {
		this.valorAuxilio = valorAuxilio;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public int getidade() {
		return idade;
	}

	public void setidade(int idade) {
		this.idade = idade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getMesesBeneficio() {
		return mesesBeneficio;
	}

	public void setMesesBeneficio(int mesesBeneficio) {
		this.mesesBeneficio = mesesBeneficio;
	}
	
	public boolean verificarIdade() {
		return getidade() >= 18 ? true : false;
	}
	
	public String retornaDadosUsuario() {
		return "Nome completo: " + getNomeCompleto() + " Idade: " + getidade();
	}

	@Override
	public String toString() {
		return verificarIdade() ? "Usuário é maior de idade, " : "Usuário menor de idade, portanto não receberá o benefício.";
	}
}
