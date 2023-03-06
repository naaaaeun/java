package com.kbstar.dao;

import com.kbstar.frame.DAO;

public class UserOracleDAO implements DAO {

	@Override
	public void insert(Object obj) {
	System.out.println(obj);
	System.out.println("inserted Oracle Database");
		
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("Deleted Oracle Database");
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("updated Oracle Database");
		
	}


}
