package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO>{ 
	@Override
	public void insert(ItemDTO v) throws Exception {
		if( v.getId()==01) {
			throw new Exception("er0001");
		}
		connect();
		System.out.println(v);
		System.out.println("inserted");
		close();
	}

	@Override
	public void delete(Integer k) throws Exception { 
		if( k!=01) {
			throw new Exception("er0002");
		}
		System.out.println(k);
		System.out.println("deleted");
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if( v.getId()!=01) {
			throw new Exception("er0003");
		}
		System.out.println(v);
		System.out.println("updated");
	}

}
