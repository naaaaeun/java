package com.kbstar.test;

import java.nio.file.SecureDirectoryStream;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class SelectAllTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudservice=new CustCRUDServiceImpl();
		List<Cust> list=new ArrayList();
		try {
			list=crudservice.get();
			for(Cust obj:list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
