package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemRemoveTest {

	public static void main(String[] args) {
		CRUDService<String, Item> service =new ItemCRUDServiceImpl();
		try {
			service.remove("2023314247100");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
