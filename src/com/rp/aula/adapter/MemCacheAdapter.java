package com.rp.aula.adapter;

public class MemCacheAdapter implements SessionAdapter {
	
	@Override
	public void addToCache(String key, Object object) {
		MemCacheSession session = new MemCacheSession();
		session.put(key, object);
	}
}
