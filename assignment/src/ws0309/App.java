package ws0309;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Lotto l = new Lotto(); // 로또 객체 생성
		ArrayList<Integer> myNum = new ArrayList<Integer>(); // 내 번호 객체 생성
		int a = 0; // 내 번호 저장받을 변수 생성

		l.makeWinningNumberMoney(); // 당첨번호, 당첨금액 생성
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "번째 예상 번호 입력");
			try {
				a = Integer.parseInt(sc.next());
				if (a < 1 || a > 25) {
					System.out.println(MakeMessage.message(2));
					i--;
					continue;
				}
				if (myNum.contains(a)) {
					System.out.println(MakeMessage.message(3));
					i--;
					continue;
				}
				myNum.add(a);
			} catch (NumberFormatException e) {
				System.out.println(MakeMessage.message(1));
				i--;
				continue;
			}

		} // 내 번호 생성
		sc.close();// 스캐너 더 사용안함

		a=l.checkRanking(myNum); // 당첨됐는지 확인

		System.out.println("당첨금액은 " + l.prizeMoney(a) + "원");
	}

}
