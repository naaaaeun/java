package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.BankServiceImpl;
import com.kbstar.service.UserService;

public class App {

	public static void main(String[] args) {
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String> service = new BankServiceImpl();
		Scanner sc=new Scanner(System.in);
		while(true) {
			UserDTO user=null;
			System.out.println("Login(l) or register(r) (q)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				break;
			}else if(cmd.equals("r")) {
				System.out.println("register");
				String id =sc.next();
				String pwd =sc.next();
				String name =sc.next();
				String email =sc.next();
				String contact =sc.next();
				user = new UserDTO(id, pwd, name,email,contact);
				try {
					service.register(user);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("l")) {
				System.out.println("login");
				String id =sc.next();
				String pwd =sc.next();
				user=null;
				try {
					user=service.login(id, pwd);
					System.out.println(user);
					System.out.println("로그인 성공");
					System.out.println("welcome!");
					System.out.println("----------------");
					while(true) {
						System.out.println("menu m,t,s,i,tr,lo");
						String cmn =sc.next();
						if(cmn.equals("lo")) {
							System.out.println("log out");
							break;
						}else if(cmn.equals("m")) {
							System.out.println("make account. input start balance");
							double balance =Double.parseDouble(sc.next());
							service.makeAccount(user.getId(), balance);
							System.out.println("make account completed");
						}else if(cmn.equals("t")) {
							System.out.println("transaction");
							String senAcc=sc.next();
							String receiveAcc=sc.next();
							double balance =Double.parseDouble(sc.next());
							String desc=sc.next();
							service.transaction(senAcc, receiveAcc, balance, desc);
							System.out.println("transaction completed");
							
						}else if(cmn.equals("a")) {
							System.out.println("select account");
							
						}else if(cmn.equals("i")) {
							System.out.println("user info");
							String rid=user.getId();
							UserDTO ruser=service.getUserInfo(rid);
							System.out.println(ruser);
						}else if(cmn.equals("tr")) {
							System.out.println("select transaction");
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		sc.close();
	}

}
