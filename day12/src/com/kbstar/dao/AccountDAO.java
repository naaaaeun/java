package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;

public class AccountDAO implements DAO<String, AccountDTO> {
	HashMap<String, AccountDTO> db;	

	public AccountDAO() {
		db=new HashMap<String, AccountDTO>();
	}

	@Override
	public void insert(AccountDTO v) throws Exception {
		if(db.containsKey(v.getAccNo())) {
			throw new Exception("ex");
		}
		db.put(v.getAccNo(), v);
		
	}

	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("delete exception");
		}
		db.remove(k);
	}

	@Override
	public void update(AccountDTO v) throws Exception {
		if(!db.containsKey(v.getAccNo())) {
			throw new Exception("delete exception");
		}
		db.put(v.getAccNo(), v);
	}

	@Override
	public AccountDTO select(String k) {
		AccountDTO obj=null;
		obj=db.get(k);
		return obj;
	}

	@Override
	public List<AccountDTO> select() {
		List<AccountDTO> list=new ArrayList<AccountDTO>();
		Collection<AccountDTO> col= db.values();
		for(AccountDTO obj:col) {
			list.add(obj);
		}
		return list;
	}
	//사용자의 계좌 조회
	//obj= 사용자의 id;
	@Override
	public List<AccountDTO> search(Object obj) throws Exception {
		
		return null;
	}

}
