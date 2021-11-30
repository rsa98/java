package br.com.fiap.traveller.hospedagem;

public class hospedagem {
	
	private int idHotel;
	private String nomeHotel;
	private String endereco;
	private int classificacao;
	private int telefone;
	private String site;

	public hospedagem (int idHotel, String nomeHotel, String endereco, int classificacao, int telefone, String site) {
		this.idHotel = idHotel;
		this.nomeHotel = nomeHotel;
		this.endereco = endereco;
		this.classificacao = classificacao;
		this.telefone = telefone;
		this.site = site;		
	}


	public int getId() {
		return idHotel;
	}


	public void setId(int id) {
		this.idHotel = idHotel;
	}


	public String getNome() {
		return nomeHotel;
	}


	public void setNome(String nome) {
		this.nomeHotel = nomeHotel;
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
