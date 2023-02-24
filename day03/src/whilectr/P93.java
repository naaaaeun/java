package whilectr;

public class P93 {

	public static void main(String[] args) {
		System.out.println("start..");
		int sum = 0;
		double avr = 0;
		int i = 1;
		int cnt = 0;
		while (i <= 10) {

			if (i % 2 != 0) {
				i++;
				continue;
			}
			sum += i;
			cnt++;
			if(i==8) {
				break;
			}
			i++;
			
		}
		avr = (sum * 1.0) / cnt;
		System.out.printf("합계 : %d 평균 : %.2f\n", sum, avr);
		System.out.println("end..");
	}

}
