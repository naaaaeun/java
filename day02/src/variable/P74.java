package variable;

import java.util.Random;
import java.util.Scanner;

public class P74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력 하시오(10~100)");
		String cmd = sc.next();
		//1부터 입력받은 숫자까지의 범위에서 랜덤숫자 발생하는 코드 작성
		int end= Integer.parseInt(cmd);
		Random r = new Random();
		
		System.out.println(r.nextInt(end) + 1);
		sc.close();
	}

}
