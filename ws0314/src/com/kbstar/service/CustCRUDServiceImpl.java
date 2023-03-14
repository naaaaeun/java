package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CustDAOimpl;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class CustCRUDServiceImpl implements CRUDService<String, Cust> {

	DAO<String, String, Cust> dao;

	public CustCRUDServiceImpl() {
		this.dao = new CustDAOimpl();
	}

	@Override
	public void register(Cust v) throws Exception {
		try {
			dao.insert(v);
		} catch (Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("id가 중복되었습니다.");
			} else {
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
		try {
			System.out.println(dao.select(k));
			return dao.select(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			} else {
				System.out.println("존재하지 않는 id입니다.");
			}
			return null;
		}

	}

	@Override
	public List<Cust> get() throws Exception {
		try {
			return dao.selectAll();
		}catch(Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			} else {
				System.out.println("존재하지 않는 id입니다.");
			}
			return null;
		}
	}

}
