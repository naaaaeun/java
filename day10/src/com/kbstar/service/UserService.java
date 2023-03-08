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
	public void register(UserDTO v) throws Exception {
		System.out.println("Security check all done.");
		try {
			dao.insert(v);
		} catch (Exception e) {
			throw e;//전달만 하겠다. 아래와 같음. 그러나 로그관리 등 추가적인 액션가능
		}
		System.out.println("send mail.");
		System.out.println("send sms.");
	}

	@Override
	public void remove(String k) throws Exception { //전달만 하겠다. 위 구문과 같음. 추가액션은 어려움
		dao.delete(k);
		System.out.println("send sms.");
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("send sms.");
	}



}
