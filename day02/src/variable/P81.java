package variable;

import java.util.Scanner;

public class P81 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.printf("음수, 양수 또는 0을 입력 하시오");
		int a =Integer.parseInt(sc.next());
		String result=(a>0)? "정상":"비정상";
		System.out.printf("%s", result);
		sc.close();
	}

}
