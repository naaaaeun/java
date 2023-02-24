package ifctr;

import java.util.Scanner;

public class P93 {

	public static void main(String[] args) {
		//숫자를 4개 입력받는다
		int total=0;
		double avr=0;
		String grade="";
		
		Scanner sc = new Scanner(System.in);
		int ko=0;
		int en=0;
		int ma=0;
		int si=0;

		//단, 입력받은 숫자는 10 이상 99 이하이다.
		//만약 2자리수가 아니면 프로그램 종료
		
		System.out.println("국어성적 입력:");
		ko = Integer.parseInt(sc.next()); //ko=sc.next();는 오류남. 자료형이 다름.
		if((ko/10>9)||(ko/10<1)) {
			System.out.println("2자리 숫자로 입력하세요");
			sc.close();
			return;
		}
		System.out.println("영어성적 입력:");
		en = Integer.parseInt(sc.next());

		if((en/10>9)||(en/10<1)) {
			System.out.println("2자리 숫자로 입력하세요");
			sc.close();
			return;
		}
		System.out.println("수학성적 입력:");
		ma = Integer.parseInt(sc.next());

		if((ma/10>9)||(ma/10<1)) {
			System.out.println("2자리 숫자로 입력하세요");
			sc.close();
			return;
		}
		System.out.println("과학성적 입력:");
		si = Integer.parseInt(sc.next());

		if((si/10>9)||(si/10<1)) {
			System.out.println("2자리 숫자로 입력하세요");
			sc.close();
			return;
		}

		
		//평균과 합계를 구합니다.
		total=ko+en+ma+si;
		avr=total/4.0; //total int로 선언 시 avr=total/4.0; 로 자료형 변환 가능
		  
		if(avr>=90) {
			grade="A";
		}else if(avr>=80) {
			grade="B";
		}else if(avr>=70) {
			grade="C";
		}else if(avr>=60) {
			grade="D";
		}else{
			grade="F";
		}
		//평균이 90 이상이면 A
		//평균이 80 이상이면 B
		//평균이 70 이상이면 C
		//평균이 60 이상이면 D
		//평균이 60 미만이면 F
		
		//합계, 평균, 학점 출력
		System.out.printf("합계: %d 평균: %.2f 학점: %s",total,avr,grade);
		sc.close();
	}

}
