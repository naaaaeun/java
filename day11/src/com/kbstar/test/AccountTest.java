package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountService;

public class AccountTest {

	public static void main(String[] args) {
		 CRUDService<String, AccountDTO> service =new AccountService();
		 AccountDTO obj=new AccountDTO("01",10000,"james");
		 AccountDTO obj2=new AccountDTO("02",10000,"james");
		 try {
				service.register(obj);
				service.register(obj2);
				System.out.println("-----------------------");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		 
		 // get(k) test
		 try {
			//System.out.println(service.get("id01")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		 //get() test
		 List<AccountDTO> list=null;
		 try {
			 list =service.get();
			for(AccountDTO u:list) {
				System.out.println(u);
			}
			System.out.println( service.get());
		} catch (Exception e) {
			e.printStackTrace();
		}

		 //remove() test

		 try {
			 service.remove("03");
		} catch (Exception e) {
			System.out.println(e);
		}
		 //update() test
		 try {
			 service.modify(obj2);
			 System.out.println("정상 실행");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
