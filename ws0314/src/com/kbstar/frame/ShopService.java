package com.kbstar.frame;

import java.util.List;

import com.kbstar.dto.Cart;

public interface ShopService<V, C> {
	public V login(String id, String pwd) throws Exception;
	public void register(V v)throws Exception;
	public List<Cart> MyCart(String id)throws Exception;
	

}
