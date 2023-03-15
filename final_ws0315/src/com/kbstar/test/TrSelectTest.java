package com.kbstar.test;

import com.kbstar.dto.TrDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.TrService;

public class TrSelectTest {

	public static void main(String[] args) {
		CRUDService<String, TrDTO> crudService =
				new TrService();
		TrDTO tr = null;
		try {
			tr = crudService.get("0156");
			System.out.println(tr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}






