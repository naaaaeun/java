package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	HashSet<Integer> winningNum = new HashSet<Integer>();
	double prizeMoney;

	public void makeWinningNumberMoney() { // 1~25 사이 3개 로또 생성, 당첨 금액 생성
		Random r = new Random();

		while (winningNum.size() < 3) {
			winningNum.add(r.nextInt(25) + 1);
		}

		this.prizeMoney = r.nextInt(2000000000) + 1;

		System.out.println("결정된 총 당첨금액은 " + prizeMoney + "원 입니다.");
		System.out.println(winningNum); // test를 위한 화면표출
	}

	public int checkRanking(ArrayList<Integer> myNum) { // 당첨번호와 입력번호 비교
		int cnt = 0;
		int grade = 0;

		for (int a : winningNum) {
			for (int b : myNum) {
				if (a == b) {
					cnt++;// 맞춘 숫자 있으면 count 증가
				}
			}
		} // for문 끝
		switch (cnt) {
		case 3:
			grade = 1;
			System.out.println("1등입니다");
			break; // 3개 맞춘 경우 1등
		case 2:
			grade = 2;
			System.out.println("2등입니다");
			break; // 2개 맞춘 경우 2등
		case 1:
			grade = 3;
			System.out.println("3등입니다");
			break; // 1개 맞춘 경우 3등
		default:
			grade = 0;
			System.out.println("미당첨입니다");
			break; // 맞춘게 없는 경우 등수 0
		}
		return grade;
	}

	public double prizeMoney(int grade) {
		switch (grade) {
		case 1:
			prizeMoney *= 0.5;
			break; // 3개 맞춘 경우 1등
		case 2:
			prizeMoney *= 0.3;
			break; // 2개 맞춘 경우 2등
		case 3:
			prizeMoney *= 0.2;
			break; // 1개 맞춘 경우 3등
		default:
			prizeMoney *= 0;
		}
		return prizeMoney;
	}
}
