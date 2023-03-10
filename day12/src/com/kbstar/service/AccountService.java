package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImple;

public class AccountService implements CRUDService<String, AccountDTO> {
	DAO<String, AccountDTO> accdao;
	Notification notification;
    
	public AccountService() {
		accdao=new AccountDAO();
		notification =new NotificationImple();
	}

	@Override
	public void register(AccountDTO v) throws Exception {
		try {
			accdao.insert(v);
		}catch(Exception e) {
			System.out.println("계좌생성실패!");
		}
	}

	@Override
	public void remove(String k) throws Exception {
		try{
			accdao.delete(k);		
		}catch(Exception e) {
			throw new Exception("없는 계좌입니다. ");
		}
	}

	@Override
	public void modify(AccountDTO v) throws Exception {
		try{
			accdao.update(v);	
		}catch(Exception e) {
			throw new Exception("없는 계좌입니다. ");
		}
	}

	@Override
	public AccountDTO get(String k) throws Exception {
		AccountDTO obj=null;
		accdao.select(k);
		return obj;
	}

	@Override
	public List<AccountDTO> get() throws Exception {
		List<AccountDTO> list=null;
		list =accdao.select();
		return list;
	}

}
