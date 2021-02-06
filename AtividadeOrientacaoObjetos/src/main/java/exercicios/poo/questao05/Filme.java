package exercicios.poo.questao05;

public class Filme {
	private String tituloOriginal;
	private String tituloPortugues;
	private String genero;
	private int duracao;
	private int faixaEtaria;
	private String paisOrigem;
	private String informacoes;
	private String tipoExibicao;
	private Diretor diretor;
	
	
	public Filme(String tituloOriginal, String tituloPortugues, String genero, int duracao, int faixaEtaria,
			String paisOrigem, String informacoes, String tipoExibicao, Diretor diretor) {
		super();
		this.tituloOriginal = tituloOriginal;
		this.tituloPortugues = tituloPortugues;
		this.genero = genero;
		this.duracao = duracao;
		this.faixaEtaria = faixaEtaria;
		this.paisOrigem = paisOrigem;
		this.informacoes = informacoes;
		this.tipoExibicao = tipoExibicao;
		this.diretor = diretor;
	}
	
	public String getTituloOriginal() {
		return tituloOriginal;
	}
	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}
	public String getTituloPortugues() {
		return tituloPortugues;
	}
	public void setTituloPortugues(String tituloPortugues) {
		this.tituloPortugues = tituloPortugues;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public String getInformacoes() {
		return informacoes;
	}
	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}
	public String getTipoExibicao() {
		return tipoExibicao;
	}
	public void setTipoExibicao(String tipoExibicao) {
		this.tipoExibicao = tipoExibicao;
	}
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
}
