package com.rp.aula.adapter.exercicio;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CacheManager {

	private static CacheManager instance = null;

	public static CacheManager getInstance() {
		if (instance == null) {
			instance = new CacheManager();
		}
		return instance;
	}

	public Set<String> set = new HashSet<String>();

	public void addToCache(String obj) {
		set.add(obj);
	}

	public String getFromCache() {
		if (!set.isEmpty()) {
			String[] str = new String[set.size()];
			set.toArray(str);
			Random r = new Random(Calendar.getInstance().getTimeInMillis());
			int i = Math.abs(r.nextInt()) % set.size();
			return str[i];
		}
		return null;
	}

}
