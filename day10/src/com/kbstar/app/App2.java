package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;

import bank.MakeMessage;

public class App2 {

	public static void main(String[] args) {
		Service<Integer, ItemDTO> s=new ItemService();
		SearchService search=new ItemService();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("input command(q,i,d,u,s)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("bye");
				break;
			} else if(cmd.equals("s")) {
				search.search();
			}else if (cmd.equals("i")) {
				System.out.println("Input ID..");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME..");
				String name = sc.next();
				System.out.println("Input price..");
				double price=Double.parseDouble(sc.next());
				System.out.println("Input quantity..");
				int qt = Integer.parseInt(sc.next());
				ItemDTO item = new ItemDTO(id, name, price,qt);
				try {
					s.register(item);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
				}

			} else if (cmd.equals("d")) {
				System.out.println("Input ID to delete..");
				try {
					int id = Integer.parseInt(sc.next());
					s.remove(id); 
				}catch(Exception e) {
					System.out.println("int only");
				}

			} else if (cmd.equals("u")) {
				System.out.println("Input ID..");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME..");
				String name = sc.next();
				System.out.println("Input price..");
				double price=Double.parseDouble(sc.next());
				System.out.println("Input quantity..");
				int qt = Integer.parseInt(sc.next());
				ItemDTO item = new ItemDTO(id, name, price,qt);
				try {
					s.modify(item);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
				}

			}
		}
		sc.close();
	}

}
