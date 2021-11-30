package br.com.fiap.traveller.entretenimento.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Entretenimento> listaEntretenimento = new ArrayList <Entretenimento>();
	
	static {
		Entretenimento entretenimento1 = new Entretenimento();
		entretenimento1.setNome("Teatro Municipal");
		
		Entretenimento entretenimento2 = new Entretenimento();
		entretenimento2.setNome("Jockey Club");
		
		listaEntretenimento.add(entretenimento1);
		listaEntretenimento.add(entretenimento2);
	}

	public List<Entretenimento> getEntretenimento() {
		
		return listaEntretenimento;
	}

		
}
