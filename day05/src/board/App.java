package board;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service();
		while (true) {
			System.out.println("Input cmd(r,rm,md,g,q)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("bye");
				break;
			} else if (cmd.equals("r")) {
				System.out.println("Input contents");
				String content = sc.next();
				service.register(content);
			} else if (cmd.equals("rm")) {
				System.out.println("Input number to remove");
				int num = Integer.parseInt(sc.next());
				service.remove(num);
			} else if (cmd.equals("md")) {
				System.out.println("Input number to update");
				int num = Integer.parseInt(sc.next());
				System.out.println("Input new content");
				String str = (sc.next());
				service.modify(num,str);
			} else if (cmd.equals("g")) {
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				System.out.println(service.get(num));
			} else {
				System.out.println("Please Input correct command");
			}
		}
		sc.close();

	}

}
