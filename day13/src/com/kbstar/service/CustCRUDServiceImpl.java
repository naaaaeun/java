package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import com.kbstar.dao.CustDAOimpl;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class CustCRUDServiceImpl implements CRUDService<String,Cust> {
	
	DAO<String,String,Cust> dao;

	
	public CustCRUDServiceImpl() {
		this.dao = new CustDAOimpl();
	}

	@Override
	public void register(Cust v) throws Exception {
		try {
			dao.insert(v);
		}catch(Exception e) {
			if(e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("id가 중복되었습니다.");
			}else {
				throw new Exception("시스템 장애 입니다.");
			}
		}
	}

	@Override
	public void modify(Cust v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public Cust get(String k) throws Exception {
		dao.select(k);
		return null;
	}

	@Override
	public List<Cust> get() throws Exception {
		dao.selectAll();
		return null;
	}

}
