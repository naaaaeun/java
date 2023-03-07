package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service<String, UserDTO> {
	
	DAO<String, UserDTO> dao;
	
	public UserService() {
		dao=new UserDAO();
	}

	@Override
	public void register(UserDTO v) {
		System.out.println("Security check all done.");
		dao.insert(v);
	}

	@Override
	public void remove(String k) {
		dao.delete(k);
	}

	@Override
	public void modify(UserDTO v) {
		dao.update(v);
	}



}
