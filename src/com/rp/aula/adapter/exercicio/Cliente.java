package com.rp.aula.adapter.exercicio;

public class Cliente {
	
	public static void main(String[] args) {
		NumeroCacheAdapter adapter = new NumeroCacheAdapter();
		adapter.addToCache(1);
		adapter.addToCache(2);
		adapter.addToCache(3);
		adapter.addToCache(4);
		
		System.out.println(adapter.getFromCache());
	}

}
