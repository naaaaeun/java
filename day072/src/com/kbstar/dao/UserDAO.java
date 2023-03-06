package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO>{ //interface에서 선언한 generic을 초기화.

	@Override
	public void insert(UserDTO v) {
		System.out.println(v.getId()+"님이 저장되었습니다.");
	}

	@Override
	public void delete(String k) {
		System.out.println(k+"님이 삭제되었습니다.");
		
	}

	@Override
	public void update(UserDTO v) {
		System.out.println(v.getId()+"님의 정보가 갱신되었습니다.");
		
	}

}
