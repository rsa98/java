package br.com.fia.traveller.restaurante.Sevlet;

import java.util.ArrayList;
import java.util.List;

public class BancoRestaurantes {
	
	private static List<Restaurantes> listaRestaurante = new ArrayList <Restaurantes>();
	
	static {
		Restaurantes restaurante1 = new Restaurantes();
		restaurante1.setNome("Teatro Municipal");
		
		Restaurantes restaurante2 = new Restaurantes();
		restaurante2.setNome("Jockey Club");
		
		listaRestaurante.add(restaurante1);
		listaRestaurante.add(restaurante2);
	}

	public List<Restaurantes> getRestaurantes() {
		
		return listaRestaurante;
	}

		
}