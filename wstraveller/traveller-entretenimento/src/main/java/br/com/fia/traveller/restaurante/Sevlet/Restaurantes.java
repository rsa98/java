package br.com.fia.traveller.restaurante.Sevlet;

public class Restaurantes {
	
	private int id;
	private String nome;
	private String endereco;
	private int classificacao;
	private int telefone;
	private String site;

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


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getClassificacao() {
		return classificacao;
	}


	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public String getSite() {
		return site;
	}


	public void setSite(String site) {
		this.site = site;
	}

}
