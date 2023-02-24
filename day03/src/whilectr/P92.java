package whilectr;

public class P92 {

	public static void main(String[] args) {
		System.out.println("start..");
		int cnt=0;
		int sum = 0;
		double avr = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			cnt++;
		}
		avr = sum / (cnt*1.0);
		
		System.out.printf("합계 : %d 평균 : %.2f\n", sum, avr);
		System.out.println("end..");
	}

}
