package com.rp.aula.adapter;

public class DBAdapter implements SessionAdapter {
	
	@Override
	public void addToCache(String key, Object object) {
		DBSession session = new DBSession();
		session.setCache(key, object);
	}

}
