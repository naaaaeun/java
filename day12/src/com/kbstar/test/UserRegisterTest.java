package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserRegisterTest {
	public static void main(String[] args ) {
	 CRUDService<String, UserDTO> service =new UserService();
	 UserDTO obj=new UserDTO("id01","pwd01","james","ny@naver.com","010-0000-0000");
	 UserDTO obj2=new UserDTO("id02","pwd02","james","ny@naver.com","010-0000-0000");
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
	 List<UserDTO> list=null;
	 try {
		 list =service.get();
		for(UserDTO u:list) {
			System.out.println(u);
		}
		System.out.println( service.get());
	} catch (Exception e) {
		e.printStackTrace();
	}

	 //remove() test
	 try {
		service.remove("id03");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
