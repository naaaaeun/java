package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemSelectTest {

	public static void main(String[] args) {
		CRUDService<String, Item> crudService =
				new ItemCRUDServiceImpl();
		Item item = null;
		try {
			item = crudService.get("2023314752100");
			System.out.println(item);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}






