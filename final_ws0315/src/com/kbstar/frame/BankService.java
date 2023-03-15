package com.kbstar.frame;

import java.util.List;
/**
 * 
 * @author naeunlee
 *
 * @param <V1>
 * @param <V2>
 * @param <V3>
 * @param <K>
 * @param <P>
 */
public interface BankService<V1,V2,V3,K,P> {
	public void register(V1 v) throws Exception;
	public V1 login(K K, P p) throws Exception;
	public V1 getUserInfo(K k) throws Exception;
	public void makeAccount(K k, double balance) throws Exception;
	public List<V2> getAllAccount(K k) throws Exception;
	public List<V3> getAllTr(String acc) throws Exception;
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception;
}
