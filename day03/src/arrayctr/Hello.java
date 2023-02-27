package arrayctr;

public class aa {

	public static void main(String[] args) {
		//1~100
		//3의 배수의 합, 평균
		//4의 배수의 합, 평균
		//7의 배수의 합, 평균
		
		int cnt3=0;
		int sum3 = 0;
		double avr3 = 0;
		
		int cnt4=0;
		int sum4 = 0;
		double avr4 = 0;
		
		int cnt7=0;
		int sum7 = 0;
		double avr7 = 0;
		
		
		for (int i = 1; i <= 100; i++) {
			//3
			
			if(i%3==0) {
				sum3 += i;
				cnt3++;
			}
			if(i%4==0) {
				sum4 += i;
				cnt4++;
			}
			if(i%7==0) {
				sum7 += i;
				cnt7++;
			}
		}

		avr3 = sum3 / (cnt3*1.0);
		System.out.printf("1~100 3의 배수 합계 : %d 평균 : %.2f\n",sum3, avr3);
		avr4 = sum4 / (cnt4*1.0);
		System.out.printf("1~100 4의 배수 합계 : %d 평균 : %.2f\n",sum4, avr4);
		avr7 = sum7 / (cnt7*1.0);
		System.out.printf("1~100 7의 배수 합계 : %d 평균 : %.2f\n",sum7, avr7);
		
		
	}
	
}
