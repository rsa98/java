package br.com.fiap.traveller.hospedagem;

import java.util.ArrayList;
import java.util.List;

public class BancoHospedagem {
	
	private static List<hospedagem> listaHospedagem = new ArrayList <hospedagem>();
	
	static {
		hospedagem hospedagem1 = new hospedagem();
		hospedagem1.setNome("Hotel Atlântico Travel Copacabana");
		
		hospedagem hospedagem2 = new hospedagem();
		hospedagem2.setNome("Leonardo Royal Hotel Frankfurt");
		
		listaHospedagem.add("Hotel Atlântico Travel Copacabana");
		listaHospedagem.add("Leonardo Royal Hotel Frankfurt");
	}

	public List<hospedagem> getHospedagem() {
		
		return listaHospedagem;
	}

		
}