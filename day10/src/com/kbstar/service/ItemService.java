package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;

public class ItemService implements Service<Integer, ItemDTO>, SearchService{
	DAO<Integer,ItemDTO> dao; 
	
	public ItemService() {
		dao=new ItemDAO();
	}

	@Override
	public void register(ItemDTO v) throws Exception {
		System.out.println(v+"\nData check..");
		dao.insert(v);
		System.out.println("send SMS..");
	}

	@Override
	public void remove(Integer k) throws Exception  {
		System.out.println(k+"\nData check..");
		dao.delete(k);
		System.out.println("send SMS..");
	}

	@Override
	public void modify(ItemDTO v)  throws Exception {
		System.out.println(v+"\nData check..");
		dao.update(v);
		System.out.println("send SMS..");
	}

	@Override
	public void search() {
		System.out.println("search");
	}


}
