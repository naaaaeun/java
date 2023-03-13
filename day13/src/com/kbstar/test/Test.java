package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class Test {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudservice=new CustCRUDServiceImpl();
		Cust cust=new Cust("id11","pwd11","tom",5);
		try {
			//crudservice.remove("id11");
			//crudservice.register(cust);
			//crudservice.modify(cust);
			//crudservice.get();
			crudservice.get("id08");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
