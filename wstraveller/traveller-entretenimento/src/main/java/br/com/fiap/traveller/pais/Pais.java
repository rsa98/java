package br.com.fiap.traveller.pais;

public class Pais {
	
	private int idPais;
	private String pais;
	private String capital;
	private String continente;
	
	public Pais (int idPais, String capital, String continente, String pais) {
		this.idPais = idPais;
		this.capital = capital;
		this.continente = continente;
		this.pais = pais;
	}
	public int getIdPais() {
		return idPais;
	}
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getContinente() {
		return continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
	public void setNome(String nome) {
		this.pais = pais;
	}

}