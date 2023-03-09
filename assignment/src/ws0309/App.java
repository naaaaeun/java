package ws0309;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lotto l = new Lotto();
		int grade = 0; // 등수
		ArrayList<Integer> myNum = new ArrayList<Integer>();

		l.makeWinningNumberMoney(); //당첨번호, 당첨금액 생성
		for (int i = 0; i < 3; i++) {
			System.out.println(i+1+"번째 예상 번호 입력");
			myNum.add(Integer.parseInt(sc.next())); 
		}//내 번호 생성
		sc.close();//스캐너 더 사용안함
		
		
		grade=l.checkRanking(myNum); //당첨됐는지 확인

		if(grade>2) {
			System.out.println("1등입니다");
		}else if(grade==2) {
			System.out.println("2등입니다");
		}else if(grade<2) {
		System.out.println("3등입니다");
		}else {
			System.out.println("미당첨입니다");
		}
		System.out.println("당첨금액은"+l.prizeMoney(grade)+"원");
	}

}
