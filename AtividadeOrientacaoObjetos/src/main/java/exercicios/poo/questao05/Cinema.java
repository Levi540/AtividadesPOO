package exercicios.poo.questao05;

public class Cinema {
	private int id;
	private String nomeFantasia;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String numero;
	private int capacidadeLotacao;
	private int totalSalas;
	private int quantidadeSalasDisponiveis;
	private int quantidadeTelefonesDisponiveis;
	
	public Cinema(int id, String nomeFantasia, String rua, String bairro, String cidade, String estado, String numero,
			int capacidadeLotacao, int totalSalas, int quantidadeSalasDisponiveis, int quantidadeTelefonesDisponiveis) {
		super();
		this.id = id;
		this.nomeFantasia = nomeFantasia;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
		this.capacidadeLotacao = capacidadeLotacao;
		this.totalSalas = totalSalas;
		this.quantidadeSalasDisponiveis = quantidadeSalasDisponiveis;
		this.quantidadeTelefonesDisponiveis = quantidadeTelefonesDisponiveis;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getCapacidadeLotacao() {
		return capacidadeLotacao;
	}
	public void setCapacidadeLotacao(int capacidadeLotacao) {
		this.capacidadeLotacao = capacidadeLotacao;
	}
	public int getTotalSalas() {
		return totalSalas;
	}
	public void setTotalSalas(int totalSalas) {
		this.totalSalas = totalSalas;
	}
	public int getQuantidadeSalasDisponiveis() {
		return quantidadeSalasDisponiveis;
	}
	public void setQuantidadeSalasDisponiveis(int quantidadeSalasDisponiveis) {
		this.quantidadeSalasDisponiveis = quantidadeSalasDisponiveis;
	}
	public int getQuantidadeTelefonesDisponiveis() {
		return quantidadeTelefonesDisponiveis;
	}
	public void setQuantidadeTelefonesDisponiveis(int quantidadeTelefonesDisponiveis) {
		this.quantidadeTelefonesDisponiveis = quantidadeTelefonesDisponiveis;
	}
}
