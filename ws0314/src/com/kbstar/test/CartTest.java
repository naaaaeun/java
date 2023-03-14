package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImple;

public class CartTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> crudService =
				new CartCRUDServiceImple();
//		//register test
//		Cart cart = new Cart("userid2", "item_id2", 40);
//		try {
//			crudService.register(cart);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		//delete test
//		try {
//			crudService.remove("2023314550100");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		//update test

//		Cart cart = new Cart("2023314254100",99);
//		System.out.println(cart);
//		try {
//			crudService.modify(cart);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		//get all test
//		List<Cart> list = null;
//		try {
//			list = crudService.get();
//			if(list.size() == 0) {
//				System.out.println("데이터가 없습니다.");
//			}else {
//				for(Cart obj: list) {
//					System.out.println(obj);
//				}
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		//get one test
		Cart cart=null;
		try {
			cart= crudService.get("2023314254100");
			System.out.println(cart);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//끝
	}

}
