package cal;

import java.util.Scanner;

public class CalUI2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("input 2 number");
		double a=Double.parseDouble(sc.next());
		double b=Double.parseDouble(sc.next());
		double result=0;
		try {
			result=Cal.div(a,b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(result);
		sc.close();
	}

}
