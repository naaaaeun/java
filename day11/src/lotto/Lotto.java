package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	private HashSet<Integer> winningNum;
	private double prizeMoney;

	public Lotto() {
		winningNum = new HashSet<Integer>();
	}

	public double getPrizeMoney() {
		return prizeMoney;
	}

	public void makeWinnigNumberMoney() {
		Random r = new Random();
		prizeMoney = r.nextInt(2000000000) + 1;
		while (winningNum.size() < 3) {
			int num = r.nextInt(25) + 1;
			winningNum.add(num);
		}
		System.out.println(prizeMoney);
		System.out.println(winningNum.toString());
	}

	public int checkRanking(ArrayList<Integer> myNum) throws Exception {
		int grade = 0;
		int cnt = 0;
		for (int num : myNum) {
			for (int pNum : winningNum) {
				if (num == pNum)
					cnt++;
			}
		}
		switch (cnt) {
		case 3:
			grade = 1;
			break; // 3개 맞춘 경우 1등
		case 2:
			grade = 2;
			break; // 2개 맞춘 경우 2등
		case 1:
			grade = 3;
			break; // 1개 맞춘 경우 3등
		default:
			throw new Exception("꽝");
		}
		return grade;
	}

	public double prizeMoney(int grade) {
		double pMoney = 0;
		switch (grade) {
		case 1:
			pMoney = prizeMoney * 0.7;
			break; // 3개 맞춘 경우 1등
		case 2:
			pMoney = prizeMoney * 0.2;
			break; // 3개 맞춘 경우 1등
		case 3:
			pMoney = prizeMoney * 0.1;
			break; // 3개 맞춘 경우 1등
		default:
			pMoney = 0;// 3개 맞춘 경우 1등
		}
		return pMoney;

	}

}
