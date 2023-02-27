package whilectr;

public class P99 {

	public static void main(String[] args) {
		//1부터 100까지의 짝수의 합과 평균을 구하시오
		
		
		myfor:
		for(int i=2;i<10;i++) {
			System.out.printf("%d단\n",i);
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d\t",i,j,(i*j));
				if((i*j)==21) {
					break myfor;
				}
			}
			System.out.println("");
		}
	}

}
