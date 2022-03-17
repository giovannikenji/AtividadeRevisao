package br.fiap.appfilmes.filmes.model;

public class Filmes {

	private int id;
	private String nome;
	private String genero;
	private int anoLancamento;
	private String diretor;
	private String plataformaDeStreaming;
	private String classificacaoIndicativa;

	public Filmes(int id, String nome, String genero, int anoLancamento, String diretor, String plataformaDeStreaming, String classificacaoIndicativa) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.diretor = diretor;
		this.plataformaDeStreaming = plataformaDeStreaming;
		this.classificacaoIndicativa = classificacaoIndicativa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getPlataformaDeStreaming() {
		return plataformaDeStreaming;
	}

	public void setPlataformaDeStreaming(String plataformaDeStreaming) {
		this.plataformaDeStreaming = plataformaDeStreaming;
	}

	public String getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}

	public void setClassificacaoIndicativa(String classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}

}
