package com.kbstar.frame;

public interface DAO<K,V> { //generic, k,v 는 임의로 정할 수 있음
	String IP="127.0.0.1";
	
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	default void connect() {
		System.out.println(IP+"에 접속하였습니다.");
	}
	default void close() {
		System.out.println(IP+"에 접속해제하였습니다.");
	}
}
