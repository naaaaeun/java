package bank;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Account acc = null;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input Command(c,w,d,q)..");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("bye...");
				break;
			} else if (cmd.equals("c")) {
				System.out.println("Create Account:");
				System.out.println("Input Account Info[name,balance]:");
				System.out.println("[name]:");
				String name = sc.next();
				System.out.println("[balance]:");
				double balance = Double.parseDouble(sc.next());
				acc = new Account(name, balance);
				System.out.println(acc.toString());
				break;
			} else if (cmd.equals("w")) {
				System.out.println("Withdraw:");
				System.out.println("Input Withdraw money:");
				double money = Double.parseDouble(sc.next());
				acc.withdraw(money);
				break;
			} else if (cmd.equals("d")) {
				System.out.println("deposit:");
				System.out.println("Input deposit money:");
				double money = Double.parseDouble(sc.next());
				acc.deposit(money);
				break;
			}

		}

		sc.close();

	}

}
