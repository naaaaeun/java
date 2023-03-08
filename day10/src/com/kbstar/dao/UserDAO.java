package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO>{ //interface에서 선언한 generic을 초기화.

	@Override
	public void insert(UserDTO v) throws Exception {
		if( v.getId().equals("id01")) {
			throw new Exception("er0004");
		}
		System.out.println( v+"님이 저장되었습니다.");
	}

	@Override
	public void delete(String k) throws Exception {
		if(k.equals("id01")) {
			System.out.println(k+"님이 삭제되었습니다.");
		}else {
			throw new Exception("er0005");
		}

		
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if( v.getId().equals("id01")) {
			System.out.println(v.getId()+"님의 정보가 갱신되었습니다.");
		}else {
			throw new Exception("er0006");
		}

		
	}

}
