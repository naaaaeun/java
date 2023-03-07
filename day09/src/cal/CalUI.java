package cal;

import java.util.Scanner;

public class CalUI {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("input 2 number");
		int a=Integer.parseInt(sc.next());
		int b=Integer.parseInt(sc.next());
		double result=0;
		try {
			result = Cal.div(a, b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		sc.close();
	}

}
