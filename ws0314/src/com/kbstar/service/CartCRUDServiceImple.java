package com.kbstar.service;

import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CartDAOImpl;
import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeNumber;

public class CartCRUDServiceImple implements CRUDService<String, Cart> {
	DAO<String, String, Cart> dao;

	public CartCRUDServiceImple() {
		dao = new CartDAOImpl();
	}

	@Override
	public void register(Cart v) throws Exception {
		try {
			String id = MakeNumber.makeItemNum();
			v.setId(id);
			dao.insert(v);
			System.out.println("등록 성공");
		} catch (Exception e) {
			throw new Exception("시스템 장애 입니다.");

		}

	}

	@Override
	public void modify(Cart v) throws Exception {
		try {
			dao.update(v);
			System.out.println("변경 성공");
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			}else {
				throw new Exception("해당 ID가 존재 하지 않습니다.");
			}
		}		
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
			System.out.println("삭제성공");
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			}else {
				throw new Exception(k+"는 존재하지 않는 id 입니다.");
			}
		}

	}

	@Override
	public Cart get(String k) throws Exception {
		Cart cart= null;
		try {
			cart=dao.select(k);
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애 입니다.");
			}else {
				throw new Exception("ID가 존재 하지 않습니다.");
			}			
		}
		return cart;
	}

	@Override
	public List<Cart> get() throws Exception {
		List<Cart> list= null;
		try {
			list=dao.selectAll();
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애 입니다.");
			}			
		}
		return list;
	}

}
