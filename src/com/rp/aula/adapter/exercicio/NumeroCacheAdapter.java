package com.rp.aula.adapter.exercicio;

public class NumeroCacheAdapter {

	public void addToCache(Integer valor) {
		CacheManager c = CacheManager.getInstance();
		c.addToCache(valor.toString());
	}

	public Integer getFromCache() {
		CacheManager c = CacheManager.getInstance();
		String str = c.getFromCache();
		if (str != null) {
			return Integer.parseInt(str);
		}
		return null;
	}

}
