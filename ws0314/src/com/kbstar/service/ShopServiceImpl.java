package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.CartDAOImpl;
import com.kbstar.dao.CustDAOimpl;
import com.kbstar.dao.ItemDAOimpl;
import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.ShopService;

public class ShopServiceImpl implements ShopService<Cust, Cart> {
	DAO<String, String, Cust> custdao;
	DAO<String, String, Item> itemdao;
	DAO<String, String, Cart> cartdao;
	
	public ShopServiceImpl() {
		custdao=new CustDAOimpl();
		itemdao=new ItemDAOimpl();
		cartdao=new CartDAOImpl();
	}

	@Override
	public Cust login(String id, String pwd) throws Exception{
		Cust cust=null;
		cust=custdao.select(id);
		if (cust!=null) {
			if(cust.getPwd().equals(pwd)) {
				System.out.println("ok");
			}else{
				throw new Exception("로그인 실패");
			}
		}else {
			throw new Exception("로그인 실패");
		}
		
		return cust;
	}

	@Override
	public void register(Cust v)throws Exception {
		try{
			custdao.insert(v);
		}catch(Exception e) {
			throw new Exception("등록 오류");
		}
		//notification.sendEmail(v.getEmail(), "등록 축하합니다");
		//notification.sendSMS(v.getContact(), "등록 축하합니다");
		
	}

	@Override
	public List<Cart> MyCart(String id) throws Exception{
		List<Cart> list=null;
		list=cartdao.search(id);
		return list;
	}

}
