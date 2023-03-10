package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceImpl;

public class BankTest {
	public static void main(String[] args) {
		BankService<UserDTO, AccountDTO,TransactionDTO, String,String> service;
		service=new BankServiceImpl();
		//register
		UserDTO user = new UserDTO("id01","pwd01","name","a@naver.com","010-0000-0000");
		try {
			service.register(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//login
		String id ="id02";
		String pwd ="";
		UserDTO loginuser=null;
		try{
			loginuser=service.login(id, pwd);
			System.out.println(loginuser);
			System.out.println("login ok");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
