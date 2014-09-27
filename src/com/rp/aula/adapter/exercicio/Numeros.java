package com.rp.aula.adapter.exercicio;

public class Numeros {

	public Integer getNumero() {
		NumeroCacheAdapter adapter = new NumeroCacheAdapter();
		return adapter.getFromCache();
	}
}
