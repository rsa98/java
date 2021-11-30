package br.com.fiap.traveller.pais;

import java.util.ArrayList;
import java.util.List;

public class BancoPais {
	
	private static List<Pais> listaPais = new ArrayList <Pais>();
	
	static {
		Pais pais1 = new Pais();
		pais1.setNome("Alemanha");
		
		Pais pais2 = new Pais();
		pais2.setNome("Brazil");
		
		listaPais.add("Alemanha");
		listaPais.add("Brazil");
	}

	public List<Pais> getEntretenimento() {
		
		return listaPais;
	}

		
}