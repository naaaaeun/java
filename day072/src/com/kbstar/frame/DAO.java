package com.kbstar.frame;

public interface DAO<K,V> { //generic, k,v 는 임의로 정할 수 있음	
	public void insert(V v);
	public void delete(K k);
	public void update(V v);
}
