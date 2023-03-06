package db;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		DAO dao = new MariaDBDAO();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("input command(q,i,d,u)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("bye");
				break;
			} else if (cmd.equals("i")) {
				System.out.println("Input ID..");
				String id = sc.next();
				System.out.println("Input PW..");
				String pwd = sc.next();
				System.out.println("Input NAME..");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				dao.insert(user);

			} else if (cmd.equals("d")) {
				System.out.println("Input ID to delete..");
				String id = sc.next();
				dao.delete(id); // ??? 클래스 안의 id로 해당 클래스 선택?

			} else if (cmd.equals("u")) {
				System.out.println("Input ID..");
				String id = sc.next();
				System.out.println("Input PW..");
				String pwd = sc.next();
				System.out.println("Input NAME..");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				dao.update(user);

			}
		}
		sc.close();
	}

}
