package whilectr;

public class P94 {

	public static void main(String[] args) {
		//1부터 100까지의 짝수의 합과 평균을 구하시오
		
		int cnt=0;
		int sum = 0;
		double avr = 0;
		
		System.out.println("start..");
		
		for (int i = 1; i <= 100; i++) {
			if(i%2!=0) {
				continue;
			}
			sum += i;
			cnt++;
		}
		avr = sum / (cnt*1.0);
		
		System.out.printf("합계 : %d 평균 : %.2f\n",sum, avr);
		System.out.println("end..");
	}

}
