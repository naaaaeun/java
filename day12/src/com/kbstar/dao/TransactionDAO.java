package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;

public class TransactionDAO implements DAO<String, TransactionDTO>{

	HashMap<String, TransactionDTO> db;
	
	public TransactionDAO() {
		
		db = new HashMap<String, TransactionDTO>();
	}
	
	@Override
	public void insert(TransactionDTO v) throws Exception {
		if(db.containsKey(v.getDate())) {
			throw new Exception("DB Error");
		}
		db.put(v.getDate(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		
	}

	@Override
	public void update(TransactionDTO v) throws Exception {
			
	}

	@Override
	public TransactionDTO select(String k) {
		TransactionDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<TransactionDTO> select() {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		Collection<TransactionDTO> col =  db.values();
		for(TransactionDTO obj: col) {
			list.add(obj);
		}
		return list;
	}
	//고객이 보유하고 있는 계좌번호를 넣으면 해당 계좌의 거래내역을 반환한다.
	@Override
	public List<TransactionDTO> search(Object obj) throws Exception {
		List<TransactionDTO> list=new ArrayList<TransactionDTO>(); 
		Collection<TransactionDTO> col=db.values();
		
		for(TransactionDTO tr:col) {
			if((tr.getAccNo()).equals(obj)) {
				list.add(tr);	
			}
		}
		return list;
	}

}