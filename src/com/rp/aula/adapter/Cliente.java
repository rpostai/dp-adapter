package com.rp.aula.adapter;

public class Cliente {
	
	public static void main(String[] args) {
		SessionAdapter adapter = new DBAdapter();
		adapter.addToCache("A", "B");
		
		adapter = new MemCacheAdapter();
		adapter.addToCache("A", "B");
		
	}

}
