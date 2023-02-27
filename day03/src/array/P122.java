package array;

import java.util.Scanner;

public class P122 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Input Command [q,i,s]");
			String cmd = sc.next();
			
			if(cmd.equals("q")) {
				System.out.println("quit..");
				break;
			}else if(cmd.equals("i")) {
				System.out.println("insert");
				System.out.println("input id");
				String id= sc.next();
				System.out.println("input pw");
				String pw= sc.next();
				System.out.println("input name");
				String name= sc.next();
				System.out.printf("id : %s pw: %d 이름: %s \n",id, pw.length(), name);
			}else if(cmd.equals("s")) {
				System.out.println("select");
			}else {
				System.out.println("invalide command..\ntry again.");
			}
		}//end while
		System.out.println("bye");
		sc.close();
	}

}
