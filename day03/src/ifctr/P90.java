package ifctr;

public class P90 {

	public static void main(String[] args) {
		int a=60;
		int b=50;
		int c=30;
		
		int max=0;
		int min=0;
		
		
		
		if(a>b) {
			max=a;
			min=b;
			if(a>c) {
				max=c;
			}else {
				if(b>c){
				min=c;
				}
			}
		}else {
			max=b;
			min=a;
			if(b<c) {
				max=c;
			}else {
				if(a>c){
				min=c;
				}
			}
			
		} //  나중에 손보기

		max=(a>b)?((a>c)? a:c):((b>c)? b:c);
		min=(a<b)?((a<c)? a:c):((b<c)? b:c);
		
		if(a>b) {
			max=Math.max(c, a);
			min=Math.min(c, b);
		}else {
			max=Math.max(b, c);
			min=Math.min(b, a);
		}
		

		System.out.printf("최대값은 %d 최소값은 %d",max,min);
	}

}
