package ws0307;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Account a = null;
		try {
			a = new Account("one","naeun",1000.0);
		} catch (NegativeException e) {
			System.out.println(e.getMessage());
		}//계좌 생성
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Input cmd..[q,c,w,d]");
			String cmd =sc.next();
			if(cmd.equals("q")) {
				System.out.println("bye");
				break;
			}else if(cmd.equals("c")) {
				System.out.println(a);//계좌 정보 조회
			}else if(cmd.equals("w")) {
				System.out.println("How much do you want to withdraw");	//계좌 출금
				double m =Double.parseDouble(sc.next());
				try {
					System.out.println(a.withdraw(m));
				} catch (NegativeException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				} catch (InsufficientException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}else if(cmd.equals("d")) {
				System.out.println("How much do you want to deposit");	//계좌 입금
				double m =Double.parseDouble(sc.next());
				try {
					System.out.println(a.deposit(m));
				} catch (NegativeException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		sc.close();
	}

}
