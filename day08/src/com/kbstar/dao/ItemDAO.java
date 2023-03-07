package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO>{ 
	@Override
	public void insert(ItemDTO v) {
		connect();
		System.out.println(v);
		System.out.println("inserted");
		close();
	}

	@Override
	public void delete(Integer k) { //정수 자료형을 참조자료형으로 저장.. 언박싱
		System.out.println(k);
		System.out.println("deleted");
	}

	@Override
	public void update(ItemDTO v) {
		System.out.println(v);
		System.out.println("updated");
	}

}
